
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
  <title>Contact admin</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>

<section class="container">
    <div class="login">
      <h1>Admin Contact Form</h1>
      <form action="mail" method="post">
        <p><input type="text" name="to" value="" placeholder="To"></p>
        <p><input type="text" name="subject" value="" placeholder="Subject"></p>
        <p><textarea name="message" placeholder="Message">Message</textarea></p>
        <p><input type="text" name="email_id" value="" placeholder="Your Email Id"></p>
        <p><input type="password" name="password" value="" placeholder="Password"></p>
       
        <p class="remember_me">
         
        </p>
        <p class="submit"><input type="submit" name="send" value="Send"></p>
      </form>
    </div>

    
  </section>
  </body>
  </html>
   