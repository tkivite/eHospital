<%@ page import="eHospitalUserManagement.UserBean" %>
<%@ page import="eHospitalUserManagement.UserRoleBean" %>
<%@ page import="eHospitalUserManagement.UserRoleDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>















<%
    /* UserRoleBean role;
     role=new  UserRoleBean();
     role.setUser_id(request.getRemoteUser());
     role=  UserRoleDAO.viewUserRole(role);

     List<String> roles=new ArrayList();
     List <String> appurls=new ArrayList();;
     int j = 0;
     while ((role.getUser_role()).size() > j) {
         String role1=(String)(role.getUser_role()).get(j);
         out.println(role1);
         String[] rolesplit=  role1.split(":") ;
         roles.add(rolesplit[1]);
         j++;
     }*/


%>


<div id="apps_div" style=" border: inset; background:#0ca3d2; width: 75%; float: right; height:500px;" >


<div id="registration" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadRegistration();return false;">

        <div class="eHspital-icon">
            <div style=" position:inherit">
                <img src="resources/img/registration.png" alt="" />
            </div>
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

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadClinician()">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/provider.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Clinician</div>
        </div>
    </div>

</div>


<div id="lab" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton"  onclick="loadLab()">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/labentry.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Lab</div>
        </div>
    </div>



</div>




<div id="charts" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadChart()">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/chart.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Medical Charts</div>
        </div>
    </div>



</div>




<div id="medicalreports" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadMedicalReports">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/reports.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Medical Reports</div>
        </div>
    </div>


</div>




<div id="billing" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadBilling">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/sale.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Billing</div>
        </div>
    </div>


</div>




<div id="pharmacy" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadPharmacy">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/pharmacy.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Pharmacy</div>
        </div>
    </div>



</div>



<div id="stock" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton"onclick="loadStock">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/stock.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Stock</div>
        </div>
    </div>




</div>


<div id="accounting" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadAccounting">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/account.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Accounting</div>
        </div>
    </div>



</div>



<div id="hr" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadHR">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/hr.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Human Resource</div>
        </div>
    </div>




</div>



<div id="other_reports" style="float: left; margin: 5px;" >

    <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="otherReports">

        <div class="eHspital-icon">
            <div style="position: inherit">
                <img src="resources/img/reports.png" alt="" />				</div>
        </div>

        <div class="eHospital-button-text">

            <div class="eHospital-label">Other Reports</div>
        </div>
    </div>



</div>










</div>
