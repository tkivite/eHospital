<%@ page import="eHospitalUserManagement.UserBean" %>
<%@ page import="eHospitalUserManagement.UserRoleBean" %>
<%@ page import="eHospitalUserManagement.UserRoleDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>



<%
   UserRoleBean role;
    role=new  UserRoleBean();
    role.setUser_id(request.getRemoteUser());
    role=  UserRoleDAO.viewUserRole(role);


    int j = 0;


 /*

process role array loading apps dynamically

*/
%>


<div id="apps_div" style=" border: inset; background:#0ca3d2; width: 75%; float: right; height:500px;" >
<%
while ((role.getUser_role()).size() > j)
{
    String role1=(String)(role.getUser_role()).get(j);
    String[] rolesplit=  role1.split("\\$") ;


    String role_id= rolesplit[0];
    String role_name= rolesplit[1];
    String app_url= URLDecoder.decode(rolesplit[3], "UTF-8");
    String app_name= rolesplit[4];
    String icon= rolesplit[5];



%>


    <div id="<%=role_name%>" style="float: left; margin: 5px;" >

        <div id="fr256" class="eHospital-button eHospital-appbutton" onclick="loadapp('<%=app_url%>')">

            <div class="eHspital-icon">
                <div style=" position:inherit">
                    <img src="resources/img/<%=icon%>" alt="<%=app_name%> icon" />
                </div>
            </div>

            <div class="eHospital-button-text">

                <div class="eHospital-label"><%=app_name%></div>
            </div>
        </div>


    </div>
    <%



    j++;



}

 %>




</div>
