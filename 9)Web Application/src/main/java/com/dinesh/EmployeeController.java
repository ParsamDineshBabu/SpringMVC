package com.dinesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/datatable")
public class EmployeeController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String dataTable(ModelMap model) {
		return "datatable";
	}
	@RequestMapping(value = "/getEmployees", method = RequestMethod.POST)
	public @ResponseBody List<Employee> getEmployees() {
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			Connection dbConnection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/emp", "root", "details");
			Statement getFromDb = dbConnection.createStatement();
			ResultSet employees = getFromDb
					.executeQuery("SELECT EmployeeID, FirstName, LastName, Title, BirthDate FROM employees");
			while (employees.next()) {
				employeeList.add(new Employee(
						employees.getString("EmployeeID"), employees
								.getString("FirstName"), employees
								.getString("LastName"), employees
								.getString("Title"), employees
								.getString("BirthDate")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
