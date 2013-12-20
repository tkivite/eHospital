package eHospitalUserManagement;


import java.util.List;

public class UserRoleBean
{

    public UserRoleBean()
    {
    }

    private List<String> user_role;
    private List<String> user_role_id;
    private String user_id;
    private String created_by;
    private String date_created;
    private String changed_by;
    private String date_changed;
    public boolean exists;
    public boolean inserted;

    public boolean isInserted() {
        return inserted;
    }

    public void setInserted(boolean inserted) {
        this.inserted = inserted;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public String getDate_changed() {
        return date_changed;
    }

    public void setDate_changed(String date_changed) {
        this.date_changed = date_changed;
    }

    public String getChanged_by() {
        return changed_by;
    }

    public void setChanged_by(String changed_by) {
        this.changed_by = changed_by;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public List<String> getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(List<String> user_role_id) {
        this.user_role_id = user_role_id;
    }

    public List<String> getUser_role() {

        return user_role;
    }

    public void setUser_role(List<String> user_role) {
        this.user_role = user_role;
    }





}