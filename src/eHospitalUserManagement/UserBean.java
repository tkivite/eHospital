package eHospitalUserManagement;


import java.util.ArrayList;
import java.util.Map;

public class UserBean
{

    public UserBean()
    {
    }

    public String getEmail()
    {
        return email;
    }

    public String getSecret_question()
    {
        return secret_question;
    }

    public void setSecret_question(String secret_question)
    {
        this.secret_question = secret_question;
    }

    public String getSecret_answer()
    {
        return secret_answer;
    }

    public void setSecret_answer(String secret_answer)
    {
        this.secret_answer = secret_answer;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirst_name()
    {
        return first_name;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

    public boolean isValid()
    {
        return valid;
    }

    public void setValid(boolean newValid)
    {
        valid = newValid;
    }

    public boolean inserted()
    {
        return inserted;
    }

    public void setInserted(boolean newInsert)
    {
        inserted = newInsert;
    }

    public String getConfirm_password()
    {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password)
    {
        this.confirm_password = confirm_password;
    }
    public ArrayList get_Users()
    {


      return UserDAO.getAllUsers();
    }

    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String email;
    private String secret_question;
    private String secret_answer;
    private String confirm_password;
    public boolean valid;
    public boolean inserted;
}