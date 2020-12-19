package com.example.domotic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class DeviceFile {

	SpecsFile specs = new SpecsFile();
	
	public List<Device> readFile(){
		List<Device> devicesList = new ArrayList<>();
		try {
			BufferedReader readFile = new BufferedReader(new FileReader("device.txt"));
			String row;
			while ((row = readFile.readLine()) != null) {
				Device device = new Device();
				
				String[] parts = row.split(",");
				
				device.setId(Integer.valueOf(parts[0]));
				device.setName(parts[1]);
				device.setIdRoom(Integer.valueOf(parts[2]));
				device.setIsIndispensable(Boolean.valueOf(parts[3]));
				DeviceSpecs deviceSpecs = specs.readSpecificSpecs(Integer.valueOf(parts[4]));
				device.setDeviceSpecs(deviceSpecs);
				
				devicesList.add(device);
			}
			readFile.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return devicesList;
	}
	
	
	public void editFile(Device device, List<Device> devicesList) {
		for(Device element : devicesList) {
			if (element.getId() == device.getId()) {
				element.setName(device.getName());
				element.setIdRoom(device.getIdRoom());
				element.setIsIndispensable(device.getIsIndispensable());
				element.setDeviceSpecs(device.getDeviceSpecs());
			}
		}
		File file = new File("device.txt");
		file.delete();
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("device.txt",true), "utf-8"));
			for (int i = 0; i < devicesList.size(); i++) {
				writer.write(devicesList.get(i).getId() + "," +
					devicesList.get(i).getName() + "," + 
					devicesList.get(i).getIdRoom() + "," +
					devicesList.get(i).getIsIndispensable() + "," +
					devicesList.get(i).getDeviceSpecs().getId() + "\n");
				
				List<DeviceSpecs> deviceSpecsList = specs.readFile();
				specs.editFile(device.getDeviceSpecs(), deviceSpecsList);
			}
			writer.close();
		}catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
	}
	
}
