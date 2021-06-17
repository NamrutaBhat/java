package com.xworkz.instagram;

import java.util.Scanner;

import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.service.InstagramSericeImpl;
import com.xworkz.instagram.service.InstagramService;

public class InstagramTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your insta id");
		int instaId=sc.nextInt();
		
		System.out.println("enter user name");
		String name=sc.next();
		
		System.out.println("enter the password");
		String password=sc.next();
		
		System.out.println("enter account type");
		String accountType=sc.next();
		
		System.out.println("enter the status of the user");
		String story=sc.next();

		InstagramDTO instagramDTO=new InstagramDTO();
		instagramDTO.setInstaId(instaId);
		instagramDTO.setName(name);
		instagramDTO.setPassword(password);
		instagramDTO.setAccountType(accountType);
		instagramDTO.setStory(story);
		
		InstagramService instagramService=new InstagramSericeImpl();
		instagramService.validateAndSave(instagramDTO);
		
		System.out.println("getting the stories");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			InstagramService instagramService1=new InstagramSericeImpl();
			InstagramDTO instagramDTO1=instagramService1.getAllStories(instagramDTO);
			System.out.println(instagramDTO1);
		}
		
		System.out.println("update the password");
		int no=sc.nextInt();
		for(int j=0;j<no;j++) {
			System.out.println("enter the password to update");
			String pass=sc.next();
			System.out.println("enter the new value");
			String val=sc.next();
			InstagramService instagramService2=new InstagramSericeImpl();
			instagramService2.updatePasswordByName(pass, val);
		}
		
		System.out.println("enter the user to delete");
		int num=sc.nextInt();
		for(int k=0;k<num;k++) {
			System.out.println("enter the user id to delete");
			int id=sc.nextInt();
			System.out.println("enter new value");
			String value = sc.next();
			InstagramService instagramService3=new InstagramSericeImpl();
			instagramService3.deleteUserById(id, value);
		}
	}

}
