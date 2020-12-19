package com.example.domotic;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		DeviceFile deviceFile = new DeviceFile();
		
		List<Device> deviceList =  deviceFile.readFile();

		//Imprime datos de archivo original
		for (Device element : deviceList) {
			System.out.println(element);
		}
		
		//Se edita un archivo 
		DeviceSpecs deviceSpecs = new DeviceSpecs(3, null, "Smart TV", true, false);
		deviceSpecs.setBrand("Panasonic");
		Device device = new Device("TV Jorge", 2, false, deviceSpecs);
		device.setId(2);
		deviceFile.editFile(device, deviceList);
		
		//Imprime datos de archivo editado
		deviceList = deviceFile.readFile();
		for (Device element : deviceList) {
			System.out.println(element);
		}
		
	}

}

