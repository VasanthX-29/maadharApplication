package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CitizenRepo;
import com.example.dao.UserRepo;
import com.example.entity.Citizen;
import com.example.entity.User;

@Service
public class CitizenService {
	
	@Autowired
	CitizenRepo repo;
	
	
	public Citizen saveCitizen(Citizen c)
	{
		return repo.save(c);
	}
	
	public List<Citizen> getallcitizens()
	{
		return repo.findAll();
	}
	
	public Citizen getCitizenByMobile(String mobile)
	{
		return repo.findCitizenByMobile(mobile);
	}
	
	public void deleteCitizen(int id)
	{
		repo.deleteById(id);
	}
	
//	@Transactional
//	public Citizen updateRequestStatus(String mobile, String status)
//	{
//		return repo.updateStatus(mobile, status);
//	}

}
