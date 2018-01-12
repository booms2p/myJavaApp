import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConnectDb {
	public static void query () {
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/waramundb?user=root&password=");
			
			if (connect != null) {
				System.out.println("Database Connect Success");
				System.out.println("");
			} else {
				System.out.println("Database Connect Unsuccess");
			}
			
			s = connect.createStatement();
			
			String queryData = "SELECT * FROM eplclub";
			ResultSet result = s.executeQuery(queryData);
			while((result != null) && (result.next())) {
				System.out.println("Team: " +  result.getString("clubname") + ", Stadium: " + result.getString("stadium"));
				System.out.println("");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete () {
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/waramundb?user=root&password=");
			
			if (connect != null) {
				System.out.println("Database Connect Success");
				System.out.println("");
			} else {
				System.out.println("Database Connect Unsuccess");
			}
			
			s = connect.createStatement();
		
			String id = "3";
			String deleteData = "DELETE FROM eplclub WHERE id = " + id;
			s.execute(deleteData);
			System.out.println("Delete data id " + id + " successful.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insert () {
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/waramundb?user=root&password=");
			
			if (connect != null) {
				System.out.println("Database Connect Success");
				System.out.println("");
			} else {
				System.out.println("Database Connect Unsuccess");
			}
			
			s = connect.createStatement();
			
			String insertData = "INSERT INTO eplclub (id, clubname, stadium, capacity, lastedeplchamp) VALUES ('3','Liverpool','Anfield','54074','0000')";
			s.execute(insertData);
			System.out.println("Insert data successful.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void update () {
		Connection connect = null;
		Statement s = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/waramundb?user=root&password=");
			
			if (connect != null) {
				System.out.println("Database Connect Success");
				System.out.println("");
			} else {
				System.out.println("Database Connect Unsuccess");
			}
			
			s = connect.createStatement();
		
			String year = "2001";
			String id = "3";
//			String queryData = "SELECT * FROM eplclub WHERE id = " + id;
//			ResultSet result = s.executeQuery(queryData);
//			if (result.getString("id") == id) {
				String updateData = "UPDATE eplclub SET lastedeplchamp = " + year + " WHERE id = " + id;
				s.execute(updateData);
				System.out.println("Update successful.");
				System.out.println("");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if(connect != null) {
				connect.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}