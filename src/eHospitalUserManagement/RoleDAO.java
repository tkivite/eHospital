package eHospitalUserManagement;

import eHospitalLogin.ConnectionManager;
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
        insertQuery = (new StringBuilder("INSERT INTO  roles  (role,role_description,created_by,date_created)  VALUES('")).append(rolename).append("','").append(description).append("','").append(created_by).append("','").append(date_created).append("') ").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(insertQuery);
            boolean inserted = rs.rowInserted();
            if(!inserted)
            {
                System.out.println("Sorry, The record was not inserted");
                role.setInserted(false);
            }
            else if(inserted)
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

    public static ArrayList viewRoles()
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
            for(rs = stmt.executeQuery(searchQuery); rs.next(); roles.add(role))
            {
                role = new RoleBean();
                role.setRole(rs.getString("role"));
                role.setRole_description(rs.getString("role_description"));
                role.setDate_created(rs.getString("date_created"));
                role.setCreated_by(rs.getString("created_by"));
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

    public static RoleBean viewRole()
    {
        Statement stmt;
        RoleBean role;
        String searchQuery;
        stmt = null;
        role = new RoleBean();
        searchQuery = (new StringBuilder("select * from roles WHERE id= '")).append(role.getRoleId()).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            for(rs = stmt.executeQuery(searchQuery); rs.next(); role.setCreated_by(rs.getString("created_by")))
            {
                role.setRole(rs.getString("role"));
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