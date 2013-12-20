<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>User Roles</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table1.css">

    <%@ page import="java.util.ArrayList" %>
    <%@ page import="eHospitalUserManagement.RoleBean" %>
    <%@ page import="eHospitalUserManagement.RoleDAO" %>



</head>

<body>

<%
	ArrayList<RoleBean> roles;
    roles= RoleDAO.viewRoles();
    int i=0;
%>
<table >
    <caption >eHospital Roles</caption>
    <caption style="text-align: right" ><a href="#" class="test" onclick='JSPOPUP_createModalPopUp("admin/add_role.jsp")'>Add New Role</a></caption>

    <thead>

    <tr>
        <th></th>
        <th>Role</th>
        <th>Description</th>
        <th>Created By </th>
        <th>Date created </th>
        <th>Action</th>

    </tr>
    </thead>


    <tfoot>
    <tr>
        <th scope="row" colspan="6" style="text-align:center">eHospital System Roles</th>

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
        <td><%=i+1%></td>
        <td><%=role.getRole()%></td>
        <td><%=role.getRole_description()%></td>
        <td><%=role.getCreated_by()%></td>
        <td><%=role.getDate_created()%></td>
        <td><a href="#" onclick="editRole('<%=role.getRole_id()%>')">Edit</a> | <a href="#" onclick="removeRole('<%=role.getRole_id()%>')">Remove</a></td>

    </tr>
    <%
            i++;
        }
    %>
			</tbody>
	<!-- Table Body -->
</table>

</body>
