package com.dev.devapp.facebook.constants;

public class Constants {

	public static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/mysql1?user=root&password=vinuvasu";
	public static final String INSERT_QUERY = "insert into facebook_table values(?,?,?,?)";
	public static final String UPDATE_PASSWORD_BY_NAME = "update facebook_table set password = ? where name= ?";
	public static final String DELETE_QUERY = "delete from facebook_table where email= ?";
	public static final String SELECT_QUERY = "select * from facebook_table";
	public static final String SELECT_EMAILS_QUERY= "select email from facebook_table";
	public static final String SELECT_PASSWORD_BY_EMAIL ="select password from facebook_table where email= ?";
	public static final String SELECT_EMAIL_BY_NAME ="select email from facebook_table where name= ?";


	
	
}
