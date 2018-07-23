import java.sql.*;


public class Test2 {

        public static void main(String[] agrs) {
            String sql = "SELECT*FROM  customer ";
            Connection conn = null;
            Statement st = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");//驱动程序
                conn = DriverManager.getConnection("jdbc:mysql://192.168.99.100:3306/sakila", "root", "root");//数据库连接
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    System.out.print(rs.getInt("customer_id") + "   ");
                    System.out.print(rs.getString("last_name") + "   ");
                    System.out.print(rs.getString("first_name") + "   ");
                    System.out.println(rs.getString("last_update") + "   ");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    rs.close();

                } catch (Exception e2) {
                }
                try {
                    st.close();
                } catch (Exception e3) {
                    try {
                        conn.close();
                    } catch (Exception e4) {
                    }
                }
            }
        }
    }





