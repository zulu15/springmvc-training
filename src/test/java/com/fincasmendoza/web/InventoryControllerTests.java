package com.fincasmendoza.web;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.fincasmendoza.service.ProductManagerImpl;

import junit.framework.TestCase;

public class InventoryControllerTests extends TestCase {
	
	
    @Test
    public void testHandleRequestView() throws Exception{		
        InventoryController controller = new InventoryController();
        controller.setProductManager(new ProductManagerImpl());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
	@SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("modelo");
        String nowValue = (String) modelMap.get("time");
        assertNotNull(nowValue);
    }	
}
