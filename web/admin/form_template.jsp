<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>

<%--
 Java stuff-imports and function calls
--%>


<div id="user_profile_div" style="height: 350px; width: 1000px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">

                    <!--The heading with a close button -->
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">User Profile for <%= currentUser.getFirst_name()%>  <%= currentUser.getLast_name()%></h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: left" ><a href="#"  onclick="editUserProfile()">Edit  </a></span><span style="text-align: right"><a id="closepopup" class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>

                    <!--The form with tabular structure -->

                    <form id="form_user_profile" name="form_user_profile" method="post" action="newuser">
                        <table>
                            <tr><td><p><label>First Name: </label></p></td><td><p><input type="text" name="firstname" value= "<%= currentUser.getFirst_name()%>" placeholder="First Name"></p></td><td><p><label>Last Name: </label></p></td><td><p><input type="text" name="lastname" value= "<%= currentUser.getLast_name()%>" placeholder="Last Name"></p></td></tr>

                            <tr><td><p><label>Secret Question: </label></p></td><td><p><input type="text" name="firstname" value= "<%= currentUser.getSecret_question()%>" placeholder="First Name"></p></td><td><p><label>Secret Answer: </label></p></td><td><p><input type="text" name="firstname" value= "<%= currentUser.getSecret_answer()%>" placeholder="First Name"></p></td></tr>

                            <tr><td><p><label>Email: </label></p></td><td><p><input type="text" name="email" value= "<%= currentUser.getEmail()%>" placeholder="Email"></p></td><td><p><label>Username: </label></p></td><td><p><input type="text" name="username" value= "<%= currentUser.getUsername()%> " placeholder="Username"></p></td></tr>

                            <tr><td><p><label>Password: </label></p></td><td><p><input type="text" name="password" value= "" placeholder="Password"></p></td><td><p><label>Confirm Password: </label></p></td><td><p><input type="text" name="confirm_password" value= ""placeholder="Password"></p></td></tr>

                            <tr><td colspan="2"></td><td align="right"></td><td>
                                <p  class="submit" ><input type="button" name="editUser" value="Edit" id="editUser" onclick="editUserProfile()">
                                <p  class="submit" ><input type="button" name="saveEditUser" id="saveEditUser" value="Save" style="visibility: hidden" onclick="saveUser('Edit')">


                            </td></tr>

                        </table>




                    </form>




                </div>


            </section>
        </li>
    </ul>

</div>