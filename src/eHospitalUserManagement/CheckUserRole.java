package eHospitalUserManagement;

import eHospitalLogin.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static eHospitalUserManagement.UserDAO.toMD5;

/**
 * Created with IntelliJ IDEA.
 * User: titus
 * Date: 11/27/13
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckUserRole

{

    static Connection currentCon = null;
    static ResultSet rs = null;
    public CheckUserRole()
    {
    }







    public static List checkRoles(String userid)
    {
        Statement stmt;
        //ArrayList userroles;
        List<String> userroles = new ArrayList<String>();
        String searchQuery;
        stmt = null;
       // userroles = new ArrayList();
        searchQuery = "select * from user_roles where user_id='+.userid.+'";
        try
        {
            currentCon = ConnectionManager.getConnection();

            PreparedStatement ps = currentCon.prepareStatement("select * from user_roles where user_id=?");
            ps.setString(1, userid);
        //    stmt = currentCon.createStatement();
            RoleBean role;
            String thisuserroles;
            for(rs = ps.executeQuery(); rs.next(); )
            {
                String roleid=rs.getString("role_id");
                thisuserroles=  roleid+":";
                searchQuery = "select * from roles where role_id='"+roleid+"'";
                stmt = currentCon.createStatement();
                ResultSet roleset= stmt.executeQuery(searchQuery);
                while(roleset.next())
                {
                    thisuserroles=thisuserroles+ roleset.getString("role")+":"+ roleset.getString("role_description")+":"+ roleset.getString("app_url");

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


                    userroles.add(thisuserroles);

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
        return userroles;
    }



   static Connection con = null;


}
