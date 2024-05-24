package com.rginfotech.model;

public class RgPogo {
	
	String EmployeeId; 
	String EmployeeName; 
	String EmployeeMail; 
	String EmployeePassword;
	String fromDate;
	String toDate;
	String fromTime;
	String toTime;
	String remark;
	int deductAvlLeave;
	int updateAvlleave;
	
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeePassword() {
		return EmployeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		EmployeePassword = employeePassword;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeMail() {
		return EmployeeMail;
	}
	public void setEmployeeMail(String employeeMail) {
		EmployeeMail = employeeMail;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getDeductAvlLeave() {
		return deductAvlLeave;
	}
	public void setDeductAvlLeave(int deductAvlLeave) {
		this.deductAvlLeave = deductAvlLeave;
	}
	public int getUpdateAvlleave() {
		return updateAvlleave;
	}
	public void setUpdateAvlleave(int updateAvlleave) {
		this.updateAvlleave = updateAvlleave;
	}
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	
}
