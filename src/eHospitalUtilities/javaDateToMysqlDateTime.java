package eHospitalUtilities;

/**
 * Created with IntelliJ IDEA.
 * User: titus
 * Date: 12/2/13
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class javaDateToMysqlDateTime
{
    public void  javaDateToMysqlDateTime()
    {}


    public static String convertCurrentDateToMysqlDateTime()
    {

    java.util.Date dt = new java.util.Date();

    java.text.SimpleDateFormat sdf =
            new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String currentTime = sdf.format(dt);
        return    currentTime;
    }
}
