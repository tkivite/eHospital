package eHospitalLogin;

import eHospitalUserManagement.UserBean;
import eHospitalUserManagement.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// Referenced classes of package eHospitalLogin:
//            Validate

public class Login extends HttpServlet
{

    public Login()
    {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("username");
        String pass = request.getParameter("password");
        if(Validate.checkUser(email, pass))
        {
            int userId = Validate.checkUserid(email);
            UserBean user = new UserBean();
            user = UserDAO.setUser(userId);
            HttpSession session = request.getSession(true);
            session.setAttribute("currentSessionUser", user);
            RequestDispatcher rs = request.getRequestDispatcher("home1.jsp");
            rs.forward(request, response);
        } else
        {
            request.setAttribute("loginResult", Boolean.valueOf(true));
            out.println("Username or Password incorrect");
            RequestDispatcher rs = request.getRequestDispatcher("invalidLogin.jsp");
            rs.include(request, response);
        }
    }
}