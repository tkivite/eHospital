<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>


<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <title>Login Form</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <script src="resources/js/eHospital.js"> </script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body >
  <section class="container">
    <div class="login">
      <h1>Login to eHospital</h1>
      <form method="post" action="home" id="form_login">
        <p><input type="text" name="username" value="" placeholder="Username"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
        <p class="remember_me">
          <%
		    if(request.getAttribute("loginResult") != null && request.getAttribute("loginResult") == "true"){
		  %>
		 <p style="color:red"> Login Failed. Please try again. </p>
		  <%
		    }
		   %>
          <p>
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
       </p>
        
         <p align="centre">
          <input  type="submit" name="commit" value="Login">
          <input  type="submit" name="cancel" value="Cancel" onClick="cancel("form_login")">
          </p>
         
      </form>
    </div>

    <div class="login-help">
      <p>Forgot your password? <a href="#" onClick="loadUserProfile("edit")">Click here to reset</a>.</p>
    </div>
  </section>

</body>
</html>