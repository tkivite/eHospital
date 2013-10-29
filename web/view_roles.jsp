<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<html>

<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<%@ page import="eHospitalUserManagement.RoleBean" %>
<%@ page import="eHospitalUserManagement.RoleDAO" %>
<%@ page import ="java.util.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>eHoapital Roles</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <link rel="stylesheet" href="resources/css/table.css">
  <script src="resources/js/eHospital.js"> </script>
  <script src="resources/js/validate.js"> </script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  
</head>
<body>

<%
	ArrayList<RoleBean> roles= new ArrayList<RoleBean>();
roles= RoleDAO.viewRoles();
%>
   <section class="container1">
    <div class="viewroles">
      <h1>eHospital Roles</h1>
      <form id="form_user_profile" method="post" action="newuser">
       <table cellspacing='0'> <!-- cellspacing='0' is important, must stay -->

	<!-- Table Header -->
	<thead>
		<tr>
			<th>Role</th>
			<th>Description</th>
			<th>Created By </th>
			<th>Date created </th>
		</tr>
	</thead>
	<!-- Table Header -->

	<!-- Table Body -->
	<tbody>
	<c:forEach items="${roles}" var="role">
    <tr>      
        <td><a href="#">${role.getRole()}</a></td>
        <td>${role.getRole_description()}</td>
        <td>${role.getCreated_by()}</td>
        <td>${role.getDate_created()}</td>
        
    </tr>
  </c:forEach>

			</tbody>
	<!-- Table Body -->
</table> 
       
      </form>
    </div>

    
  </section>

</body>
</html>