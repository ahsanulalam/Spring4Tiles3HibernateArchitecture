package com.ahsan.web;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.ahsan.domain.TblArticle;
import com.ahsan.service.PageServiceInterface;
import com.ahsan.domain.Employee;
import com.ahsan.service.EmployeeServiceInterface;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
    
        @Autowired
	EmployeeServiceInterface employeeServiceInterface;
	
        @Autowired
        PageServiceInterface pageServiceInterface;
        
        
        
	@RequestMapping(value = {"/page1","/"}, method = RequestMethod.GET)
	public String firstPage(Model model) {
		model.addAttribute("firstPageMessage", "This is the first page");
		return "home";
	}
	
	@RequestMapping(value = "/page2", method = RequestMethod.GET)
	public String secondPage(Model model) {
		model.addAttribute("secondPageMessage", "This is the second page");
		return "secondpage";
	}
        @RequestMapping(value = {"/employee"}, method = RequestMethod.GET)
	public String savePage(Model model) {
		model.addAttribute("employee", new Employee());
                //model.addAttribute("allEmployees", (ArrayList<Employee>)employeeServiceInterface.getAllEmployees());
                model.addAttribute("allEmployees", (ArrayList<Employee>) employeeServiceInterface.getEmployeesBySP());
                model.addAttribute("article",(ArrayList<TblArticle>)pageServiceInterface.getAllArticle());
		return "employeepage";
	}
	
}
