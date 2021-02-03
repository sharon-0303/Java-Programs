import java.sql.*;  
class MysqlCon
{  
    public static void main(String args[])
    {  
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");   
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from student1");  
        while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));            
        }
        catch(Exception e)
        {
             System.out.println(e);
        }  
    }  
}  