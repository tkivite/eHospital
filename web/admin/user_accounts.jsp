
<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>

<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>User Accounts</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />


    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table1.css">
    <%@ page import="eHospitalUserManagement.UserBean" %>
    <%@ page import="java.util.ArrayList" %>


</head>

<body>
<%

    ArrayList<UserBean> users= new UserBean().get_Users();
    int i=0;
%>
<table >
    <caption >All Users</caption>
    <caption style="text-align: right" ><a href="#" class="test" onclick='JSPOPUP_createModalPopUp("admin/new_user.jsp")'>Add New User</a></caption>



    </tr>
    <thead>

    <tr>


        <th scope="col">Id</th>
        <th scope="col">User</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Email</th>
        <th scope="col">Select Action</th>


    </tr>
    </thead>


    <tfoot>
    <tr>
        <th scope="row" colspan="4" style="text-align: right">Total Number of Users:</th>
        <td colspan="2" style="text-align: left"><%=users.size()%></td>
    </tr>
    </tfoot>

     <%

        while(users.size()>i)
        {
            UserBean user=users.get(i);

                %>

                <tr>
                    <td><%=i+1%></td>
                    <td><%=user.getUsername()%></td>
                    <td><%=user.getFirst_name()%></td>
                    <td><%=user.getLast_name()%></td>
                    <td><%=user.getEmail()%></td>
                    <td><a href="#" onclick="editUser('<%=user.getUsername()%>')">Edit</a> | <a href="#" onclick="removeUser('<%=user.getUsername()%>')">Remove</a></td>

                </tr>
                <%
                     i++;
                    }

    %>








</table>




</body>