package EXCEPTION;

import java.sql.*;

public class JDBCexmaple {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/seci_roll_1","root","");
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from student where rollno=20");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }
        con.close();
    }
}
