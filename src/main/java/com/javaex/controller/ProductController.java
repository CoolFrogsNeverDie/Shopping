package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.ProductService;
import com.javaex.vo.ProductVO;

@RequestMapping(value = "/product")
@Controller
public class ProductController {
	

	@Autowired
	private ProductService productService;
	@Autowired
	private ProductVO vo;
	@Autowired
	List<ProductVO> list;	
	
	//-------------제품 관리 메인 페이지 forward-----------------------------서비스 연동 완료
	
	@RequestMapping(value = "/productView", method =RequestMethod.GET)
	public String list(Model model) {
		
		System.out.println("view in Controller");
		
		list = productService.productList();
		model.addAttribute("productList", list);
		return "MGProduct/productView";
	}
	
	//-------------제품 검색 forward----------------------------- 서비스 연동 완료

	@RequestMapping(value = "/search", method =RequestMethod.GET)
	public String search(@RequestParam("searchOption") String searchType,@RequestParam("keyword") String keyword, Model model) {
		System.out.println("search in Controller");
		
		list = productService.productSearch(searchType, keyword);
		model.addAttribute("productList", list);
		return "MGProduct/productView";
	}
	
	//-------------제품 검색(금액대별) forward----------------------------- 서비스 연동 완료
	@RequestMapping(value = "/searchPrice", method = RequestMethod.GET)
	public String searchPrice(@RequestParam("minPrice") int minPrice
							 ,@RequestParam("maxPrice") int maxPrice
							 ,Model model) {  

		System.out.println("/searchPrice Controller Start!");
		
		list = productService.productSearchPrice(minPrice,maxPrice); //Service class에서 map으로 만들어서 보낼 예정
		model.addAttribute("productList", list);
		return "MGProduct/productView";
	}
	
	
	//-------------제품 업데이트 양식 forward----------------------------  서비스 연동 완료

	@RequestMapping(value = "/updateForm/{Id}", method =RequestMethod.GET)
	public String updateForm(@PathVariable("Id") String productId, Model model) {
		
		System.out.println("/updateForm Controller Start!");

		vo =  productService.productGet(productId);
		model.addAttribute("updateProduct", vo);
		return "MGProduct/productUpdateForm";
	}

	//-------------제품 업데이트  redirect---------------------------- 서비스 연동 완료

	@RequestMapping(value = "/update", method =RequestMethod.GET)
	public String update( @ModelAttribute ProductVO productVO) {
		
		System.out.println("/update Controller Start!");
		
		productService.productUpdate(productVO);		
		return "redirect:/product/productView";
	}

	//-------------제품 등록 양식 단순 forward---------------------------- 서비스 연동 완료

	@RequestMapping(value = "/insertForm", method =RequestMethod.GET)
	public String insertForm() {
		
		System.out.println("/ProductInsertForm Controller Start!");

		return "MGProduct/productInsert";
	}
	
	//-------------제품 등록  redirect---------------------------- 서비스 연동 완료

	@RequestMapping(value = "/insert", method = {RequestMethod.GET, RequestMethod.POST})
	public String insert(@ModelAttribute ProductVO productVO) {
		
		System.out.println("/insert Controller Start!");

		productService.productInsert(productVO);
		return "redirect:/product/productView";
	}
	
	//-------------제품 삭제 redirect----------------------------- 서비스 연동 완료
	
	@RequestMapping(value =  "/delete/{productId}", method = RequestMethod.GET)
	public String delete(@PathVariable("productId") String productId) {

		System.out.println("/delete Controller Start!");

		productService.productDelete(productId);
		return "redirect:/product/productView";
	}
}
