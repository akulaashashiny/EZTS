package com.Product.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class DBConnection {
	private DataSource dataSource;

	public DBConnection(DataSource theDataSource) {
		super();
		this.dataSource = theDataSource;
	}

	public List<SettersGetters> getproducts() {
		// TODO Auto-generated method stub
		List<SettersGetters> products = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			myConn = dataSource.getConnection();

			String s = "Select * from product";

			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(s);

			while (myRs.next()) {
				int PRODUCT_ID = myRs.getInt("Product_id");
				String PRODUCT_NAME = myRs.getString("Product_name");
				String BRAND = myRs.getString("Brand");
				String CATEGORY = myRs.getString("Category");
				int PRICE = myRs.getInt("Price");

				SettersGetters tempproduct = new SettersGetters(PRODUCT_ID, PRODUCT_NAME, BRAND, CATEGORY, PRICE);

				products.add(tempproduct);
			}

			System.out.println(products);
			return products;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRs);
		}

		return null;
	}
	public void addproduct(SettersGetters newproduct) {
		// TODO Auto-generated method stub
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
			try {
				myConn =dataSource.getConnection();					
					String S = "insert into product"+
							 "(PRODUCT_ID, PRODUCT_NAME, BRAND, CATEGORY, PRICE)"+
							"values(?,?,?,?,?)";
					
					myStmt=myConn.prepareStatement(S);
					
					myStmt.setInt(1, newproduct.getProduct_id());
					myStmt.setString(2, newproduct.getProduct_name());
					myStmt.setString(3, newproduct.getBrand());
					myStmt.setString(4, newproduct.getCategory());
					myStmt.setInt(5, newproduct.getPrice());
					
					myStmt.execute();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					close(myConn,myStmt,null);
				}
		
	}
	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myRs !=null) {
				myRs.close();
			}
			
			if(myStmt !=null) {
				myStmt.close();
			}
			
			if(myConn !=null) {
				myConn.close();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}



}
