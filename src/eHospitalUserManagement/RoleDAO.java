package eHospitalUserManagement;

import eHospitalLogin.ConnectionManager;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;

// Referenced classes of package eHospitalUserManagement:
//            RoleBean

public class RoleDAO
{

    public RoleDAO()
    {
    }

    public static RoleBean saveRole(RoleBean role)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
        String rolename = role.getRole();
        String description = role.getRole_description();
        String created_by = role.getCreated_by();
        String date_created = role.getDate_created();
        String appName = role.getApp_name();
        String appUrl= StringEscapeUtils.escapeJava(role.getApp_url());
        System.out.println(appUrl);
        System.out.println(role.getApp_url());
        String role_id = role.getRole_id();
        String icon_name = role.getIcon_name();
        insertQuery ="INSERT INTO  roles (role,role_id,app_url,app_name,icon_name,role_description,created_by,date_created)  VALUES(?,?,?,?,?,?,?,?,?) ";

        try
        {
            currentCon = ConnectionManager.getConnection();
            PreparedStatement ps = currentCon.prepareStatement(insertQuery);
            ps.setString(1, rolename);
            ps.setString(2, role_id);
            ps.setString(3, appUrl);
            ps.setString(4, appName);
            ps.setString(5, icon_name);
            ps.setString(6, description);
            ps.setString(7, created_by);
            ps.setString(8, date_created);
           // stmt = currentCon.createStatement();
            int inserted = ps.executeUpdate();

         //   boolean inserted = rs.rowInserted();
            if(inserted==0)
            {
                System.out.println("Sorry, The record was not inserted");
                role.setInserted(false);
            }
            else if(inserted==1)
            {
                role.setInserted(true);
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Could not insert role ")).append(ex).toString());
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
        return role;
    }


    public static RoleBean updateRole(RoleBean role)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
        String rolename = role.getRole();
        String description = role.getRole_description();
        String changed_by = role.getChanged_by();
        String date_changed = role.getDate_changed();
        String appName = role.getApp_name();
        String appUrl= role.getApp_url();
        String iconName= role.getIcon_name();
        String role_id = role.getRole_id();
        insertQuery = "UPDATE  roles SET role=?,role_description=?," +
                "changed_by=?," +
                "date_changed=?," +
                "app_url=?," +
                "icon_name=?," +
                "app_name=?" +
                "Where role_id=? ";
        try
        {
            currentCon = ConnectionManager.getConnection();
            PreparedStatement ps=currentCon.prepareStatement(insertQuery);
            ps.setString(1, rolename);
            ps.setString(2, description);
            ps.setString(3, changed_by);
            ps.setString(4, date_changed);
            ps.setString(5, appUrl);
            ps.setString(6, iconName);
            ps.setString(7, appName);
            ps.setString(8, role_id);

            int inserted = ps.executeUpdate();

            //   boolean inserted = rs.rowInserted();
            if(inserted==0)
            {
                System.out.println("Sorry, The record was not updated");
                role.setInserted(false);
            }
            else if(inserted==1)
            {
                role.setInserted(true);
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Could not update role ")).append(ex).toString());
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
        return role;
    }

    public static RoleBean removeRole(RoleBean role)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
       String role_id = role.getRole_id();
        insertQuery = "UPDATE  roles Set voided=1 Where role_id='"+role_id+"' ";
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            int inserted = stmt.executeUpdate(insertQuery);

            //   boolean inserted = rs.rowInserted();
            if(inserted==0)
            {
                System.out.println("Sorry, The record was not updated");
                role.setInserted(false);
            }
            else if(inserted==1)
            {
                role.setInserted(true);
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Could not update role ")).append(ex).toString());
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
        return role;
    }




    public static ArrayList<RoleBean> viewRoles()
    {
        Statement stmt;
        ArrayList<RoleBean> roles;
        String searchQuery;
        stmt = null;
        roles = new ArrayList();
        searchQuery = "select * from roles where voided=0";
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();

            for(rs = stmt.executeQuery(searchQuery); rs.next();)
            {
                RoleBean role= new RoleBean();
                role.setRole(rs.getString("role"));
                role.setRole_description(rs.getString("role_description"));
                role.setDate_created(rs.getString("date_created"));
                role.setCreated_by(rs.getString("created_by"));
                role.setRole_id(rs.getString("role_id"));
                role.setRoleId(rs.getString("id"));
                role.setApp_url(rs.getString("app_url"));
                role.setApp_name(rs.getString("app_name"));
                role.setIcon_name(rs.getString("icon_name"));
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

    public static RoleBean viewRole(RoleBean role)
    {
        Statement stmt;

        String searchQuery;
        stmt = null;
      //  role = new RoleBean();
        searchQuery = (new StringBuilder("select * from roles WHERE voided=0 And role_id= '")).append(role.getRole_id()).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            for(rs = stmt.executeQuery(searchQuery); rs.next(); role.setCreated_by(rs.getString("created_by")))
            {
                role.setRole(rs.getString("role"));
                role.setApp_url(rs.getString("app_url"));
                role.setApp_name(rs.getString("app_name"));
                role.setIcon_name(rs.getString("icon_name"));
                role.setRole_description(rs.getString("role_description"));
                role.setDate_created(rs.getString("date_created"));
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
        return role;
    }

    static Connection currentCon = null;
    static ResultSet rs = null;

}