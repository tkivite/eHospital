<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<%@ page import="eHospitalUserManagement.UserBean" %>

<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>New User Form</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <script src="resources/js/eHospital.js"> </script>
  <script src="resources/js/validate.js"> </script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  
</head>
<body>

<% UserBean currentUser= UserBean.class.cast(session.getAttribute("currentSessionUser"));%>
 
  <section class="container1" >
    <div class="newuser">
      <h1>Edit user details for currentUser <%= currentUser.getFirst_name() + " " + currentUser.getLast_name()%></h1>
      
      
      <form id="form_user_profile" name="form_user_profile" method="post" action="newuser">
        <table>
		<tr><td><p><label>First Name: </label></p></td><td><p><input type="text" name="firstname" value= <%= currentUser.getFirst_name()%> placeholder="First Name"></p></td><td><p><label>Last Name: </label></p></td><td><p><input type="text" name="lastname" value= <%= currentUser.getLast_name()%> placeholder="Last Name"></p></td></tr>
		
		<tr><td><p><label>Secret Question: </label></p></td><td><p><input type="text" name="firstname" value= <%= currentUser.getSecret_question()%> placeholder="First Name"></p></td><td><p><label>Secret Answer: </label></p></td><td><p><input type="text" name="firstname" value= <%= currentUser.getSecret_answer()%> placeholder="First Name"></p></td></tr>
        
		<tr><td><p><label>Email: </label></p></td><td><p><input type="text" name="email" value= <%= currentUser.getEmail()%> placeholder="Email"></p></td><td><p><label>Username: </label></p></td><td><p><input type="text" name="username" value= <%= currentUser.getUsername()%> placeholder="Username"></p></td></tr>
        
		<tr><td><p><label>Password: </label></p></td><td><p><input type="text" name="password" value= <%= currentUser.getPassword()%> placeholder="Password"></p></td><td><p><label>Confirm Password: </label></p></td><td><p><input type="text" name="confirm_password" value= <%= currentUser.getPassword()%> placeholder="Password"></p></td></tr>
         
		<tr><td colspan="2"></td><td align="right"></td><td>
		 <p class="submit" align="left"><input type="submit" name="save" id="save" value="Save" ></p>
		<p class="submit" align="right"><input type="submit" name="edit" id="edit" value="Edit" style="visibility:hidden" onClick="loadUserProfile("edit")" ></p>
		
		</td></tr> 
		
		</table>
        
       
       
		
      </form>
  
      
      
      </div>

    
  </section>

</body>
</html>