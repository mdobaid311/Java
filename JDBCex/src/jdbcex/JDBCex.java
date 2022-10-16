package jdbcex;

import java.sql.*;

public class JDBCex {

    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite/univ.db"); Statement stm = con.createStatement()) {
            ResultSet rs = stm.executeQuery("select * from students");
            while(rs.next()){
                System.out.print(rs.getInt("SID")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.println(rs.getString("course")+" ");
            }
        }
    }
}
