package com.fincasmendoza.web;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {
	
	
	@Test
	public void testHandleRequest() throws ServletException, IOException{
		HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
	}

}
