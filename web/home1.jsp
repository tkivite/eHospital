


<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>


<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->


<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>eHospital-intelliSOFT Consulting</title>

 <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <title>Home</title>
  <link rel="stylesheet" href="resources/css/header.css">
  <link rel="stylesheet" href="resources/css/style.css">
  <script src="resources/js/eHospital.js"> </script>
  <script src="resources/js/jquery.js"> </script>
  <script src="resources/js/xmlhttprequest.js"> </script>
 
<!--[if IE 6]>
    <style type="text/css">
      * html body{ width: expression( document.documentElement.clientWidth < 900 ? '900px' : '100%' ); }
      body {behavior: url(/redmine/stylesheets/csshover.htc?1331454347);}
    </style>
<![endif]-->

<%@ page import="eHospitalUserManagement.UserBean" %>
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
</head>

<body >
<% UserBean currentUser= UserBean.class.cast(session.getAttribute("currentSessionUser"));%>

<div id="header">


<div class="contextual">
    <a href="#" class="icon icon-add">Logged in as: <%= currentUser.getFirst_name() + " " + currentUser.getLast_name()%></a> |
    <a href="#" onclick="loadUserProfile1('view')">My Account</a> |
    <a href="#" onclick="loadLoginPage()">Sign out</a> |
    <a href="#" onclick="loadSettings()">Settings</a> |
	
	
   <%
    Calendar now = Calendar.getInstance();
    int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
   
    int month = now.get(Calendar.MONTH) + 1;
    String dayOfMonthStr = ((dayOfMonth < 10) ? "0" : "") + month;
    String monthStr = ((month < 10) ? "0" : "") + month;
  
   %>
   <%= dayOfMonthStr+"/"+monthStr+"/"+now.get(Calendar.YEAR)%>
   </div> 
<div  align="left" class="style2" id="logo" style="width:25%; padding-top:15px">eHospital</div>

</div>

<div id="top-menu" >
   <ul>
   <li><a href="#" onclick="loadHome()">Home</a></li>
   <li><a href="#">Human Resource</a></li>
   <li><a href="#">Reports</a></li>
   </ul>
  
</div>



<div id="loading_div" style="width:400px; display:none; position:absolute; top:300px; left:400px;">
  <div align="center">
    <table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" style="border:dotted 1px #5D5D5D;">
      <tr><td>&nbsp;</td></tr><tr><td align="center"><img src="resources/img/loading.gif" width="50" height="50"></td></tr><tr><td align="center" class="small">Loading .... please wait.</td></tr><tr><td>&nbsp;</td></tr>
    </table>
  </div>
</div>



<div id="mainContent"  style=" width: 100%; background-color:#CCCCCC; float: left; height:500px;" >

<div id="apps_div" style=" border: inset; background:#0ca3d2; width: 75%; float: right; height:500px;" >
           
           
           <div id="registration" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadRegistration()">							
					
			<div class="eHspital-icon">
				<div style=" position:inherit">
					<img src="resources/img/registration.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Registration</div>
				</div>
			</div>
			
						
		</div>


         <div  id="triage" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadTriage()">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/intake.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Triage</div>
				</div>
			</div>
			
			
			
	</div>

    
    
    
          <div id="clinician" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/provider.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Clinician</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
	   </div>
	
	
        <div id="lab" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/labentry.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Lab</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
	     </div>
  
    <div id="5" style="float: left; margin: 5px;" >
    <script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
	  </div>
		
	
	  <div id="charts" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/chart.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Medical Charts</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>
		
		
		
	
	  <div id="medicalreports" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/reports.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Medical Reports</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>		



	
	  <div id="billing" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/sale.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Billing</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>



	
	  <div id="pharmacy" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/pharmacy.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Pharmacy</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>


	
	  <div id="stock" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/stock.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Stock</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>

	
	  <div id="accounting" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/account.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Accounting</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>


	
	  <div id="hr" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/hr.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Human Resource</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>


	
	  <div id="other_reports" style="float: left; margin: 5px;" >					
							
			<div id="fr256" class="eHospital-button eHospital-appbutton">							
					
			<div class="eHspital-icon">
				<div style="position: inherit">
					<img src="resources/img/reports.png" alt="" />				</div>
			</div>
				
				<div class="eHospital-button-text">
				
					<div class="eHospital-label">Other Reports</div>
				</div>
			</div>
			
			
			<script type="text/javascript">
			jq(function() {
				jq('#fr256').click(function() {
					
						location.href='index.jsp'
					
					
				});
			});
			</script>
			
		</div>










</div>

</div>

<%@ include file="footer.jsp" %>
</body>
