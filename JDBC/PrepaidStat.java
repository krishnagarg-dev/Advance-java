import java.sql.*;

public class PrepaidStat {
    public static void main(String[] args) {

        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "root";
        String password = "";

        String query = "SELECT * from student where course = ?";
        String insert = "insert into student (name,course,marks) values (?, ?, ?)";

        try {
            Class.forName(jdbc_driver);

            Connection con = DriverManager.getConnection(url, username, password);

            // INSERT
            PreparedStatement inpst = con.prepareStatement(insert);
            inpst.setString(1, "Student7");
            inpst.setString(2, "MCA");
            inpst.setInt(3, 67);
            inpst.executeUpdate();

            // SELECT
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "MCA");

            ResultSet rs = pst.executeQuery();

            System.out.println("ID\tName\tCourse\tMarks");

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1) + "\t" +
                    rs.getString(2) + "\t" +
                    rs.getString(3) + "\t" +
                    rs.getInt(4)
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}