package com.example.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.model.Device;
import com.example.repository.DataBaseDeviceDAO;

@Controller
public class EditarController {

	private DataBaseDeviceDAO dataBaseDeviceDAO = new DataBaseDeviceDAO();
	private int id;
	
	@RequestMapping("/irEditar")
	public String redireccion(HttpServletRequest request, ModelMap model) {
		id = Integer.parseInt(request.getParameter("id"));
		List<Map<String, Object>> list = dataBaseDeviceDAO.getSpecificDevice(id);
		model.addAttribute("devicesList", list);
		return "editar";
	}
	
	@RequestMapping(value = "/editar", method = { RequestMethod.GET, RequestMethod.POST})
	public String editar(Device device) {
		dataBaseDeviceDAO.update(device, id);
		return "menu";
	}
}
