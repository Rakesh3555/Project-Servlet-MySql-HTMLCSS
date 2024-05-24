package com.rginfotech.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rginfotech.model.RgPogo;
import com.rginfotech.util.rgDatabaseManager;

/**
 * Servlet implementation class RgServlet
 */
@WebServlet("/RgServlet")
public class RgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	rgDatabaseManager rgDB = new rgDatabaseManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String EmployeeId = request.getParameter("EmployeeID");
		String EmployeePassword = request.getParameter("EmployeePassword");
		
		RgPogo rgp = new RgPogo();
		rgp.setEmployeeId(EmployeeId);
		rgp.setEmployeePassword(EmployeePassword);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3308/RG_database","root", "root");
			//Validating user credentials 
			String query = "select EmployeeId, EmployeePassword from user_Credential where EmployeeId = '"+rgp.getEmployeeId()+"' and  EmployeePassword = '"+rgp.getEmployeePassword()+"' ";
			PreparedStatement build = connect.prepareStatement(query);
//			build.setString(1, rgp.getEmployeeId());
//			build.setString(2, rgp.getEmployeePassword());
			ResultSet rows =  build.executeQuery(query);
			ResultSetMetaData metaData = rows.getMetaData();
			int columnCount = metaData.getColumnCount();
			if(rows.next()) {
				response.sendRedirect("Home.jsp");
				
			}else {
				response.sendRedirect("loginError.jsp");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		((HttpServletResponse) request).sendRedirect("");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
//		dispatcher.forward(request, response);
		
		
	}

}
