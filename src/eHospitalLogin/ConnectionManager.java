package eHospitalLogin;

import java.io.PrintStream;
import java.sql.*;

public class ConnectionManager
{

    public ConnectionManager()
    {
    }

    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            try
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost/eHospital", "root", "SUPERtitus");
            }
            catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return con;
    }

    static Connection con;
    static String url;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/eHospital";
    static final String USER = "root";
    static final String PASS = "SUPERtitus";
}