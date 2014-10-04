package dao;
import java.sql.*;
public class daoservice {
    private static Connection con;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/stpnoida";
            con=DriverManager.getConnection(url,"root","ankur123");
                    }
        catch(Exception e)
                {
                    System.out.println("connection error"+e.getMessage());
                }
            }
    public Connection getConnection()
    {
        return con;
    }
    public static int updatedata(String dmlquery)
    {
        try
        {
            Statement st=con.createStatement();
            int ur=st.executeUpdate(dmlquery);
            return ur;
        }
        catch(Exception e)
        {
            System.out.println("dml error"+e.getMessage());
        return 0;
        }
    }
    public static ResultSet selectdata(String projquery)
    {
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(projquery);
            return rs;
        }
        catch(Exception e)
        {
            System.out.println("projection query error"+e.getMessage());
            return null;
        }
    }
    public static PreparedStatement getPreparedStatement(String inquery)
    {
        try
        {
            PreparedStatement pst=con.prepareStatement(inquery);
            return pst;
        }
        catch(Exception e)
        {
            System.out.println("incomplete query error"+e.getMessage());
            return null;
        }
        
      }
    }
    

