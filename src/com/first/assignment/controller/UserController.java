package com.first.assignment.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.first.assignment.bean.UserBean;
import com.first.assignment.services.UserService;

@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {
	
	private UserService userService;
	
	public UserController()
    {
        setCommandClass(UserBean.class);
        setCommandName("user");
    }
	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
    protected ModelAndView onSubmit(Object command) throws Exception {
		UserBean user = (UserBean)command;
		userService.add(user);
        return new ModelAndView("success","user",user);
    }
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Map referenceData(HttpServletRequest request) throws Exception {
		
		Map referenceData = new HashMap();
		
		Map<String,String> country = new LinkedHashMap<String,String>();
		country.put("US", "United Stated");
		country.put("IN", "India");
		country.put("MX", "Mexico");
		country.put("CA", "Canada");
		referenceData.put("countryList", country);
		
		Map<String,String> subjects = new LinkedHashMap<String,String>();
		subjects.put("Physics", "Physics");
		subjects.put("Chemistry", "Chemistry");
		subjects.put("Life Science", "Life Science");
		subjects.put("Political Science", "Political Science");
		referenceData.put("subjectList", subjects);
		
		return referenceData;
	}

}
