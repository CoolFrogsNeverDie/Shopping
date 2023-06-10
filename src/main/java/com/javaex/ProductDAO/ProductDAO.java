package com.javaex.ProductDAO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private ProductVO productVO;
	
	//--------------All Product List ------------------------ service update
	
	
	public List<ProductVO> productList(){
		
		List<ProductVO> list = sqlSession.selectList("product.allList");
		return list;
		
	}
	
	//-------------- Product Search (Name)------------------------
	
	public List<ProductVO> productSearchName(String keyword){

		List<ProductVO> list = sqlSession.selectList("product.researchName",keyword);
		
		return list;
	}
	
	//-------------- Product Search (Id)------------------------
	
	public List<ProductVO> productSearchId(String keyword){
		
		List<ProductVO> list = sqlSession.selectList("product.researchId",keyword);	
		

		return list;
	}
	
	//--------------product Search (all)-----------------------------
	
	
	public List<ProductVO> productSearch(Map map){
		System.out.println("======================================");
		System.out.println(map);
		List<ProductVO> list = sqlSession.selectList("researchProduct",map);
		System.out.println(list);
		return list;
	}
	

	
	//-------------- Product Search (Price)------------------------
	
	public List<ProductVO> productSearchPrice(Map map){
		
		List<ProductVO> list = sqlSession.selectList("product.researchPrice",map);	

		return list;
	}
	
	
	
	//-------------- Product Get------------------------

	
	public ProductVO productGet(String productId){
		System.out.println(productId + "로 검색 시작 DAO");
		productVO =  sqlSession.selectOne("product.getProduct",productId);
		System.out.println(productVO);
		return productVO;
	}
	
	//-------------- Product Update------------------------

	public int productUpdate(ProductVO productVO) {
		System.out.println("productUpdate DAO start!");
		int cnt = sqlSession.update("product.updateProduct", productVO);
		
		return cnt;
	}
	
	//-------------- Product Insert------------------------

	public int productInsert(ProductVO productVO) {
		System.out.println("productInsert DAO start!");
		int cnt = sqlSession.insert("product.insertProduct", productVO);
		return cnt;
	}
	
	//-------------- Product delete------------------------
	
	public int productDelete(String productId) {
		System.out.println("dao delete start!");
		int cnt = sqlSession.delete("product.deleteProduct", productId);
		return 0;
	}
	
}
