package com.cognizant.Product.Controllers;

import java.util.List;

import javax.validation.Valid;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

import com.cognizant.Product.Entity.Product;
//import com.cognizant.Product.Service.LogInService;
import com.cognizant.Product.Service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	@InitBinder
	public void doPreProcessing(WebDataBinder dataBinder)
	{
		//true inside the constructor meanss-> reduce all white spaces to null
	//remove leading and tralilng  white spaces
		StringTrimmerEditor ste=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	//meaning of above line-> just apply stringTrimmerEditor to all strings thaat comes in thr request	
	}

	  @RequestMapping("/list") public String listProducts(Model theModel) {
	  List<Product> products =productService.getAllProducts();
	  theModel.addAttribute("products", products);
	  System.out.println(products);//my cross checking im printing here return
	  return "product-list"; }
	 
	
	@RequestMapping("/showFormForAdd")
	public String showFormAdd(Model theModel)
	{
		Product product=new Product();
		theModel.addAttribute("product",product);
		return "product-form";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct(@Valid @ModelAttribute("product") Product theProduct,BindingResult bind ) {
		System.out.println(bind);
		if(bind.hasErrors())
		{
			System.out.println(bind);
			return "product-form";
		}
		else {
		
		productService.saveProduct(theProduct);
	     return "redirect:/product/list";}
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("id") int theproductId, Model themodel) {
		Product theProduct = productService.getProduct(theproductId);
		themodel.addAttribute("product", theProduct);
		return "product-form";
	}
	
	@RequestMapping("/showFormForDelete")
	public String deleteProduct(@RequestParam("id") int theproductId) {
		productService.deleteProduct(theproductId);
		return "redirect:/product/list";
	}
	
	@PostMapping("/search")
	public String getAllProducts(@RequestParam("productName") String productName,Model theModel) {
		List<Product> theProduct=productService.getAllProducts(productName);
		theProduct.forEach(p ->System.out.println(p));
		theModel.addAttribute("products",theProduct);
		return "product-list";
		
	}
	
	@RequestMapping("/logout")
	public String Logout(Model theModel)
	{
		return "Login-form";
	}
}
