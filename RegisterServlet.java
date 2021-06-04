package com.xworkz.client_registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


//@WebServlet("/rs")  //or we can give @WebServlet(urlPatterns:"/rs")
public class RegisterServlet extends  GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
	String user_id=arg0.getParameter("userid");
	 String name=arg0.getParameter("name");
	 String phone_no=arg0.getParameter("phone_no");
	 String age=arg0.getParameter("age");
	 String bloodGroup=arg0.getParameter("blood_group");
	 
	PrintWriter printWriter= arg1.getWriter();
	arg1.setContentType("text/html");
     printWriter.print("Thank you"+ " "+name);	
     
    try {
     Class.forName("com.mysql.cj.jdbc.Driver");
  Connection connection=   DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","vinuvasu");
 PreparedStatement preparedStatement= connection.prepareStatement("insert into blood_bank values(?,?,?,?,?)");
 preparedStatement.setInt(1,1);
 preparedStatement.setString(2,name);
 preparedStatement.setInt(3,3);
 preparedStatement.setString(4,age);
 preparedStatement.setString(5,bloodGroup);
 
 preparedStatement.executeUpdate();
 preparedStatement.close();
 connection.close();
    }
    catch(ClassNotFoundException | SQLException e)
    {
	e.printStackTrace();
    }
}
}