package git.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql_Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 连接数据库
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=UTF-8",
					"root", "root");
			// 创建Statement对象
			// 注意Statement、PrepareStatement区别
			Statement st = conn.createStatement();
			String sql = "select * from student";
			// 执行sql语句
			// 注意execute、executeQuery、executeUpdate区别
			st.execute(sql);
			// 获取查询结果
			ResultSet rs = st.getResultSet();
			// 遍历结果
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

			st.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
