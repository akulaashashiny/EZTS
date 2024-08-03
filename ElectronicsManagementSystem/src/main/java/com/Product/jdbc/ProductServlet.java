package com.Product.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/gadda_electronics")
	private DataSource dataSource;

	private DBConnection dbConnection; 
    /**  
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		dbConnection = new DBConnection(dataSource);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String receivedCommand = request.getParameter("command");
		
		if(receivedCommand == null) {
			receivedCommand = "LIST";
		}
		
		switch(receivedCommand) {
		case "LIST":{
			listproduct(request, response);
			break;
		}
		
		case "ADD":{
			Addproduct(request, response);
			break;
		}
		
		default:{
			listproduct(request, response);
			break;
		}
		}
	}
	private void Addproduct(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String PRODUCT_ID = request.getParameter("Product_id");
		String PRODUCT_NAME = request.getParameter("Product_name");
		String BRAND = request.getParameter("Brand");
		String CATEGORY = request.getParameter("Category");
		String PRICE = request.getParameter("Price");
		
		int  Product_id = Integer.parseInt(PRODUCT_ID);
		int Price=Integer.parseInt(PRICE);
		
		SettersGetters newproduct = new SettersGetters(Product_id, PRODUCT_NAME, BRAND, CATEGORY, Price);
		
		dbConnection.addproduct(newproduct);
		
		
	}
	private void listproduct(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		List<SettersGetters> products = dbConnection.getproducts();

		request.setAttribute("product_list",products);

		RequestDispatcher dispacher = request.getRequestDispatcher("/index.jsp");
		dispacher.forward(request, response);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
