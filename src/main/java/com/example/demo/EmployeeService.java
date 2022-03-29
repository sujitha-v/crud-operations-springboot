package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Person> empList= new ArrayList<>(Arrays.asList(
			new Person("sujitha","vemula","1",34,"manager"),
			new Person("saanvi","vemula","2",43,"developer"),
			new Person("krishna","vemula","3",56,"manager")
			
));
	public List<Person> getEmpInfo() {
		return empList;
	}
	public void save(Person person) {
		
		 empList.add(person);
	}
	
	public Person getById(String id) {
		return empList.stream().filter(e->e.getId().equals(id)).findFirst().get();
	}
	public List<Person> getByAge(String id)
	{
		List<Person> elist= empList.stream().filter(e->"manager".equalsIgnoreCase(e.getDesignation())&& e.getAge() > 40).collect(Collectors.toList());
		elist.forEach(f->System.out.println("designation:" +f.getDesignation() +"age is" +f.getAge() ));
		return elist;
	}
	public Person updateUser(Person person, long id) {
		int counter=0;
		for(Person p1:empList)
		{
			if(p1.getId().equals(person.getId()))
			{
				empList.set(counter, person);
			}
			counter++;
		}
		return null;
	}
	public void delete(String id) {

		empList.removeIf(e->e.getId().equals(id));
	}	
}
