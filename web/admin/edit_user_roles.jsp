<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>User Roles</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table1.css">
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.List" %>
    <%@ page import="eHospitalUserManagement.*" %>






<%
   // String selected=request.getParameter("userIdToEditRole");
    String selected=request.getParameter("userId");
    out.println("Selected User"+selected);
   // String  selected=String.valueOf(selectedUser);

    ArrayList<RoleBean> roles;
    roles= RoleDAO.viewRoles();
    int i=0;



       UserRoleBean userrole;
        userrole=new  UserRoleBean();
        userrole.setUser_id(selected);
        userrole=  UserRoleDAO.viewUserRole(userrole);

        List<String> userroles=new ArrayList();

       // int j = 0;
             for(int j=0; j<userrole.getUser_role().size(); j++)
         //while ((userrole.getUser_role()).size() > j)
               {
                    String role1=(String)(userrole.getUser_role()).get(j);

                    String[] rolesplit=  role1.split(":") ;

                    String role_id=rolesplit[0];
                    String role_name= rolesplit[1];
                   userroles.add(role_name);
               }


%>

<body>
<div id="edit_user_role_div" style="height: 350px; width: 600px ">

<table >
    <caption class="JSPOPUP_titleBar">  Edit Roles</caption>
    <caption>
        <table>
            <tr>
                <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">Edit Roles for <%=selected%></h1></td>
                <td style="text-align: right; border: none"><h1><span style="text-align: right"><a id="closepopup" class="JSPOPUP_close" href="#" >
                    <img src="resources/img/close.png" alt="Close" />
                </a></span></h1></td>
            </tr>
        </table>
        </caption>
    <thead>

    <tr>
        <th scope="col">Role</th>
        <th scope="col">Select</th>
        <th scope="col">Selected Roles</th>


    </tr>
    </thead>


    <tfoot>
    <tr>
        <th scope="row" colspan="3" style="text-align: center">User Roles Edit Form</th>

    </tr>
    </tfoot>











    <!-- Table Body -->
    <tbody>

    <%
        // out.println(users.size());
     while(roles.size()>i)
     {
        RoleBean role=roles.get(i);

    %>

    <tr>
        <td><%=role.getRole()%></td>
        <td><input name="userRolesSelect" id="<%=role.getRole_id()%>" value=" <%=role.getRole_id()%>" type="checkbox"




          <%



                    if(userroles.contains(role.getRole()))
                    {
                    %>
                   checked="checked"


                    <%
                    }

                    %>
                   onchange="populateTextArea('<%=role.getRole()%>','<%=role.getRole_id()%>')" />  </td>


                     <%








            if(i==0)
            {
            %>

              <td rowspan="<%=roles.size()%>"><select size=""></select> </td>
             <%

            }

            %>





        </tr>
      <%
     i++;
    }
    %>

    </tbody>




   <tr><td colspan="3"><input type="button" id="saveEditRoles" onclick="SaveSelectedRoles('request.getParameter(userId)')"></td></tr>

</table>


</div>

</body>