package Devices;

import DeviceManager.Room;

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