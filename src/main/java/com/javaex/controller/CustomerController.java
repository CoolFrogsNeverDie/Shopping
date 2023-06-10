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

import com.javaex.service.CustomerService;
import com.javaex.vo.CustomerVO;


@RequestMapping(value = "/customer")
@Controller
public class CustomerController {
	
	@Autowired
	CustomerVO vo;
	@Autowired
	CustomerService customerService;
	
	
	//------------------main ------------------------------------------------------------
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main View start!");
		
		return "index";
	}
	
	//------------------loginForm ------------------------------------------------------------

	@RequestMapping(value = "/loginView", method = RequestMethod.GET)
	public String loginView() {
		System.out.println("login View start!");

		return "MGCustomer/login";
	}
	
	
	
	
	//-----------------------------customer view(main 페이지)---------------------------- service 처리 완료
	
	@RequestMapping(value = "/customerView", method = RequestMethod.GET)
	public String main(Model model) {
		System.out.println("Customer View start!");
		List<CustomerVO> list = customerService.customerList();
		model.addAttribute("customerList", list);
		return "MGCustomer/customerView";
	}

	
	//-----------------------------customer search----------------------------service 처리 완료
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("searchOption") String searchOption
						, @RequestParam("keyword") String keyword
						, Model model) {
		System.out.println("Customer Search start!");
		List<CustomerVO> list = customerService.customerSearch(searchOption, keyword);
		model.addAttribute("customerList", list);
		return "MGCustomer/customerView";
	}

	//-----------------------------customer Update Form----------------------------service 처리 완료

	@RequestMapping(value = "/updateForm/{customerId}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("customerId") String customerId ,Model model) {
		System.out.println("Customer Update start!");
		vo = customerService.getCustomer(customerId);
		System.out.println(vo);
		model.addAttribute("updateCustomer", vo);
		return "MGCustomer/customerUpdateForm";
	}

	//-----------------------------customer Update----------------------------service 처리 완료

	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(@ModelAttribute CustomerVO customerVO) {
		customerService.updateCustomer(customerVO);
		String customerId = customerVO.getCustomerId();
		return "redirect:/customer/updateForm/"+customerId;
	}
	
	//-----------------------------customer delete--------------------------------------
	
	@RequestMapping(value ="/delete/{customerId}", method = RequestMethod.GET)
	public String delete(@PathVariable("customerId") String customerId) {
		
		customerService.deleteCustomer(customerId);
		return "redirect:/customer/customerView";
	}
	
	
	
}
