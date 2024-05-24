package com.rginfotech.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.rginfotech.model.RgPogo;
import com.rginfotech.util.rgDatabaseManager;


public class leaveManager {
	
	public static void permissionLeave(RgPogo p) throws ClassNotFoundException, SQLException {
	Scanner ps = new Scanner(System.in);
	rgDatabaseManager rdb = new rgDatabaseManager();
	
	System.out.println("Enter From Date :");
	String fromDate = ps.next();
	p.setFromDate(fromDate);
	
	System.out.println("Enter To Date : ");
	String toDate = ps.next();
	p.setToDate(toDate);
	
	System.out.println("Remark : ");
	String remark = ps.next();
	p.setRemark(remark);
	
	rdb.updatePermissionDates(p);
	rdb.retrieveAvailableLeave(p);
	rdb.updateAvailableLeave(p);
	rdb.updatePermissionLeave(p);
}
}

