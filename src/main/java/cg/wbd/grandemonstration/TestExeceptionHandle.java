package cg.wbd.grandemonstration;

import cg.wbd.grandemonstration.service.exception.DuplicateEmailException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class TestExeceptionHandle {
	@ExceptionHandler(DuplicateEmailException.class)
	public ModelAndView showInputNotAcceptable() {
		return new ModelAndView("customers/inputs-not-acceptable");
	}
}
