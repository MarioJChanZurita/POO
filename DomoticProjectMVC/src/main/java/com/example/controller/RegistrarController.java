package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.Device;
import com.example.repository.DataBaseDeviceDAO;

@Controller
public class RegistrarController {
	
	@RequestMapping(value = "/domotic/irRegistrar", method = { RequestMethod.GET, RequestMethod.POST})
	public ModelAndView redireccion() {
		return new ModelAndView("registrar", "command", new Device());
	}
	
	@RequestMapping(value = "/registrar", method = { RequestMethod.GET, RequestMethod.POST})
	public String registrar(Device device) {
		DataBaseDeviceDAO dataBaseDeviceDAO = new DataBaseDeviceDAO();
		dataBaseDeviceDAO.register(device);
		return "menu";
	}
	
}
