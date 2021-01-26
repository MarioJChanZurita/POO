package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Device;
import com.example.repository.DataBaseDeviceDAO;

@Controller
public class EliminarController {
	
	private DataBaseDeviceDAO dataBaseDeviceDAO = new DataBaseDeviceDAO();
	private int id;
	
	@RequestMapping(value = "/eliminar", method = { RequestMethod.GET, RequestMethod.POST})
	public String eliminar(HttpServletRequest request, Device device) {
		id = Integer.parseInt(request.getParameter("id"));
		dataBaseDeviceDAO.delete(device, id);
		return "menu";
	}
	
}
