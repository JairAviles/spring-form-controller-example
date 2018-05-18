package com.first.assignment.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.first.assignment.bean.UserBean;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return UserBean.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		UserBean user = (UserBean) obj;

		ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.required");
		if (user.getFirstName().length() < 3 || user.getFirstName().length() > 30) {
	        errors.rejectValue("firstName", "firstName.required");
	    }

		ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.required");
		if (user.getLastName().length() < 3 || user.getLastName().length() > 30) {
	        errors.rejectValue("lastName", "lastName.required");
	    }
		
		ValidationUtils.rejectIfEmpty(errors, "sex", "sex.required");
		
		ValidationUtils.rejectIfEmpty(errors, "dateBirth", "dateBirth.required");
		
		ValidationUtils.rejectIfEmpty(errors, "email", "email.required");
		
		ValidationUtils.rejectIfEmpty(errors, "section", "section.required");
		
		ValidationUtils.rejectIfEmpty(errors, "country", "country.required");
		
		ValidationUtils.rejectIfEmpty(errors, "subjects", "subjects.required");
		
	}

}
