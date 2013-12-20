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
        String action=request.getParameter("action");
        String userid= request.getParameter("userid");

        if(action.equals("Remove"))
        {
            UserBean user = new UserBean();
            //  System.out.println(roleid);
            user.setUsername(userid);
            //   System.out.println("remove");
            if(UserDAO.removeUser(user)==1)
                out.println("user voided");
            else
                out.println("User was not voided. Problems occurred");
        }
        else if(action.equals("Edit"))
        {
            try
            {
                UserBean user = new UserBean();
                // user.setUsername(userid);
                user.setUsername(request.getParameter("username"));
                user.setPassword(request.getParameter("password"));
                user.setLast_name(request.getParameter("lastname"));
                user.setFirst_name(request.getParameter("firstname"));
                user.setEmail(request.getParameter("email"));
                user.setSecret_question(request.getParameter("secretquestion"));
                user.setSecret_answer(request.getParameter("secretanswer"));
                user.setConfirm_password(request.getParameter("confirm_password"));

                if(!(user.getPassword()).equals(user.getConfirm_password()) )
                {
                    out.println("Password do not match");


                } else
                {
                    user = UserDAO.updateuser(user);
                    if(user.inserted())
                        out.println("user saved");
                    else
                        out.println("an error occurred while updating user information");
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
            UserBean user = new UserBean();
            user.setUsername(request.getParameter("username"));
            user.setPassword(request.getParameter("password"));
            user.setLast_name(request.getParameter("lastname"));
            user.setFirst_name(request.getParameter("firstname"));
            user.setEmail(request.getParameter("email"));
            user.setSecret_question(request.getParameter("secretquestion"));
            user.setSecret_answer(request.getParameter("secretanswer"));
            user.setConfirm_password(request.getParameter("confirm_password"));

            if(!(user.getPassword()).equals(user.getConfirm_password()) )
            {
                out.println("Password do not match");


            } else
            {
                user = UserDAO.createuser(user);
                if(user.inserted())
                    out.println("user saved");
                else
                    out.println("an error occurred while saving the new user");
            }
        }
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
    }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action=request.getParameter("action");
        String userid= request.getParameter("userid");

        if(action.equals("Remove"))
        {
            UserBean user = new UserBean();
            //  System.out.println(roleid);
            user.setUsername(userid);
            //   System.out.println("remove");
            if(UserDAO.removeUser(user)==1)
                out.println("user voided");
            else
                out.println("User was not voided. Problems occurred");
        }
        else if(action.equals("Edit"))
        {
            try
            {
                UserBean user = new UserBean();
                user.setUsername(userid);
                user.setUsername(request.getParameter("username"));

                user.setPassword(request.getParameter("password"));
                user.setLast_name(request.getParameter("lastname"));
                user.setFirst_name(request.getParameter("firstname"));
                user.setEmail(request.getParameter("email"));
                user.setSecret_question(request.getParameter("secretquestion"));
                user.setSecret_answer(request.getParameter("secretanswer"));
                user.setConfirm_password(request.getParameter("confirm_password"));

                if(!(user.getPassword()).equals(user.getConfirm_password()) )
                {
                    out.println("Password do not match");


                } else
                {
                    user = UserDAO.updateuser(user);
                    if(user.inserted())
                        out.println("user saved");
                    else
                        out.println("an error occurred while updating user information");
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
                UserBean user = new UserBean();
                user.setUsername(request.getParameter("username"));
                user.setPassword(request.getParameter("password"));
                user.setLast_name(request.getParameter("lastname"));
                user.setFirst_name(request.getParameter("firstname"));
                user.setEmail(request.getParameter("email"));
                user.setSecret_question(request.getParameter("secretquestion"));
                user.setSecret_answer(request.getParameter("secretanswer"));
                user.setConfirm_password(request.getParameter("confirm_password"));

                if(!(user.getPassword()).equals(user.getConfirm_password()) )
                {
                    out.println("Password do not match");


                } else
                {
                    user = UserDAO.createuser(user);
                    if(user.inserted())
                        out.println("user saved");
                    else
                        out.println("an error occurred while saving the new user");
                }
            }
            catch(Throwable theException)
            {
                System.out.println(theException);
            }
        }


    }
}