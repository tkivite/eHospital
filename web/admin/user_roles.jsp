
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>User Roles</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table1.css">
    <%@ page import="eHospitalUserManagement.UserBean" %>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="eHospitalUserManagement.UserRoleBean" %>
    <%@ page import="eHospitalUserManagement.UserRoleDAO" %>
    <%@ page import="java.util.List" %>


</head>

<body>
<%

    ArrayList<UserBean> users= new UserBean().get_Users();
    int i=0;
%>
<table >
    <caption >All User Roles</caption>
    <thead>

    <tr>
        <th scope="col">Id</th>
        <th scope="col">User</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Roles</th>
        <th scope="col">Click to Edit Role</th>


    </tr>
    </thead>


    <tfoot>
    <tr>
        <th scope="row" colspan="4" style="text-align: right">Total Number of Users:</th>
        <td colspan="2" style="text-align: left"><%=users.size()%></td>
    </tr>
    </tfoot>

    <%
        // out.println(users.size());
        while(users.size()>i)
        {
            UserBean user=users.get(i);

    %>

    <tr>
        <td><%=i+1%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getFirst_name()%></td>
        <td><%=user.getLast_name()%></td>
        <td>

            <%
                UserRoleBean role;
                role=new  UserRoleBean();
                role.setUser_id(user.getUsername());
                role=  UserRoleDAO.viewUserRole(role);

                List<String> roles=new ArrayList();

                int j = 0;
                while ((role.getUser_role()).size() > j) {
                    String role1=(String)(role.getUser_role()).get(j);

                    String[] rolesplit=  role1.split("\\$") ;


              if(((role.getUser_role()).size()-1)==j || j==2)
                    {
                        out.println(rolesplit[1]);

                    }
                    else
                    {
                    out.println(rolesplit[1]+",");
                    }

                   // roles.add(rolesplit[1]);

                    j++;
                }
            String username=      user.getUsername();
            session.setAttribute("selectedUser", username);
            %>



        </td>
        <td>
            <a href="#" onclick="editUserRoles('<%=username%>')">Edit</a>

        </td>

    </tr>
    <%
            i++;
        }

    %>








</table>




</body>