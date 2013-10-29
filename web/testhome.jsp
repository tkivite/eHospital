



<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>eHospital-Home</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <script src="resources/js/eHospital.js"> </script>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body >
<%@ include file="header.jsp" %>

<div id="mainContent" style=" border: inset; width: 75%; float: right; height:800px;" >
<table style="width: 100%"  id="box-table-b" align="center"  >
                    <tr>
                        <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><a href="home.jsp"><img src="resources/img/registration.png"/></a></td></tr>
								 <tr><td><a href="home.jsp"> registration</a></td></tr>
						    </table>
						</div>
						</td>                     
                         <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><a href="home.jsp"><img src="resources/img/intake.png"/></a></td></tr>
								 <tr><td><a href="home.jsp">Triage</a></td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><a href="home.jsp"><img src="resources/img/provider.png"/></a></td></tr>
								 <tr><td><a href="home.jsp">Clinician</a></td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><a href="home.jsp"><img src="resources/img/labentry.png"/></a></td></tr>
								 <tr><td><a href="home.jsp"> Lab</a></td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><a href="http://209.10.74.136:8080/openmrs/kenyaemr/admin/adminHome.page;sessionid=93014540C302DDA09761349D90D298B4"><img src="resources/img/reports.png"/></a></td></tr>
								 <tr><td> <a href="http://209.10.74.136:8080/openmrs/kenyaemr/admin/adminHome.page;sessionid=93014540C302DDA09761349D90D298B4">Medical Reports</a></td></tr>
						    </table>
						</div>
						</td>  
                    </tr>
                    <tr>
                        <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><img src="resources/img/sale.png"/></td></tr>
								 <tr><td> Cashier</td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><img src="resources/img/pharmacy.png"/></td></tr>
								 <tr><td> Pharmacy</td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><img src="resources/img/account.png"/></td></tr>
								 <tr><td> Accounting</td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
						 <div>
						    <table>
							    <tr><td><img src="resources/img/hr.png"/></td></tr>
								 <tr><td> Human Resource</td></tr>
						    </table>
						</div>
						</td>  
						 <td style="width: 20%">
					
							<div style="float: left; margin: 5px;" >					
							
							<div id="fr256" class="eHospital-button eHospital-appbutton">							
									
							<div class="eHspital-icon">
								<div style="position: relative">
									<img src="resources/img/registration.png" alt="" />
									
								</div>
							</div>
								
								<div class="eHospital-button-text">
								
									<div class="eHospital-label">Registration</div>
								
								
								</div>
							</div>
							
							
							<script type="text/javascript">
							jq(function() {
								jq('#fr256').click(function() {
									
										location.href='/openmrs/kenyaemr/registration/registrationHome.page'
									
									
								});
							});
							</script>
							
								</div>
								
						</td>  
                    </tr>

                </table>



</div>
<div style=" background-color:#CCCCCC; width: 25%; height:800px" id="1">

</div>

<%@ include file="footer.jsp" %>
</body>


