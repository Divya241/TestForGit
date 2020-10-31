package db;

import java.sql.*;

public class DBSample {
    static Connection con;

    public static void main(String[] args) throws SQLException {
        try {
            String host = "jdbc:mysql://localhost:3306/emp";
            String uname = "root";
            String upass = "admin";
            con = DriverManager.getConnection(host, uname, upass);
           // Statement s = con.createStatement();
          //  ResultSet rs = s.executeQuery("select * from synechron");
          //  while (rs.next()) {
           //     System.out.println(rs.getString("location") + rs.getString("name") + rs.getString("salary"));

          //  }
            PreparedStatement p = con.prepareStatement("insert into synechron values('Ram','hyde',20000)");
        p.executeUpdate();
        }
        catch(Throwable t){

            }
            finally{
                con.close();
            }


    }
}
