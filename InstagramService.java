package com.xworkz.instagram.service;

import java.util.List;

import com.xworkz.instagram.dto.InstagramDTO;

public interface InstagramService {

	public void validateAndSave(InstagramDTO instagramDTO);
	public InstagramDTO getAllStories(InstagramDTO instagramDTO);
	public void updatePasswordByName(String name,String password);
	public void deleteUserById(int id,String name);
	
	
	public InstagramDTO getAllDetailsOfInstaById(int id);
	public String getStoryByName(String name);
	public Object[] getAccountTypeAndNameById(int id);
	public List getPasswordAndNameById(int id);
	
}
