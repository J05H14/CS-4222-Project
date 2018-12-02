package cs4222Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private final String url = "jdbc:postgresql://cs1.calstatela.edu/";
	private final String user = "cs4222s16";
	private final String password = "HwyadRCF";
	private Connection conn = null;
	private Statement stmt = null;

	public static void main(String[] args) {
		Main app = new Main();
		Professor newProf = new Professor("132652415", "Mike Vison", "M", 49, "Senior", "Administration", "777");
		
		app.connect();
		
		app.listAllData();
//		app.addFaculty(newProf);
//		app.listAllData();
//		app.removeFaculty(newProf);
		app.listAllData();
	}

	public Connection connect() {
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.\n\n\n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	public void listAllData() {

		try {
			stmt = conn.createStatement();
			ResultSet rs;
			ResultSetMetaData rsmd;

			// List CoInvestigator
			System.out.println("Table: CoInvestigator");
			rs = stmt.executeQuery("SELECT * FROM \"CoInvestigator\"");
			rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			// List Department
			System.out.println("Table: Department");
			rs = stmt.executeQuery("SELECT * FROM \"Department\"");
			rsmd = rs.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			// List GraduateStudent
			System.out.println("Table: GraduateStudent");
			rs = stmt.executeQuery("SELECT * FROM \"GraduateStudent\"");
			rsmd = rs.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			// List Professor
			System.out.println("Table: Professor");
			rs = stmt.executeQuery("SELECT * FROM \"Professor\"");
			rsmd = rs.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			// List Project
			System.out.println("Table: Project");
			rs = stmt.executeQuery("SELECT * FROM \"Project\"");
			rsmd = rs.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			// List ResearchAssistant
			System.out.println("Table: ResearchAssistant");
			rs = stmt.executeQuery("SELECT * FROM \"ResearchAssistant\"");
			rsmd = rs.getMetaData();
			columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("\n");
			}
			System.out.println("\n");

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addFaculty(Professor prof){
		try {
			String query = "INSERT INTO \"Professor\" VALUES (?,?,?,?,?,?,?);"; 
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, prof.getSsn());
			pstmt.setString(2, prof.getName());
			pstmt.setString(3, prof.getGender());
			pstmt.setInt(4, prof.getAge());
			pstmt.setString(5, prof.getRank());
			pstmt.setString(6, prof.getSpecialty());
			pstmt.setString(7, prof.getWorksIn());
			
			pstmt.execute();
			 
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(prof.getName() + " added to Professor Table");
	}
	public void removeFaculty(Professor prof) {
		try {
			String query = "DELETE FROM \"Professor\" WHERE \"SSN\" = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, prof.getSsn());
			pstmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(prof.getName() + " removed to Professor Table");
	}
}

	
	 