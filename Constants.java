package com.xworkz.amazon.constants;

public class Constants {
	public static final String DRIVER_CLASS_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/mysql1?user=root&password=vinuvasu";
	public static final String INSERT_QUERY ="insert into amazon_app values(?,?,?,?,?,?,?)";

public static final String UPDATE_AGE_BY_USER_NAME = "update banking_app set age = ? where user_name= ?";
public static final String DELETE_USER_BY_ACCOUNT_NO= "delete from banking-app where account_no=?";
public static final String SELECT_QUERY = "select * from amazon_order";

}
