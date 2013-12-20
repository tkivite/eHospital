<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256" %>
<%@ page import="eHospitalUserManagement.UserBean" %>
<%@ page import="eHospitalUserManagement.UserDAO" %>
<% UserBean currentUser= UserDAO.setUser(request.getParameter("userId"));%>


<div id="edit_user_div" style="height: 350px; width: 1000px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">Edit User <%= currentUser.getFirst_name()%>  <%= currentUser.getLast_name()%></h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: right"><a id="closepopup" class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>


                    <form id="form_edit_user_profile" name="form_edit_user_profile" method="post" action="newuser">
                        <table>
                            <tr><td><p><label>First Name: </label></p></td><td><p><input type="text" name="firstname" id="firstname" value= "<%= currentUser.getFirst_name()%>" placeholder="First Name"></p></td><td><p><label>Last Name: </label></p></td><td><p><input type="text" name="lastname" id="lastname" value= "<%= currentUser.getLast_name()%>" placeholder="Last Name"></p></td></tr>

                            <tr><td><p><label>Secret Question: </label></p></td><td><p><input type="text" name="secretquestion" id="secretquestion" value= "<%= currentUser.getSecret_question()%>" placeholder="Secret Question"></p></td><td><p><label>Secret Answer: </label></p></td><td><p><input type="text" name="secretanswer" id="secretanswer" value= "<%= currentUser.getSecret_answer()%>" placeholder="First Name"></p></td></tr>

                            <tr><td><p><label>Email: </label></p></td><td><p><input type="text" name="email" id="email" value= "<%= currentUser.getEmail()%>" placeholder="Email"></p></td><td><p><label>Username: </label></p></td><td><p><input type="text" name="username" id="username" value= "<%= currentUser.getUsername()%> " placeholder="Username"></p></td></tr>

                            <tr><td><p><label>Password: </label></p></td><td><p><input type="password" name="password" id="password" value= "" placeholder="Password"></p></td><td><p><label>Confirm Password: </label></p></td><td><p><input type="password" name="confirm_password" id="confirm_password" value= ""placeholder="Password"></p></td></tr>

                            <tr><td colspan="2"></td><td align="right"></td><td>

                                <p  class="submit" ><input type="button" name="saveEditUser" id="saveEditUser" value="Save" style="visibility: visible" onclick="saveUser('Edit')">


                            </td></tr>

                        </table>




                    </form>




                </div>


            </section>
        </li>
    </ul>
    <input type="hidden" id="userId" name="userId" value="<%=request.getParameter("userId")%>"    />

</div>