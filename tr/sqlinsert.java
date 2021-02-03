import java.sql.*;  
class sqlinsert
{  
    public static void main(String args[])
    {  
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");   
            Statement stmt=con.createStatement();  
            stmt.executeUpdate("UPDATE student1 SET name = 'sharon' WHERE rollno = 1;");  
       }
        catch(Exception e)
        {
             System.out.println(e);
        }  
    }  
}  