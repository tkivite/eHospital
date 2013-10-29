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
 
  <section class="container1">
    <div class="newuser">
      <h1>Edit user details for currentUser <%= currentUser.getFirst_name() + " " + currentUser.getLast_name()%></h1>
      <form id="form_user_profile" method="post" action="newuser">
        
        <p><label>First Name: </label><input type="text" name="firstname" value= <%= currentUser.getFirst_name()%> placeholder="First Name"></p>
        <p><label>Last Name: </label><input type="text" name="lastname" value="<%= currentUser.getLast_name()%>" placeholder="Last Name"></p>
        
        <p><label>Email: </label><input type="text" name="email" value="<%= currentUser.getEmail()%>" placeholder="Email" ></p>
        <p><label>Secret Question: </label><input type="text" name="secretquestion" value="<%= currentUser.getSecret_question()%>" placeholder="Secret Question"></p>
        <p><label>Secret Answer: </label><input type="text" name="secretanswer" value="<%= currentUser.getSecret_answer()%>" placeholder="Secret Answer"></p>
               
        <p><label>Username: </label><input type="text" name="username" value="<%= currentUser.getUsername()%>" placeholder="Username"></p>
        <p><label>Password: </label><input type="password" name="password" value="<%= currentUser.getPassword()%>" placeholder="Password"></p>
        <p><label>Confirm Password: </label><input type="text" name="confirm_password" value="<%= currentUser.getPassword()%>" placeholder="......"></p>

  
         
        </p>
         
        <p class="submit"><input type="submit" name="save" id="save" value="Save" ></p>
		<p class="submit"><input type="submit" name="edit" id="edit" value="Edit" style="visibility:hidden" onClick="loadUserProfile("edit")" ></p>
		
      </form>
    </div>

    
  </section>

</body>
</html>