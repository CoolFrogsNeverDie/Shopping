package com.javaex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.ProductDAO.CustomerDAO;
import com.javaex.vo.CustomerVO;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO dao;
	@Autowired
	CustomerVO vo;
	
	//--------------------customer List -------------------------------
	
	
	public List<CustomerVO> customerList(){ 
		List<CustomerVO> list = dao.customerList();
		return list;
	}
	
	//--------------------customer Search -------------------------------

	
	public List<CustomerVO> customerSearch(String searchOption, String keyword){
		List<CustomerVO> list = new ArrayList<CustomerVO>();
		if("CustomerName".equals(searchOption)) {
			list = dao.customerSearchName(keyword);
		}else if("CustomerId".equals(searchOption)) {
			list = dao.customerSearchId(keyword);
		}
		return list;
	}
	
	//-------------------- get customer -------------------------------
	
	public CustomerVO getCustomer(String customerId) {
		vo = dao.getCustomer(customerId); 
		System.out.println(vo);
		return vo;
	}
	
	
	//-------------------- update customer -------------------------------

	public int updateCustomer(CustomerVO customerVO) {
		return dao.updateCustomer(customerVO);
	}
	
	//---------------------delete customer--------------------------------
	
	public int deleteCustomer(String customerId) {
		int rows = dao.deleteCustomer(customerId);
		return rows;
	}
}
