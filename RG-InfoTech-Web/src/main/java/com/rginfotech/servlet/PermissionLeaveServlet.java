package com.rginfotech.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rginfotech.model.RgPogo;
import com.rginfotech.util.rgDatabaseManager;

/**
 * Servlet implementation class PermissionLeaveServlet
 */
@WebServlet("/PermissionLeaveServlet")
public class PermissionLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	rgDatabaseManager rgDB = new rgDatabaseManager();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PermissionLeaveServlet() {
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
		//doGet(request, response);
		String fromDate = request.getParameter("fromDate");
		String toDate = request.getParameter("toDate");
		String fromTime = request.getParameter("fromTime");
		String toTime = request.getParameter("toTime");
		String remark = request.getParameter("remark");
		String EmployeeId = request.getParameter("EmployeeID");

		
		RgPogo rgp = new RgPogo();
		rgp.setFromDate(fromDate);
		rgp.setToDate(toDate);
		rgp.setRemark(remark);
		rgp.setFromTime(fromTime);
		rgp.setToTime(toTime);
		rgp.setEmployeeId(EmployeeId);
		
		try {
			rgDatabaseManager.permissionLeaveDBupdater(rgp);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
