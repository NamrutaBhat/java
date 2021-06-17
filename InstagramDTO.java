package com.xworkz.instagram.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="insta_table")
public class InstagramDTO implements Serializable {
    
	@Id
	private int instaId;
	private String name;
	private String password;
	private String accountType;
	private String story;
	
	public	InstagramDTO()
	{
		
	}

	public int getInstaId() {
		return instaId;
	}

	public void setInstaId(int instaId) {
		this.instaId = instaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	@Override
	public String toString() {
		return "InstagramDTO [instaId=" + instaId + ", name=" + name + ", password=" + password + ", accountType="
				+ accountType + ", story=" + story + "]";
	}
	
	
}
