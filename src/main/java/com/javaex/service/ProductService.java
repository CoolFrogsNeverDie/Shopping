package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.ProductDAO.ProductDAO;
import com.javaex.vo.ProductVO;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO dao;
	@Autowired
	ProductVO vo;
	@Autowired
	List<ProductVO> list;
	
	//---------------All product List --------------------
	
	public List<ProductVO> productList(){
		
		List<ProductVO> list = dao.productList();
		
		return list;
	}
	
	//---------------product Search --------------------


	public List<ProductVO> productSearch(String searchType,String keyword){

//		List<ProductVO> list = new ArrayList<ProductVO>();
//		
//		if("productName".equals(searchType)) {
//			System.out.println("NameSearch 호출");
//			list = dao.productSearchName(keyword);
//		}else if("productId".equals(searchType)) {
//			System.out.println("IDSearch 호출");
//			list = dao.productSearchId(keyword);					
//		}
		
		System.out.println("search service start! " + searchType + keyword);
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchType);
		map.put("keyword", keyword);
		
		list = dao.productSearch(map);
		
		return list;
	}

	//---------------product Search Price--------------------
	
	
	public List<ProductVO> productSearchPrice(int minPrice,int maxPrice){

		Map<String, Object> map = new HashMap<String, Object>();//받아온 int 값들 map으로 묶어서 보냄
		map.put("minPrice", minPrice);
		map.put("maxPrice", maxPrice);
		list = dao.productSearchPrice(map);
		return list;
	}
	
	//---------------get Product --------------------

	
	public ProductVO productGet(String productId) {
		vo = dao.productGet(productId);
		return vo;
	}
	
	
	//---------------product update--------------------------
	
	
	public int productUpdate(ProductVO productVO) {
		int rows = dao.productUpdate(productVO);
		return rows;
	}
	
	//---------------product Insert----------------------

	public int productInsert(ProductVO productVO) {
		int rows = dao.productInsert(productVO);
		return rows;
	}
	
	
	//---------------Product delete-------------------
	
	public int productDelete(String productId) { 
		int rows = dao.productDelete(productId);
		return rows;
	}
}
