package eHospitalUserManagement;

import eHospitalLogin.ConnectionManager;
import java.io.PrintStream;
import java.sql.*;

// Referenced classes of package eHospitalUserManagement:
//            UserBean

public class UserDAO
{

    public UserDAO()
    {
    }

    public static UserBean login(UserBean bean)
    {
        Statement stmt;
        String searchQuery;
        stmt = null;
        String username = bean.getUsername();
        String password = bean.getPassword();
        searchQuery = (new StringBuilder("select * from users where username='")).append(username).append("' AND password='").append(password).append("'").toString();
        System.out.println((new StringBuilder("Your user name is ")).append(username).toString());
        System.out.println((new StringBuilder("Your password is ")).append(password).toString());
        System.out.println((new StringBuilder("Query: ")).append(searchQuery).toString());
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();
            if(!more)
            {
                System.out.println("Sorry, you are not a registered user! Please sign up first");
                bean.setValid(false);
            } else
            if(more)
            {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                System.out.println((new StringBuilder("Welcome ")).append(firstName).toString());
                bean.setFirst_name(firstName);
                bean.setLast_name(lastName);
                bean.setValid(true);
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
        return bean;
    }

    public static UserBean setUser(int Id)
    {
        Statement stmt;
        UserBean user;
        String getQuery;
        stmt = null;
        user = new UserBean();
        getQuery = (new StringBuilder("Select * from users where id='")).append(Id).append("'").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            for(rs = stmt.executeQuery(getQuery); rs.next(); user.setSecret_answer(rs.getString("secret_answer")))
            {
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setFirst_name(rs.getString("first_name"));
                user.setLast_name(rs.getString("last_name"));
                user.setSecret_question(rs.getString("secret_question"));
            }


        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Insert failed: An Exception has occurred! ")).append(ex).toString());
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
        return user;
    }

    public static UserBean createuser(UserBean thisBean)
    {
        Statement stmt;
        String insertQuery;
        stmt = null;
        String username = thisBean.getUsername();
        String password = thisBean.getPassword();
        String firstname = thisBean.getFirst_name();
        String lastname = thisBean.getLast_name();
        String email = thisBean.getEmail();
        String secretquestion = thisBean.getSecret_question();
        String secretanswer = thisBean.getSecret_answer();
        insertQuery = (new StringBuilder("INSERT INTO users (username,password,first_name,last_name,  email,secret_question,secret_answer) VALUES ( '")).append(username).append("','").append(password).append("','").append(firstname).append("','").append(lastname).append("'").append(" '").append(email).append("','").append(secretquestion).append("','").append(secretanswer).append("') ").toString();
        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(insertQuery);
            boolean inserted = rs.rowInserted();
            if(!inserted)
            {
                System.out.println("Sorry, The record was not inserted");
                thisBean.setInserted(false);
            } else
            if(inserted)
                thisBean.setInserted(true);

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println((new StringBuilder("Insert failed: An Exception has occurred! ")).append(ex).toString());
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
        return thisBean;
    }

    static Connection currentCon = null;
    static ResultSet rs = null;

}