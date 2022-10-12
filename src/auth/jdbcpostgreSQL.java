package auth;

import java.sql.*;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;

/*
CSCE 315
9-27-2021 Lab
 */
public class jdbcpostgreSQL {

	// Commands to run this script
	// This will compile all java files in this directory
	// javac *.java
	// This command tells the file where to find the postgres jar which it needs to
	// execute postgres commands, then executes the code
	// Windows: java -cp ".;postgresql-42.2.8.jar" jdbcpostgreSQL
	// Mac/Linux: java -cp ".:postgresql-42.2.8.jar" jdbcpostgreSQL

	// MAKE SURE YOU ARE ON VPN or TAMU WIFI TO ACCESS DATABASE
	public static List<String[]> readFromFile(String filename) throws FileNotFoundException{
		Scanner readFile = new Scanner(new File(filename));
		
		List<String[]> allAttributes = new ArrayList<>();
		while (readFile.hasNextLine()) {
			String line = readFile.nextLine();
			allAttributes.add(line.split(","));
		}

		return allAttributes;
	}

/* 	public static void main(String args[]) {

		// Building the connection with your credentials
		Connection conn = null;
		String teamNumber = "12";
		String sectionNumber = "912";
		String dbName = "csce315" + "_" + sectionNumber + "_" + teamNumber;
		String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
		dbSetup myCredentials = new dbSetup();

		// Connecting to the database
		try {
			conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		System.out.println("Opened database successfully");

		try {
			// create a statement object
			Statement stmt = conn.createStatement();

			String csv_file = "orders.csv";
			List<String[]> getAttributes = readFromFile(csv_file);

			// starts at 1 to avoid adding column names into database
			for(int i = 1; i < getAttributes.size(); i++) {
				// Running a query
				// TODO: update the sql command here
				
				String vals = String.format("'%s', %s, '%s', %s, %s", getAttributes.get(i)[0],
								getAttributes.get(i)[1],
								getAttributes.get(i)[2],
								getAttributes.get(i)[3],
								getAttributes.get(i)[4]
								);
				String sqlStatement = String.format("INSERT INTO orders (name, server_id, time_ordered, is_served, price) VALUES(%s)", vals);
				
				stmt.executeUpdate(sqlStatement);
			}
	  
		// send statement to DBMS
		// This executeQuery command is useful for data retrieval
		// OR
		// This executeUpdate command is useful for updating data
		// int result = stmt.executeUpdate(sqlStatement);

			// OUTPUT
			// You will need to output the results differently depeninding on which function
			// you use
			System.out.println("--------------------Query Results--------------------");
			// while (result.next()) {
			// System.out.println(result.getString("column_name"));
			// }
			// OR
			// System.out.println(result);
    	} catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

    // closing the connection
		try {
		conn.close();
		System.out.println("Connection Closed.");
		} catch(Exception e) {
		System.out.println("Connection NOT Closed.");
		} // end try catch
    }// end main
 */}// end Class
