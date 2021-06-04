<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Bank Management System</title>

</head>
<body bgcolor="PapayaWhip">
<marquee><h1 style="color:violet"><i>Such a small amount to give,so that someone else may live....!!!!</i></h1></marquee>
<h2>If you are a new user,then take a few moments to add your details</h2>
<a href="https://www.justdial.com/Sirsi/Blood-Banks/nct-10049054">click here for details</a>
<form action="rs" style="color:blue">
<pre>
userName:         <input type="text" name="name">
<br>
Password:         <input type="password" name="password">
<br>
Gender:       
                 <input type="radio" name="gender">male<br>
                 <input type="radio" name="gender">female<br>
e-mail:          <input type="email" name="email">
<br>
dateOfBirth:     <input type="date" name="date">
<br>
bloodGroup:      <input type="text" name="bg">
<br>
phoneNumber:     <input type="number" name="pnum">
<br>
address:         <input type="text" name="address">
<br>
amountCanDonate: 
           250ml  <input type="radio" name="amount"><br>
           500ml  <input type="radio" name="amount"><br>
           750ml  <input type="radio" name="amount"><br>
              1L  <input type="radio" name="amount"><br>
              
 <input type="submit" name="addAccount">             

</pre>
</form>

</body>
</html>