package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	
	private static final String HDB_Driver_Class = "com.sap.db.jdbc.Driver";
	private static final String HDB_JDBC_URL = "jdbc:sap://mo-a3da769d3:30015/?autocomit=false";
	private static final String HDBuser = "USER1";
	private static final String HDBpwd = "Init1234";
	
	static {  //Static block, executed when the class is accessed for the first time only
		
		try {
			
			Class.forName(HDB_Driver_Class);
		} catch (ClassNotFoundException cnfex) {
			cnfex.printStackTrace();
		}

	}
		public static void main(String[] args){
			
			try( Connection con = DriverManager.getConnection(HDB_JDBC_URL, HDBuser, HDBpwd);
					Statement stmt = con.createStatement())  {
				
				System.out.println("Connect successfull");
				System.out.println("Connection class name: " + con.getClass().getName());
				
				con.setAutoCommit(false);
				DatabaseMetaData dbmd = con.getMetaData();
				System.out.println("Database Product: " + dbmd.getDatabaseProductName());
				System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
				System.out.println();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM TRAINING.CAR");
				while (rs.next()) {
					String carID = rs.getString(1);
					String plateNo = rs.getString(2);
					System.out.println("Car ID: " + carID + " & Plate No: " + plateNo);
				}
				
				rs.close();
			} catch (SQLException sqlex1) {
				String msg = sqlex1.getMessage();
				System.out.println(msg);
				sqlex1.printStackTrace();
			}
		}
}
