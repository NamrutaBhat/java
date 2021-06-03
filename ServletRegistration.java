package com.xworkz.client_registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/rs")
public class ServletRegistration extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	   String Name=arg0.getParameter("name");
	   String male=arg0.getParameter("gender");
	   String female=arg0.getParameter("gender");
	   String date=arg0.getParameter("date");
	   String YOP=arg0.getParameter("year");
	   String PercentageCGPA =arg0.getParameter("cgpa");
	   String College=arg0.getParameter("college");
	   
	   PrintWriter printWriter= arg1.getWriter();
		arg1.setContentType("text/html");
	     printWriter.print(Name+" "+"Thank you For registering with us.Your Apllication will be processed by our team.Stay tuned..");	
	   
	}

}
