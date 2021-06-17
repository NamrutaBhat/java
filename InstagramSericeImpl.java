package com.xworkz.instagram.service;


import com.xworkz.instagram.dao.InstagramDAO;
import com.xworkz.instagram.dao.InstagramDAOImpl;
import com.xworkz.instagram.dto.InstagramDTO;

public class InstagramSericeImpl implements InstagramService{

private InstagramDAO  instagramDAO;
	
	
	public InstagramSericeImpl()
	{
		instagramDAO=new InstagramDAOImpl();
	}
	
	
	
	@Override
	public void validateAndSave(InstagramDTO instagramDTO) {
		if(instagramDTO!=null) {
			if(instagramDTO.getInstaId()>0 &&instagramDTO.getAccountType()!=null) {
				instagramDAO.save(instagramDTO);
			}
			else
			{
				System.out.println("invalid id");
			}
		}
		
	}

	@Override
	public InstagramDTO getAllStories(InstagramDTO instagramDTO) {
		if(instagramDTO!=null) {
			if(instagramDTO.getStory()!=null)
			{
				instagramDAO.getAllStories(instagramDTO);
			}
			else {
				System.out.println("invalid input");
			}
		}
		return instagramDTO;
		
	}

	@Override
	public void updatePasswordByName(String name, String password) {
		if(password!=null) {
			instagramDAO.updatePasswordByName(name, password);
		}
		else {
			System.out.println("invalid password");
		}
	}

	@Override
	public void deleteUserById(int id, String name) {
		if(id>0)
		{
			instagramDAO.deleteUserById(id, name);
		}
		else
		{
			System.out.println("please enter valid id");
		}
	}

}
