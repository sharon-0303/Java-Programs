import java.sql.*;  
class sqlupdate
{  
    public static void main(String args[])
    {  
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");   
            Statement stmt=con.createStatement();  
            int i=stmt.executeUpdate("UPDATE student1 SET name = 'sharon' WHERE rollno = 1;");
            if(i>0) 
            {
                System.out.println("Updated");
            }  
       }
        catch(Exception e)
        {
             System.out.println(e);
        }  
    }  
}  