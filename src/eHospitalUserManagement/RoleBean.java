package eHospitalUserManagement;


public class RoleBean
{

    public RoleBean()
    {
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getRole_description()
    {
        return role_description;
    }

    public void setRole_description(String role_description)
    {
        this.role_description = role_description;
    }

    public String getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(String created_by)
    {
        this.created_by = created_by;
    }

    public String getDate_created()
    {
        return date_created;
    }

    public void setDate_created(String date_created)
    {
        this.date_created = date_created;
    }

    public String getChanged_by()
    {
        return changed_by;
    }

    public void setChanged_by(String changed_by)
    {
        this.changed_by = changed_by;
    }

    public String getDate_changed()
    {
        return date_changed;
    }

    public void setDate_changed(String date_changed)
    {
        this.date_changed = date_changed;
    }

    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    public boolean isExists()
    {
        return exists;
    }

    public void setExists(boolean exists)
    {
        this.exists = exists;
    }

    public boolean isInserted()
    {
        return inserted;
    }

    public void setInserted(boolean inserted)
    {
        this.inserted = inserted;
    }

    private String role;
    private String roleId;
    private String role_description;
    private String created_by;
    private String date_created;
    private String changed_by;
    private String date_changed;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public RoleBean getRole(String role_id) {
        RoleBean role=new RoleBean();
        role.setRole_id(role_id);
        role=RoleDAO.viewRole(role);
        return role;
    }


    private String role_id;

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public void setApp_url(String app_url) {
        this.app_url = app_url;
    }

    public String getApp_url() {
        return app_url;
    }

    public String getApp_name() {
        return app_name;
    }

    public String getIcon_name() {
        return icon_name;
    }

    public void setIcon_name(String icon_name) {
        this.icon_name = icon_name;
    }


    private String app_url;
    private String app_name;

   private String icon_name;


    public boolean exists;
    public boolean inserted;
}