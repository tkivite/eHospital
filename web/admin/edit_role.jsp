<%@ page import="eHospitalUserManagement.RoleBean" %>
<%@ page import="java.net.URLDecoder" %>
<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>

<%

String roleId=request.getParameter("roleId");

RoleBean role= new RoleBean();
role=role.getRole(roleId)  ;
String app_url=role.getApp_url();
    app_url=URLDecoder.decode(app_url,"UTF-8");
    out.println(app_url);

%>


<div id="add_role_div" style="height: 350px; width: 1000px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">Edit eHospital Role <%=role.getRole()%></h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: right"><a id="closepopup" class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>
                    <form id="addroleform"  action="newrole">
                        <table>
                            <tr>
                                <td>
                                    <p><label>Role_Name</label></p></td><td><p><input type="text" name="rolename" id="rolename" value="<%=role.getRole()%>" placeholder="Role Name"></p>
                                </td>
                                <td>
                                    <p><label>Role Description: </label></p></td><td><p><input type="text" name="role_description" id="role_description" value="<%=role.getRole_description()%>" placeholder="Description"></p>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <p><label>Role App</label></p></td><td><p><input type="text" name="roleapp" id="roleapp" value="<%=role.getApp_name()%>" placeholder="App Name"></p>
                                </td>
                                <td>
                                    <p><label>App Url: </label></p></td><td><p><input type="text" name="app_url" id="app_url" value="<%=app_url%>" placeholder="App URL "></p>
                                </td>
                            </tr>

                            <script type="text/javascript">
                                var url=decodeURIComponent(document.getElementById("app_url").value) ;
                                document.getElementById("app_url")

                            </script>



                            <tr>
                                <td>
                                    <p><label>Icon Name: </label></p></td><td><p><input type="text" name="icon_name" id="icon_name" value="<%=role.getIcon_name()%>" placeholder="Description"></p>
                                </td>
                                <td colspan="2" >

                                    <p  class="submit" ><input type="button" name="commit" value="Save" onclick="saveRole('Edit')">


                                    </p>


                                </td>
                            </tr>


                        </table>



                        </p>


                    </form>
                </div>


            </section>
        </li>
    </ul>

    <input type="hidden" id="roleId" name="roleId" value="<%=roleId%>"    />
</div>