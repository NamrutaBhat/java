package com.xworkz.instagram.dao;

import com.xworkz.instagram.dto.InstagramDTO;

public interface InstagramDAO {

	
	public void save(InstagramDTO instagramDTO);
	public InstagramDTO getAllStories(InstagramDTO instagramDTO);
	public void updatePasswordByName(String name,String password);
	public void deleteUserById(int id,String name);
	
	
	
	
}
