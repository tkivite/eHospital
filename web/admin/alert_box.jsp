<%--
  Created by IntelliJ IDEA.
  User: titus
  Date: 9/17/13
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>

<div id="user_profile_div" style="height: 350px; width: 600px ">
    <ul>
        <li>

            <section class="container">
                <div class="login">
                    <table>
                        <tr>
                            <td style="text-align: right; border: none"> <h1 class="JSPOPUP_titleBar">Response </h1></td>
                            <td style="text-align: right; border: none"><h1><span style="text-align: right"><a id="closealertbox" class="JSPOPUP_close" href="#" >
                                <img src="resources/img/close.png" alt="Close" />
                            </a></span></h1></td>
                        </tr>
                    </table>



                        <p><%=request.getParameter("response")%> </p>



                </div>


            </section>
        </li>
    </ul>
    <input type="hidden" id="roleId" name="roleId" value=""    />

</div>