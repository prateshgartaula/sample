package com.cs623.paper_review;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Pratesh Gartaula
 * 
 */
public class PreparedSelectCount {

	public static void main(String[] args) throws IOException {

		String sqlSelectQuery = "SELECT COUNT(DISTINCT paper_id) from  paper";

		// db connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection(DbContract.HOST + DbContract.DB, DbContract.USER,
					DbContract.PASSWORD);

			// prepared statement: QUERY
			PreparedStatement preparedSelect = conn.prepareStatement(sqlSelectQuery);
			ResultSet rs = preparedSelect.executeQuery(); // added for select

			// to print result of select statement
			try {
				while (rs.next()) {
					String count = rs.getString(1);
					//String DISTINCT_paper_id = rs.getString(2);
					//String author_emailaddress = rs.getString(3);

					System.out.printf("COUNT(DISTINCT paper_id) " + "%s\n", count);
				}

			} catch (java.sql.SQLException sqle) {
				sqle.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
