package com.javaex.vo;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerVO {

	
	private String customerId;
	private String password;
	private String name;
	private String customerNumbers;
	private int codeType;
	
	
	public CustomerVO() {
		super();
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerNumbers() {
		return customerNumbers;
	}
	public void setCustomerNumbers(String customerNumbers) {
		this.customerNumbers = customerNumbers;
	}
	public int getCodeType() {
		return codeType;
	}
	public void setCodeType(int codeType) {
		this.codeType = codeType;
	}
	@Override
	public String toString() {
		return "CustomerVO [customerId=" + customerId + ", password=" + password + ", name=" + name
				+ ", customerNumbers=" + customerNumbers + ", codeType=" + codeType + "]";
	}
	
	
}
