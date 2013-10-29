package eHospitalUserManagement;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// Referenced classes of package eHospitalUserManagement:
//            UserBean, UserDAO

public class UserManager extends HttpServlet
{

    public UserManager()
    {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            UserBean user = new UserBean();
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setLast_name(request.getParameter("lastname"));
            user.setFirst_name(request.getParameter("firstname"));
            user.setEmail(request.getParameter("email"));
            user.setSecret_question(request.getParameter("secretquestion"));
            user.setSecret_answer(request.getParameter("secretanswer"));
            user.setSecret_answer(request.getParameter("confirm_password"));
            if(user.getPassword() != user.getConfirm_password())
            {
                out.println("Password do not match");
            } else
            {
                user = UserDAO.createuser(user);
                if(user.inserted())
                    response.sendRedirect("home.jsp");
                else
                    response.sendRedirect("login.jsp");
            }
        }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
    }
}