package com.xworkz.client_registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/rs")
public class RegisterServlet extends  GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	 String name=arg0.getParameter("name");
	 String Mobileno=arg0.getParameter("mobile nu");
	 String age=arg0.getParameter("age");
	 String email=arg0.getParameter("email");
	 
	PrintWriter printWriter= arg1.getWriter();
	arg1.setContentType("text/html");
     printWriter.print("Thank you"+name);		
	}

}
