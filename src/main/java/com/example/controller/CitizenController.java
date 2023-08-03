package com.example.controller;

import java.util.*;
import java.util.Map;
import java.util.Random;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Citizen;
import com.example.entity.User;
import com.example.service.CitizenService;
import com.example.service.UserService;

@RestController
@CrossOrigin(origins="*")
public class CitizenController {
	
	@Autowired
	CitizenService service;
	
	@PostMapping("/registeraadhar")
	public String addUser(@RequestBody Citizen citizen) {
		
		Citizen c=service.saveCitizen(citizen);
		if(c!=null) {
			return "Hi " +citizen.getName()+", new aadhar card has been requested successfully";
		}
		else
		{
			return "Hi " +citizen.getName()+", you aadhar request has ben failed ! Try again";
		}
	
	}
	
	@GetMapping("/getAllCitizens")
	public List<Citizen> findAllCitizens()
	{
		return service.getallcitizens();
	}
	
	@PutMapping("/updateStatusByMobile")
	public Citizen updateAadharStatus(@RequestBody Map<String, String> request)
	{
		String mobile = request.get("mobile");
	    String status = request.get("status");
	    
	    Citizen c=service.getCitizenByMobile(mobile);
	    c.setStatus(status);
	    if(status.equals("Approve"))
	    {
	    	c.setAadharno(generateRandom12DigitsNumber());
	    }
	    else if(status.equals("Rejected"))
	    {
	    	c.setAadharno("Cannot be Assigned");
	    }
	    return service.saveCitizen(c);
        
	   
	}
	@GetMapping("/getAadharByMobileNumber")
	public Citizen getaadhar(@RequestParam String mobile)
	{
		System.out.println(mobile);
	    
	    Citizen c=service.getCitizenByMobile(mobile);
	 
	    return c;
        
	   
	}
	@PutMapping("/updateAadharCard")
	public Citizen updateAadharCard(@RequestBody Map<String, String> request)
	{
		
		String mobileold = request.get("mobileToUpdate");
	    String newMobileNo = request.get("newMobile");
	    String newAddress = request.get("newAddress");
	    String newDob= request.get("newDob");
	    
	    String pattern = "yyyy-MM-dd";

       
	    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	    Date date=null;
        try {
            date = sdf.parse(newDob);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
          
        }
	    System.out.println(mobileold+ " "+newMobileNo+" "+newAddress+" "+newDob);
	    
	    
	    Citizen c=service.getCitizenByMobile(mobileold);
	    c.setStatus("Pending");
	    c.setMobile(newMobileNo);
	    c.setAddress(newAddress);
	    c.setDob(date);
	    return service.saveCitizen(c);   
	    
	   
	}
	
	
	
	
	@DeleteMapping("/deleteCitizenById/{id}")
	public void deleteCitizen(@PathVariable int id) {
		System.out.println(id);
		service.deleteCitizen(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public static String generateRandom12DigitsNumber() {
	        Random random = new Random(); 
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 12; i++) {
	            int digit = random.nextInt(10); // Generate a random digit between 0 and 9
	            sb.append(digit);
	        }
	        return sb.toString();
	    }
	

}
