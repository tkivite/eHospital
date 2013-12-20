package eHospitalUserManagement;

import eHospitalUtilities.javaDateToMysqlDateTime;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// Referenced classes of package eHospitalUserManagement:
//            RoleBean, RoleDAO

public class UserRoleManager extends HttpServlet
{

    public UserRoleManager()
    {
    }



    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();


        try
        {
            UserRoleBean role = new UserRoleBean();
            role.setUser_id(request.getParameter("user_id"));
            String roles=  request.getParameter("userrole");
            System.out.println(roles);
            String[] values=roles.split("$");

           // String[] values = request.getParameterValues("userrole");
            role.setDate_changed(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
            role.setCreated_by(request.getRemoteUser());
            role.setDate_created(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());

           // role.setUser_role(theroles);

           // UserRoleDAO.setUserRole(role,values);


            int status = UserRoleDAO.saveUserRoles(role,values);
            if(status < values.length)
                out.println((values.length-status)+ "roles were not updated");
            else if(status == values.length)
                out.println("User Roles Updated Successfully");
            else
                out.println("An error occured");
        }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {

            UserRoleBean role = new UserRoleBean();
            role.setUser_id(request.getParameter("user_id"));
            String roles=  request.getParameter("userrole");
            System.out.println(roles);
            String[] values=roles.split("\\$");
            System.out.println(values[0]);

            // String[] values = request.getParameterValues("userrole");
            role.setDate_changed(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
            role.setCreated_by(request.getRemoteUser());
            role.setDate_created(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());

            // role.setUser_role(theroles);

            // UserRoleDAO.setUserRole(role,values);


            int status = UserRoleDAO.saveUserRoles(role,values);
            if(status < values.length)
                out.println((values.length-status)+ "roles were not updated");
            else if(status == values.length)
                out.println("User Roles Updated Successfully");
            else
                out.println("An error occured");
        }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
    }
}