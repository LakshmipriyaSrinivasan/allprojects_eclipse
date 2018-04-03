package com.org;

	import javax.xml.bind.annotation.XmlRootElement;
	import javax.xml.bind.annotation.XmlType;

	@XmlRootElement
	@XmlType(propOrder = {"customerId", "customerName", "age"})
	public class Customer {
		private int customerId;
		private String customerName;
		private int age;
		public Customer(int customerId, String customerName, int age) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.age = age;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}

