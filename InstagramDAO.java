package com.xworkz.instagram.dao;

import java.util.List;

import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.spectshop.spects.dto.SpectsDTO;

public interface InstagramDAO {

	
	public void save(InstagramDTO instagramDTO);
	public InstagramDTO getAllStories(InstagramDTO instagramDTO);
	public void updatePasswordByName(String name,String password);
	public void deleteUserById(int id,String name);
	
	
	public InstagramDTO getAllDetailsOfInstaById(int id);
	public String getStoryByName(String name);
	public Object[] getAccountTypeAndNameById(int id);
	public List getPasswordAndNameById(int id);
	
	
	
}
