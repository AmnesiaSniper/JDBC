package git.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql_Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// ��������
			Class.forName("com.mysql.jdbc.Driver");
			// �������ݿ�
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=UTF-8",
					"root", "root");
			// ����Statement����
			// ע��Statement��PrepareStatement����
			Statement st = conn.createStatement();
			String sql = "select * from student";
			// ִ��sql���
			// ע��execute��executeQuery��executeUpdate����
			st.execute(sql);
			// ��ȡ��ѯ���
			ResultSet rs = st.getResultSet();
			// �������
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

			st.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
