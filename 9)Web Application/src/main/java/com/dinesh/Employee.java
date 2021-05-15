package com.dinesh;

public class Employee {

		private String employeeId;
		private String firstName;
		private String lastName;
		private String title;
		private String birthDate;
		public Employee(String employeeId, String firstName, String lastName,
				String title, String birthDate) {
			setEmployeeId(employeeId);
			setFirstName(firstName);
			setLastName(lastName);
			setTitle(title);
			setBirthDate(birthDate);
		}
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
	}

