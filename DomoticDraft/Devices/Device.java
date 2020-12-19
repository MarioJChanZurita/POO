package Devices;

import java.util.Scanner;

public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    private final DeviceSpecs deviceSpecs;

    public Device() {
        this(0, false, "name", null);
    }

    public Device(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceSpecs = deviceSpecs;
    }

    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }

    public String toString(){
        String output;
        output ="ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                this.deviceSpecs.toString();
        return output;
    }

    public Brand brandSelected(String brand ){
        Brand output = null;
        switch (brand){
            case "LG":
                output = Brand.LG;
                break;
            case "Panasonic":
                output = Brand.PANASONIC;
                break;
            case "Sony":
                output = Brand.SONY;
                break;
            case "Daewo":
                output = Brand.DAEWO;
                break;
            case "Carrier":
                output = Brand.CARRIER;
                break;
            case "York":
                output = Brand.YORK;
                break;
        }
        return output;
    }

    public void edit(String featureToEdit, Scanner scanner){
        switch (featureToEdit){
            case "id":
                this.Id = scanner.nextInt();
                break;
            case "status":
                if (this.Status){
                    this.Status = false;
                } else {
                    this.Status = true;
                }
                break;
            case "name":
                this.Name = scanner.nextLine();
                break;
            case "brand":
                String brand = scanner.nextLine();
                this.deviceSpecs.setBrand(this.brandSelected(brand));
            case "model":
                String model = scanner.nextLine();
                this.deviceSpecs.setModel(model);
                break;
            case "bluetooth":
                if (this.deviceSpecs.getBluetooth()){
                    this.deviceSpecs.setBluetooth(false);
                } else {
                    this.deviceSpecs.setBluetooth(true);
                }
                break;
            case "wifi":
                if (this.deviceSpecs.getWifi()){
                    this.deviceSpecs.setWifi(false);
                } else {
                    this.deviceSpecs.setWifi(true);
                }
                break;
        }
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof Device)){
            output = false;
        }
        Device comparedDevice = (Device) compared;
        if (this.Id == comparedDevice.getId() &&
                this.Status == comparedDevice.getStatus() &&
                this.Name.equals(comparedDevice.getName()) &&
                this.deviceSpecs.equals(comparedDevice.deviceSpecs)){
            output = true;
        }
        return output;
    }


}    