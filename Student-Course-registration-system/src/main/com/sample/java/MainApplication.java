package main.com.sample.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// enter your username
			String username = "";
			
			//enter your password
			String password = "";
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/defaultdb", username, password);

			Statement st = conn.createStatement();

			String sql = "select course_code from course where scheduled = 'Available'";

			ResultSet rs = st.executeQuery(sql);

			// fetch data from course table where scheduled = available
			List<String> list = new ArrayList<String>();

			while (rs.next()) {
				list.add(rs.getString(1));
			}

			// insert into student where schedued = available
			int num = 101;

			for (String item : list) {
				String sql1 = "insert into student values(" + num + " , 'Manju' , '" +item+ "')";
				st.executeUpdate(sql1);
				num++;
			}

			System.out.println("Inserted data into table successfully!!");

			// remove course from student

			String sql2 = "delete from student where course_code = 'C01'";

			int rowAffected = st.executeUpdate(sql2);

			if (rowAffected > 0) {
				System.out.println("Delete data from table successfully!! with course code is c01");
			}

			conn.close();
		} catch (Exception e) {
			System.out.println("Exception ::" + e.getMessage());
		}
	}

}
