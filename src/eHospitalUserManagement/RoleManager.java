package eHospitalUserManagement;

import eHospitalUtilities.javaDateToMysqlDateTime;

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



    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String roleid= request.getParameter("roleId");
        //  System.out.println("action"+request.getParameter("action"));
        String action= request.getParameter("action");
        if(action.equals("Remove"))
        {
            RoleBean role = new RoleBean();
            //  System.out.println(roleid);
            role.setRole_id(request.getParameter("roleId"));
            //   System.out.println("remove");
            role = RoleDAO.removeRole(role);
            if(role.isInserted())
            {
                //  response.sendRedirect("/newrole");
                out.println("role voided");
            }
            else
            {
                out.println("Error removing role");
            }


        }
        else if(action.equals("Edit"))
        {
            try

            {
                RoleBean role = new RoleBean();
                role.setRole(request.getParameter("rolename"));
                role.setRole_description(request.getParameter("role_description"));
                role.setChanged_by(request.getRemoteUser());
                role.setDate_changed(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
                role.setRole_id(request.getParameter("roleId"));
                role.setApp_name((request.getParameter("app_name")));
                role.setApp_url((request.getParameter("app_url")));
                role.setIcon_name((request.getParameter("icon_name")));
                role = RoleDAO.updateRole(role);
                if(role.isInserted())
                {
                    //  response.sendRedirect("/newrole");
                    out.println("role saved");
                }
                else
                {
                    out.println("Error saving  role");
                }




            }
            catch(Throwable theException)
            {
                System.out.println(theException);
            }

        }


        else
          {
            try

            {
                RoleBean role = new RoleBean();
                role.setRole(request.getParameter("rolename"));
                role.setRole_description(request.getParameter("role_description"));
                role.setCreated_by(request.getRemoteUser());
                role.setDate_created(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
                role.setRole_id(request.getParameter("rolename").toLowerCase());
                role.setApp_name((request.getParameter("app_name")));
                role.setApp_url((request.getParameter("app_url")));
                role.setIcon_name((request.getParameter("icon_name")));

                role = RoleDAO.saveRole(role);
                if(role.isInserted())
                {
                    //  response.sendRedirect("/newrole");
                    out.println("new role saved");
                }
                else
                {
                    out.println("Error saving new role");
                }

            }
            catch(Throwable theException)
            {
                System.out.println(theException);
            }

    }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();



       // System.out.println("RoleId"+request.getParameter("roleId"));
        String roleid= request.getParameter("roleId");
      //  System.out.println("action"+request.getParameter("action"));
        String action= request.getParameter("action");
        if(action.equals("Remove"))
        {
            RoleBean role = new RoleBean();
          //  System.out.println(roleid);
            role.setRole_id(request.getParameter("roleId"));
           //   System.out.println("remove");
                role = RoleDAO.removeRole(role);

            if(role.isInserted())
            {
                //  response.sendRedirect("/newrole");
                out.println("role voided");
            }
            else
            {
                out.println("Error removing role");
            }

        }
        else if(action.equals("Edit"))
        {
            try

            {
                RoleBean role = new RoleBean();
                role.setRole(request.getParameter("rolename"));
                role.setRole_description(request.getParameter("role_description"));
                role.setChanged_by(request.getRemoteUser());
                role.setDate_changed(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
                role.setRole_id(request.getParameter("roleId"));
                role.setApp_name((request.getParameter("app_name")));
                role.setApp_url((request.getParameter("app_url")));
                role.setIcon_name((request.getParameter("icon_name")));
                   System.out.println(role.getRole_description());
                role = RoleDAO.updateRole(role);
                if(role.isInserted())
                {
                    //  response.sendRedirect("/newrole");
                    out.println("role saved");
                }
                else
                {
                    out.println("Error saving role");
                }




            }
            catch(Throwable theException)
            {
                System.out.println(theException);
            }

        }
        else
        {

        try

        {
            RoleBean role = new RoleBean();
            role.setRole(request.getParameter("rolename"));
            role.setRole_description(request.getParameter("role_description"));
            role.setCreated_by(request.getRemoteUser());
            role.setDate_created(javaDateToMysqlDateTime.convertCurrentDateToMysqlDateTime());
            role.setRole_id(request.getParameter("rolename").toLowerCase());
            role.setApp_name((request.getParameter("app_name")));
            role.setApp_url((request.getParameter("app_url")));
            role.setIcon_name((request.getParameter("icon_name")));

            role = RoleDAO.saveRole(role);
            if(role.isInserted())
            {
                //  response.sendRedirect("/newrole");
                out.println("new role saved");
            }
            else
            {
                out.println("Error saving new role");
            }

         }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }

    }
}
}