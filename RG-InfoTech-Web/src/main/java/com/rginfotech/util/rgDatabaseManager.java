package com.rginfotech.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rginfotech.model.RgPogo;

import java.sql.ResultSetMetaData;

public class rgDatabaseManager {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3308/RG_database","root", "root");
		return connect;
	}

	public static boolean empLoginVal(RgPogo p) throws ClassNotFoundException, SQLException {

		Connection connect = getConnection();

		String query = "select EmployeeId, EmployeePassword from user_Credential where EmployeeId = '"+p.getEmployeeId()+"' and  EmployeePassword = '"+p.getEmployeePassword()+"' ;";
		PreparedStatement build = connect.prepareStatement(query);
		build.setString(1, p.getEmployeeId());
		build.setString(2, p.getEmployeePassword());

		ResultSet rows = build.executeQuery();
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();

		while(rows.next()) {

			for (int i = 1; i <= columnCount; i += 1) {
				
				return true;
			}
		}
		return false;
	}
	//Permission leave DataBase Manager 
	public static void updatePermissionDates(RgPogo p) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query = "update Employee_leave set From_Date = '"+p.getFromDate()+"' ,To_Date = '"+p.getToDate()+"', Permission_fromTime = '"+p.getFromTime()+"', Permission_toTime = '"+p.getToTime()+"' ,Leave_Status = 'not Aproved' ,Remark = '"+p.getRemark()+"' where EmployeeId = '"+p.getEmployeeId()+"'";
		PreparedStatement build = connect.prepareStatement(query);
//		build.setString(1,p.getFromDate());
//		build.setString(2,p.getToDate());
//	//	build.setString(3, "Not Aproved");
//		build.setString(4, p.getRemark());
//		build.setString(5, p.getEmployeeId());
		
		build.executeUpdate();
		System.out.println(p.getFromDate()+" From Date");
		System.out.println(p.getToDate()+" to Date");
		System.out.println(p.getFromTime()+" from Time");
		System.out.println(p.getToTime()+" to timr");
		System.out.println(p.getRemark()+" remarks");
		System.out.println("For Employee ID "+p.getEmployeeId());
		System.out.println("value updated in DB");
		
		
		
	}
	
	public static void updatePermissionLeave(RgPogo p) throws ClassNotFoundException, SQLException {
		
		Connection connect = getConnection();
		
		String query ="update Employee_leave set Available_Permission = '"+p.getUpdateAvlleave()+"' where EmployeeId = '"+p.getEmployeeId()+"'";
		PreparedStatement build = connect.prepareStatement(query);
//		build.setInt(1,p.getUpdateAvlleave());
//		build.setString(2,p.getEmployeeId());
		
		build.executeUpdate();
		System.out.println(p.getUpdateAvlleave()+"Value Updated to DB");
	}

	public static int retrieveAvailableLeave(RgPogo p) throws ClassNotFoundException, SQLException {
		Connection connect = getConnection();
		int retrievedValue = 0;
		String query = "select Available_Permission from Employee_leave where EmployeeId = '"+p.getEmployeeId()+"'";
		PreparedStatement build = connect.prepareStatement(query);
		
//		build.setString(1, p.getEmployeeId());
		
		ResultSet rows = build.executeQuery();
        ResultSetMetaData metaData = (ResultSetMetaData) rows.getMetaData();
        int columnCount = metaData.getColumnCount();
        
        while(rows.next()) {
          
        	for (int i = 1; i <= columnCount; i += 1) {
        		p.setDeductAvlLeave(Integer.parseInt(rows.getString(i)));;
               return Integer.parseInt(rows.getString(i));
            }
        }
		System.out.println(p.getDeductAvlLeave()+" Value retreved !");
		return retrievedValue;
		
		
	}
	
	public static void updateAvailableLeave(RgPogo p) throws ClassNotFoundException, SQLException {
		
		retrieveAvailableLeave(p);
		
		int updatedAvlLeave = p.getDeductAvlLeave()-1;
		p.setUpdateAvlleave(updatedAvlLeave);
		System.out.println(p.getUpdateAvlleave()+" value deducted and set in pojo");
		
	}
	public static void permissionLeaveDBupdater(RgPogo p) throws ClassNotFoundException, SQLException {
		
		updatePermissionDates(p);
		//retrieveAvailableLeave(p);
		updateAvailableLeave(p);
		updatePermissionLeave(p);
		System.out.println("Gone Through pldu");
	}
	
	
}
