package com.example.controller;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.repository.DataBaseDeviceDAO;
import com.example.repository.DataBaseSpecsDAO;

@Controller
public class MostrarController {

	private DataBaseDeviceDAO dataBaseDeviceDAO = new DataBaseDeviceDAO();
	private DataBaseSpecsDAO dataBaseSpecsDAO = new DataBaseSpecsDAO();
	
	@RequestMapping("/irMostrar")
	public ModelAndView redireccion() {
		return new ModelAndView("mostrar");
	}
	
	@RequestMapping(value = "/mostrar", method = { RequestMethod.GET, RequestMethod.POST})
	public String mostrar(ModelMap model) {
		List<Map<String, Object>> devicesList = dataBaseDeviceDAO.read();
		List<Map<String, Object>> specsList = dataBaseSpecsDAO.read();
		model.addAttribute("devicesList", devicesList);
		model.addAttribute("specsList", specsList);
		return "mostrar";
	}

}
