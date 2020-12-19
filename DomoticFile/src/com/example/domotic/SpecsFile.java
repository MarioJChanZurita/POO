package com.example.domotic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpecsFile {

	public List<DeviceSpecs> readFile(){
		List<DeviceSpecs> specsList = new ArrayList<>();
		DeviceSpecs specs = new DeviceSpecs();
		try {
			Scanner readFile = new Scanner(Paths.get("specs.txt"));
			while (readFile.hasNextLine()) {
				String row = readFile.nextLine();
				String[] parts = row.split(",");
				specs.setId(Integer.valueOf(parts[0]));
				specs.setBrand(parts[1]);
				specs.setModel(parts[2]);
				specs.setWifi(Boolean.valueOf(parts[3]));
				specs.setBluetooth(Boolean.valueOf(parts[4]));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return specsList;
	}	
	
	public void editFile(DeviceSpecs deviceSpecs, List<DeviceSpecs> deviceSpecsList) {
		for(DeviceSpecs element : deviceSpecsList) {
			if (element.getId() == deviceSpecs.getId()) {
				element.setBrand(deviceSpecs.getBrand().getBrandName());
				element.setModel(deviceSpecs.getModel());
				element.setWifi(deviceSpecs.getWifi());
				element.setBluetooth(deviceSpecs.getBluetooth());
			}
		}
		File file = new File("specs.txt");
		file.delete();
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("device.txt",true), "utf-8"));
			for (int i = 0; i < deviceSpecsList.size(); i++) {
				writer.write(deviceSpecsList.get(i).getId() + "," +
						deviceSpecsList.get(i).getBrand().getBrandName() + "," + 
						deviceSpecsList.get(i).getModel() + "," +
						deviceSpecsList.get(i).getWifi() + "," +
						deviceSpecsList.get(i).getBluetooth() + "\n");
			}
			writer.close();
		}catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
	}
	
	public DeviceSpecs readSpecificSpecs(int idSpecs){
		DeviceSpecs specs = new DeviceSpecs();
		try {
			Scanner readFile = new Scanner(Paths.get("specs.txt"));
			while (readFile.hasNextLine()) {
				String row = readFile.nextLine();
				String[] parts = row.split(",");
				specs.setId(Integer.valueOf(parts[0]));
				specs.setBrand(parts[1]);
				specs.setModel(parts[2]);
				specs.setWifi(Boolean.valueOf(parts[3]));
				specs.setBluetooth(Boolean.valueOf(parts[4]));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return specs;
	}
	
}
