package com.xworkz.blood_bank_management_system;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/rs")
public class BloodBankDetails extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String userName=arg0.getParameter("name");
		String Password=arg0.getParameter("password");
		String male=arg0.getParameter("male");
		String female=arg0.getParameter("female");
		String eMmail=arg0.getParameter("email");
		String dateOfBirth=arg0.getParameter("date");
		String bloodGroup=arg0.getParameter("bg");
		String phoneNumber=arg0.getParameter("pnum");
		String address=arg0.getParameter("address");
		String amountCanDonate=arg0.getParameter("amount");
		
		PrintWriter printWriter= arg1.getWriter();
		arg1.setContentType("text/html");
	     printWriter.print("Thank you for registering with us"+ " "+userName);	
		
		
		
		
	}

}
