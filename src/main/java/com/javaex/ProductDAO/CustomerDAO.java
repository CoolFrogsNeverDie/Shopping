package com.javaex.ProductDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.CustomerVO;

@Repository
public class CustomerDAO {
	
	@Autowired
	SqlSession sqlSession;
	@Autowired
	CustomerVO vo;
	
	//-----------------------get all list--------------------------------------
	
	public List<CustomerVO> customerList(){
		
		List<CustomerVO> list = sqlSession.selectList("customer.allList");
		return list;
	}

	//-----------------------Search Customer (CustomerName)--------------------------------------

	public List<CustomerVO> customerSearchName(String keyword){
		List<CustomerVO> list = sqlSession.selectList("customer.SearchName", keyword);
		return list;
	}

	//-----------------------Search Customer (CustomerID)--------------------------------------

	public List<CustomerVO> customerSearchId(String keyword){
		List<CustomerVO> list = sqlSession.selectList("customer.SearchId", keyword);		
		return list;
	}
	
	//-----------------------get Customer (CustomerID)--------------------------------------
	
	public CustomerVO getCustomer(String customerId) {
		
		CustomerVO vo =  sqlSession.selectOne("customer.getCustomer", customerId);
		System.out.println(vo  + "DAO Customer!");
		return vo;
	}
	
	//-----------------------update Customer (CustomerID)--------------------------------------

	public int updateCustomer(CustomerVO customerVO) {
		int cnt = sqlSession.update("customer.updateCustomer", customerVO);
		return cnt;
	}
	
	//-----------------------delete Customer (CustomerID)--------------------------------------

	public int deleteCustomer(String customerId) {
		int cnt = sqlSession.delete("customer.deleteCustomer", customerId);
		return cnt;
	}
}
