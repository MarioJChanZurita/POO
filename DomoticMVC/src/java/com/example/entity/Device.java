
package com.example.entity;

public class Device {
 
    private int idDevice;
    private String name;
    private int idRoom;
    private boolean isIndispensable;
    private DeviceSpecs deviceSpecs;
    
    public Device(){
        deviceSpecs = new DeviceSpecs();
    }

    public int getId() {
        return idDevice;
    }

    public void setId(int id) {
        this.idDevice = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public boolean getIsIndispensable() {
        return isIndispensable;
    }

    public void setIsIndispensable(boolean isIndispensable) {
        this.isIndispensable = isIndispensable;
    }

    public DeviceSpecs getDeviceSpecs() {
        return deviceSpecs;
    }

    public void setDeviceSpecs(DeviceSpecs deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
    }
    
    
    
}
