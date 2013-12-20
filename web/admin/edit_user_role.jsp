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



    %>







<div id="user_role_div" style="height: 350px; width: 1000px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">Edit Roles for <%=selected%></h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: right"><a  class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>


                    <form id="form_edit_user_role" name="form_edit_user_role" method="post" >
                        <table>
                            <tbody>



                            <tr>
                                <td style="width: 40%">
                                    <select id="sel1" name="sel1" size="<%=roles.size()%>" multiple="multiple" style="width: 100%">

                                        <%
                                            while(roles.size()>i)
                                            {
                                                RoleBean role=roles.get(i);


                                        %>
                                        <option value="<%=role.getRole_id()%>"><%=role.getRole()%></option>
                                        <%
                                                i++;
                                            }
                                        %>

                                    </select>
                                </td>
                                <td align="center" valign="middle" style="width: 20%">
                                    <input type="button" value="Add Role--&gt;"
                                           onclick="moveOptions(this.form.sel1, this.form.sel2);" /><br />
                                    <input type="button" value="&lt;--Remove"
                                           onclick="moveOptions(this.form.sel2, this.form.sel1);" />
                                </td>
                                <td style="width: 40%">
                                    <select id="sel2" name="sel2" size="<%=roles.size()%>" multiple="multiple" style="width: 100%">
                                        <%

                                            for(int j=0; j<userrole.getUser_role().size(); j++)
                                            //while ((userrole.getUser_role()).size() > j)
                                            {
                                                String role1=(String)(userrole.getUser_role()).get(j);

                                                String[] rolesplit=  role1.split("\\$") ;

                                                String role_id=rolesplit[0];
                                                String role_name= rolesplit[1];
                                        %>
                                        <option value="<%=role_id%>"><%=role_name%></option>
                                        <%
                                            }
                                        %>

                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">

                                </td>
                                <td>
                                    <p  class="submit" ><input type="button" name="commit" value="Save" onclick="SaveSelectedRoles()">

                                    </p>


                                </td>

                            </tr>

                            </tbody>
                        </table>




                    </form>




                </div>


            </section>
        </li>
    </ul>

<input type="hidden" name="userId" id="userId" value="<%=request.getParameter("userId")%>">
</div>