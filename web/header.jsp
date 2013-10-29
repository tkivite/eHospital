<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>eHospital-intelliSOFT Consulting</title>
<link rel="stylesheet" type="text/css" href="resources/css/header.css">
  <script src="resources/js/eHospital.js"> </script>
<!--[if IE 6]>
    <style type="text/css">
      * html body{ width: expression( document.documentElement.clientWidth < 900 ? '900px' : '100%' ); }
      body {behavior: url(/redmine/stylesheets/csshover.htc?1331454347);}
    </style>
<![endif]-->
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<%@ page import="eHospitalUserManagement.UserBean" %>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
</head>
<body class="controller-projects action-index">

<% UserBean currentUser= UserBean.class.cast(session.getAttribute("currentSessionUser")); %>

<div id="header">


<div class="contextual">
    Logged in as: <%= currentUser.getFirst_name() + " " + currentUser.getLast_name()%> |
    <a href="#" onclick="loadUserProfile("view")">My Account</a> |
    <a href="#">Sign out</a> |
	<a href="#">Settings</a> |
	
	
    <%
    Calendar now = Calendar.getInstance();
    int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
   
    int month = now.get(Calendar.MONTH) + 1;
    String dayOfMonthStr = ((dayOfMonth < 10) ? "0" : "") + month;
    String monthStr = ((month < 10) ? "0" : "") + month;
  
   %>
   <%= dayOfMonthStr+"/"+monthStr+"/"+now.get(Calendar.YEAR)%>
   </div> 
<h1><img src="resources/img/eHospital1.png" alt="logo" width="75" height="79" />eHospital</h1>
</div>

<div id="top-menu">
   <ul>
   <li><a href="#" onclick="loadHome()">Home</a></li>
   <li><a href="#">Registration</a></li>
   <li><a href="#">Reports</a></li>
   </ul>
  
</div>