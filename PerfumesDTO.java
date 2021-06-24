package com.xworkz.perfumes.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="perfumes_table")
public class PerfumesDTO implements Serializable{
       
	@Id
	//to increment primary key automatically,depends on database
//	@GenericGenerator(strategy="increment", name = "ref") ///we can give any name for that 
	//@GeneratedValue(strategy=GenerationType.AUTO) //reference of name is passed,stratergy is attribute,it will take enum value
	private int perfumesId;
	private String perfumeName;
	private String companyName;
	private double price;
	private String expDate;
	
	public PerfumesDTO() {
		
	}

	public int getPerfumesId() {
		return perfumesId;
	}

	public void setPerfumesId(int perfumesId) {
		this.perfumesId = perfumesId;
	}

	public String getPerfumeName() {
		return perfumeName;
	}

	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "PerfumesDTO [perfumesId=" + perfumesId + ", perfumeName=" + perfumeName + ", companyName=" + companyName
				+ ", price=" + price + ", expDate=" + expDate + "]";
	}
	
	
	
}
