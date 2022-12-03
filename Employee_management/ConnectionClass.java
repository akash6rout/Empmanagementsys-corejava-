package Employee_management;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionClass 
{
    public static Connection getConnect()
    {
        Connection cn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","123456789");
            /*if(cn!=null)
            {
                System.out.println("Connected");
            }
            else
            {
                System.err.println("Not Connected");
            }*/
        }catch(SQLException se)
            {
                 se.printStackTrace();
            }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Class Not Found.");
        }
        finally{
           return cn;
        }
                      
    }
}