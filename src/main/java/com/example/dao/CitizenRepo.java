package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Citizen;
import com.example.entity.User;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen,Integer> {
	
//	@Query("select u from User u where u.email=?1 and u.password=?2 ")
//	public User findUser(String uname, String pwd);
	
//	@Modifying
//	@Query("update Citizen c set c.status=?2 where c.mobile=?1 ")
//	public Citizen updateStatus(String mobile,String status);
	
	@Query("select c from Citizen c where c.mobile=?1")
	public Citizen findCitizenByMobile(String mobile);
	

}
