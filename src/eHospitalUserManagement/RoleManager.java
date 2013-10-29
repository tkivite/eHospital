package eHospitalUserManagement;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// Referenced classes of package eHospitalUserManagement:
//            RoleBean, RoleDAO

public class RoleManager extends HttpServlet
{

    public RoleManager()
    {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            RoleBean role = new RoleBean();
            role.setRole(request.getParameter("rolename"));
            role.setRole_description(request.getParameter("description"));
            role.setCreated_by(request.getParameter("created_by"));
            role.setDate_created(request.getParameter("date_created"));
            role = RoleDAO.saveRole(role);
            if(role.isInserted())
                response.sendRedirect("view_roles.jsp");
            else
                response.sendRedirect("new_role.jsp");
        }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
    }
}