
package com.example.controller;

import com.example.database.DeviceDAO;
import com.example.database.SpecsDAO;
import com.example.entity.Device;
import com.example.entity.DeviceSpecs;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
    
    private final ModelAndView mav = new ModelAndView();        
    private final DeviceDAO deviceDAO = new DeviceDAO();
    private final SpecsDAO specsDAO = new SpecsDAO();
    private int id;
    private List datosDevice, datosSpecs;
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        datosDevice = deviceDAO.read();
        datosSpecs = specsDAO.read();        
        mav.addObject("listaDevice", datosDevice);   
        mav.addObject("listaSpecs", datosSpecs);
        mav.setViewName("index");
        return mav;
    }
    
    @RequestMapping(value = "register.htm", method = RequestMethod.GET)
    public ModelAndView Add(){
        Device device = new Device();
        mav.addObject(device);
        mav.addObject(device.getDeviceSpecs());
        mav.setViewName("register");
        return mav;
    }
    
    @RequestMapping(value = "register.htm", method = RequestMethod.POST)
    public ModelAndView Add(Device device, DeviceSpecs deviceSpecs){                    
        specsDAO.create(deviceSpecs);        
        int idForDevice = specsDAO.getLastElementId();
        deviceSpecs.setId(idForDevice);  
        device.setDeviceSpecs(deviceSpecs);
        deviceDAO.create(device);        
        return new ModelAndView("redirect:/index.htm");
    }    
    
    @RequestMapping(value="edit.htm", method = RequestMethod.GET)
    public ModelAndView Edit(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        int idSpecs=deviceDAO.getIdSpecsFromDevice(id);          
        datosDevice=deviceDAO.getElement(id);
        datosSpecs=specsDAO.getElement(idSpecs);           
        mav.addObject("listaDevice", datosDevice);
        mav.addObject("listaSpecs", datosSpecs);
        mav.setViewName("edit");
        return mav;
    }
    
    @RequestMapping(value = "edit.htm", method = RequestMethod.POST)
    public ModelAndView Edit (Device device, DeviceSpecs deviceSpecs){        
        int idSpecs=deviceDAO.getIdSpecsFromDevice(id);
        deviceSpecs.setId(idSpecs);
        specsDAO.update(deviceSpecs);
        device.setId(id);
        deviceDAO.update(device);        
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping("delete.htm")
    public ModelAndView Delete(HttpServletRequest request){
        id=Integer.parseInt(request.getParameter("id"));        
        int idSpecs=deviceDAO.getIdSpecsFromDevice(id);        
        deviceDAO.delete(id);        
        specsDAO.delete(idSpecs);        
        return new ModelAndView("redirect:/index.htm");
    }
    
}
