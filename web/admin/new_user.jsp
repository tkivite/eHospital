<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>

<div id="user_profile_div" style="height: 350px; width: 1000px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">New User </h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: right"><a id="closepopup" class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>


                    <form id="form_add_user" name="form_add_user" method="post" action="newuser">
                        <table>
                            <tr>
                                <td>
                                    <p><label>First Name: </label><p></p></td><td><p><input type="text" name="firstname" id="firstname" value="" placeholder="First Name"></p>
                                </td>
                                <td>
                                    <p><label>Last Name: </label><p></p></td><td><p><input type="text" name="lastname" id="lastname" value="" placeholder="Last Name"></p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p><label>Email: </label><p></p></td><td><p><input type="text" name="email" id="email" value="" placeholder="Email" ></p>
                                </td>
                                <td>
                                    <p><label>Telephone: </label><p></p></td><td><p><input type="text" name="telephone" id="telephone" value="" placeholder="Email" ></p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p><label>Secret Question: </label><p></p></td><td><p><input type="text" name="secretquestion" id="secretquestion" value="" placeholder="Secret Question"></p>
                                </td>
                                <td>
                                    <p><label>Secret Answer: </label><p></p></td><td><p><input type="text" name="secretanswer"  id="secretanswer"  value="" placeholder="Secret Answer"></p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p><label>Username: </label><p></p></td><td><p><input type="text" name="username" id="username" value="" placeholder="Username"></p>
                                </td>
                                <td>
                                    <p><label>Password: </label></p></td><td><p><input type="password" name="password" id="password" value="" placeholder="Password"></p>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p><label>Confirm Password: </label><p></p></td><td><p><input type="password" name="confirm_password" id="confirm_password" value="" placeholder="Password"></p>

                                </td>
                                <td colspan="2">


                                    <p  class="submit" ><input type="button" name="commit" value="Save" onclick="saveUser('Add')">
                                        <input type="button" name="commit" value="Save and Add" onclick="saveUser()">


                                </td>
                            </tr>


                        </table>



                        </p>


                    </form>










                    <input type="hidden" id="userId" name="userId" value=""    />



                </div>


            </section>
        </li>
    </ul>
    <input type="hidden" id="roleId" name="roleId" value=""    />

</div>