package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService eService;
	
	@GetMapping("/employees/all")
	public List<Person> getEmployeeDetails()
	{
		return eService.getEmpInfo();	
	}
	
	@PostMapping("/employees/create")
	public void createEmployee(@RequestBody Person person)
	{
		 eService.save(person);
		
	}
	
	@GetMapping("/employees/{id}")
	public Person getEmpById(@PathVariable(value="id") String id)
	{
		return eService.getById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public Person updateEmployee(@RequestBody Person person, @PathVariable("id") long id)
	{
		return eService.updateUser(person,id);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable("id") String id)
	{
		eService.delete(id);
	
	}
	
	
	
}
