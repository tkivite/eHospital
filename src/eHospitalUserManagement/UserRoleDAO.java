package eHospitalUserManagement;

import eHospitalLogin.ConnectionManager;
import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package eHospitalUserManagement:
//            RoleBean

public class UserRoleDAO
{

    public UserRoleDAO()
    {
    }

    public static UserRoleBean saveUserRole(UserRoleBean userrole)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
        List<String> rolename = userrole.getUser_role();
        String user_id = userrole.getUser_id();
        String created_by = userrole.getCreated_by();
        String date_created = userrole.getDate_created();
        int i=0;
        while(rolename.size()>i)
        {
           // String role_id=rolename.get(i);
            String[] rolesplit=  (rolename.get(i)).split("$");

            String role_id=rolesplit[0];
            String deleteQuery=   "Delete From user_roles where user_id='"+user_id+"' and role_id NOT IN ('admin') ";
            insertQuery = (new StringBuilder("INSERT INTO  user_roles  (user_id,role_id,created_by,date_created)  VALUES('")).append(user_id).append("','").append(role_id).append("','").append(created_by).append("','").append(date_created).append("') ").toString();

            try
            {
                currentCon = ConnectionManager.getConnection();
                stmt = currentCon.createStatement();
                int del=  stmt.executeUpdate(deleteQuery);
                int rs = stmt.executeUpdate(insertQuery);
               // boolean inserted = rs.rowInserted();
                if(rs==0)
                {
                    userrole.setInserted(false);

                    System.out.println((new StringBuilder("Some roles were not inserted")));
                }


            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                System.out.println((new StringBuilder("Could not insert role ")).append(ex).toString());
            }



            i++;
        }
      if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }
        return userrole;
    }

    public static int saveUserRoles(UserRoleBean role, String[] values)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
        //String roleid;
        String user_id = role.getUser_id();
        String created_by = role.getCreated_by();
        String date_created = role.getDate_created();
        currentCon = ConnectionManager.getConnection();
        int i=0;
        int insertedroles=0;
        String deleteQuery=   "Delete From user_roles where user_id='"+user_id+"' and role_id NOT IN ('admin') ";
        try
        {

            stmt = currentCon.createStatement();
            int del=  stmt.executeUpdate(deleteQuery);
            if(del==1)
            {
                System.out.println((new StringBuilder("Deleted user roles")));

            }
            else
            {
                System.out.println((new StringBuilder("Could not delete user roles")));
            }
        }
       catch(Exception ex)
            {
                ex.printStackTrace();
                System.out.println((new StringBuilder("Could not insert role ")).append(ex).toString());
            }


        while(values.length > i)
        {
            String role_id=values[i];
         //   System.out.println(role_id);

             insertQuery = (new StringBuilder("INSERT INTO  user_roles  (user_id,role_id,created_by,date_created)  VALUES('")).append(user_id).append("','").append(role_id).append("','").append(created_by).append("','").append(date_created).append("') ").toString();
          //  System.out.println(insertQuery);
            try
            {

                stmt = currentCon.createStatement();

                int rs = stmt.executeUpdate(insertQuery);
                if(rs==1)
                {
                    insertedroles++;

                }
                else
                {

                    role.setInserted(false);
                //    System.out.println((new StringBuilder("Some roles were not inserted")));
                }

             //   System.out.println((new StringBuilder(insertedroles+"were inserted")));

            }
            catch(Exception ex)
            {
                ex.printStackTrace();
                System.out.println((new StringBuilder("Could not insert user role ")).append(ex).toString());
            }



            i++;
        }
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }
        return insertedroles;
    }

    public static ArrayList viewUserRoles()
    {
        Statement stmt;
        ArrayList roles;
        String searchQuery;
        stmt = null;
        roles = new ArrayList();
        searchQuery = "select * from roles";
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            RoleBean role;
            for(rs = stmt.executeQuery(searchQuery); rs.next();)
            {
                role = new RoleBean();
                role.setRole(rs.getString("role"));
                role.setApp_name(rs.getString("app_name"));
                role.setApp_url(rs.getString("app_url"));
                role.setApp_url(rs.getString("icon_name"));
                role.setRole_description(rs.getString("role_description"));
                role.setDate_created(rs.getString("date_created"));
                role.setCreated_by(rs.getString("created_by"));
                roles.add(role);
            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Log In failed: An Exception has occurred! ")).append(ex).toString());
        }
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }
        return roles;
    }

    public static UserRoleBean viewUserRole( UserRoleBean role)
    {
        Statement stmt;

        String user_id=role.getUser_id();
        String searchQuery;
        List<String> theuserroles;
        theuserroles=new ArrayList<String>();
        stmt = null;
        role = new UserRoleBean();
        searchQuery = (new StringBuilder("select * from user_roles WHERE user_id= '")).append(user_id).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();

            PreparedStatement ps = currentCon.prepareStatement("select * from user_roles where user_id=? and role_id <>? ");
            ps.setString(1, user_id);
            ps.setString(2, "admin");
            //    stmt = currentCon.createStatement();
            //UserRoleBean role;
            String thisuserroles;
            for(rs = ps.executeQuery(); rs.next(); )
            {
                String roleid=rs.getString("role_id");
                thisuserroles=  roleid+"$";
                searchQuery = "select * from roles where role_id='"+roleid+"'";
                stmt = currentCon.createStatement();
                ResultSet roleset= stmt.executeQuery(searchQuery);
                while(roleset.next())
                {
                    thisuserroles=thisuserroles+ roleset.getString("role")+"$"+ roleset.getString("role_description")+"$"+ roleset.getString("app_url")+"$"+ roleset.getString("app_name")+"$"+ roleset.getString("icon_name");

                }
                if(roleset != null)
                {
                    try
                    {
                        roleset.close();
                    }
                    catch(Exception exception1) { }
                    roleset=null;

                }


                theuserroles.add(thisuserroles);

            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Checking roles Failed: An Exception has occurred! ")).append(ex).toString());
        }
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }
        role.setUser_role(theuserroles);
        return role;
    }

    public static boolean isAdmin( String userid)
    {
        Statement stmt;

         boolean isadmin=false;
        String searchQuery;


        stmt = null;

        searchQuery = (new StringBuilder("select * from user_roles WHERE user_id= '")).append(userid).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();

            PreparedStatement ps = currentCon.prepareStatement("select * from user_roles where user_id=?");
            ps.setString(1, userid);
            //    stmt = currentCon.createStatement();
            //UserRoleBean role;
            String thisuserroles;
            for(rs = ps.executeQuery(); rs.next(); )
            {
                String roleid=rs.getString("role_id");
                searchQuery = "select * from roles where role_id='"+roleid+"'";
                stmt = currentCon.createStatement();
                ResultSet roleset= stmt.executeQuery(searchQuery);
                while(roleset.next())
                {
                    if(roleset.getString("role").equals("Admin"))
                    {
                      isadmin=true;
                    }

                }
                if(roleset != null)
                {
                    try
                    {
                        roleset.close();
                    }
                    catch(Exception exception1) { }
                    roleset=null;

                }




            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Checking roles Failed: An Exception has occurred! ")).append(ex).toString());
        }
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }

        return isadmin;
    }





    public static UserRoleBean setUserRole( UserRoleBean role,String[] values)
    {
        Statement stmt;

        String user_id=role.getUser_id();
        String searchQuery;
        List<String> theuserroles;
        theuserroles=new ArrayList<String>();
        stmt = null;
        //role = new UserRoleBean();
        int i=0;
        while(values.length >i)
        {
        String role_id= values[i];
        // searchQuery = (new StringBuilder("select * from roles WHERE user_id= '")).append(user_id).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();

            PreparedStatement ps = currentCon.prepareStatement("select * from roles where role_id=?");
            ps.setString(1, role_id);
            //    stmt = currentCon.createStatement();
           // UserRoleBean role;
            String thisuserroles;
            for(rs = ps.executeQuery(); rs.next(); )
            {
                thisuserroles=  role_id+":";
                thisuserroles=    thisuserroles+rs.getString("role")+":"+ rs.getString("role_description")+":"+ rs.getString("app_url");


                theuserroles.add(thisuserroles);

            }



        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Checking roles Failed: An Exception has occurred! ")).append(ex).toString());
        }
        }
        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception1) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception2) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception3) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception4) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception5) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception6) { }
            currentCon = null;
        }

        if(rs != null)
        {
            try
            {
                rs.close();
            }
            catch(Exception exception7) { }
            rs = null;
        }
        if(stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception exception8) { }
            stmt = null;
        }
        if(currentCon != null)
        {
            try
            {
                currentCon.close();
            }
            catch(Exception exception9) { }
            currentCon = null;
        }
        role.setUser_role(theuserroles);
        return role;

    }




















    static Connection currentCon = null;
    static ResultSet rs = null;

}