package eHospitalLogin;

import java.sql.*;

// Referenced classes of package eHospitalLogin:
//            ConnectionManager

public class Validate
{

    public Validate()
    {
    }

    public static boolean checkUser(String email, String pass)
    {
        boolean st = false;
        try
        {
            con = ConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }

    public static int checkUserid(String username)
    {
        int userId = 0;
        try
        {
            con = ConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from users where username=?");
            ps.setString(1, username);
            for(ResultSet rs = ps.executeQuery(); rs.next();)
                userId = rs.getInt("id");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return userId;
    }

    static Connection con = null;

}