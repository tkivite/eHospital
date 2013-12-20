
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>


<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->



<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>eHospital-intelliSOFT Consulting</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Home</title>
    <link rel="stylesheet" href="resources/css/header.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/table1.css">

    <link rel="stylesheet" href="resources/css/popup.css">
    <script src="resources/js/eHospital.js"> </script>
    <script src="resources/js/jquery.js"> </script>
    <script src="resources/js/xmlhttprequest.js"> </script>
    <script src="resources/js/popup.js"> </script>

    <!--[if IE 6]>
    <style type="text/css">
        * html body{ width: expression( document.documentElement.clientWidth < 900 ? '900px' : '100%' ); }
        body {behavior: url(/redmine/stylesheets/csshover.htc?1331454347);}
    </style>
    <![endif]-->


    <%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
    <%@ page import="eHospitalUserManagement.UserBean" %>
    <%@ page import="eHospitalUserManagement.UserRoleBean" %>
    <%@ page import="eHospitalUserManagement.UserRoleDAO" %>
</head>


<%--
<% UserBean currentUser= UserBean.class.cast(session.getAttribute("currentSessionUser"));%>
<%
    UserRoleBean role;
    role=new  UserRoleBean();
    role.setUser_id(request.getRemoteUser());
    role=  UserRoleDAO.viewUserRole(role);

    List<String> roles=new ArrayList();
    List <String> appurls=new ArrayList();;
    int j = 0;
    while ((role.getUser_role()).size() > j) {
        String role1=(String)(role.getUser_role()).get(j);

        String[] rolesplit=  role1.split(":") ;
        roles.add(rolesplit[1]);
        j++;
    }


%>



  --%>

<div id="header">


    <div class="contextual">
        <a href="#" >Logged in:<%=request.getRemoteUser()%></a> |
        <a href="#" onclick="loadUserProfile1()">My Account</a> |
        <a href="logout.jsp" >Sign out</a> |
       <%
            Calendar now = Calendar.getInstance();
            int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);

            int month = now.get(Calendar.MONTH) + 1;
            String dayOfMonthStr = ((dayOfMonth < 10) ? "0" : "") + dayOfMonth;
            String monthStr = ((month < 10) ? "0" : "") + month;

        %>
        <%= dayOfMonthStr+"/"+monthStr+"/"+now.get(Calendar.YEAR)%>
    </div>
    <div  align="left" class="style2" id="logo" style="width:25%; padding-top:15px">eHospital</div>

</div>

<div id="top-menu" >
    <ul>
        <li><a href="#" onclick="loadHome()">Home</a></li>

        <%
            if(UserRoleDAO.isAdmin(request.getRemoteUser()))
            {

        %>
        <li> <a href="#" onclick="loadSettings()">Admin</a> </li>
        <%
            }
        %>
        <li><a href="#" onclick="loadHr()">Human Resource</a></li>
        <li><a href="#">Reports</a></li>
    </ul>

</div>


</div>


<div id="alert_div" class="JSPOPUP_titleBar" ></div>
