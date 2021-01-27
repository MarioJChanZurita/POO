
package com.example.entity;


public class DeviceSpecs {
    
    private int idSpecs;
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothWifiBuiltIn;

    public int getId() {
        return idSpecs;
    }

    public void setId(int id) {
        this.idSpecs = id;
    }

    public String getBrand() {
        return brand.getBrandName();
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWifiBuiltIn() {
        return wifiBuiltIn;
    }

    public void setWifiBuiltIn(boolean wifiBuiltIn) {
        this.wifiBuiltIn = wifiBuiltIn;
    }

    public boolean isBluetoothWifiBuiltIn() {
        return bluetoothWifiBuiltIn;
    }

    public void setBluetoothWifiBuiltIn(boolean bluetoothWifiBuiltIn) {
        this.bluetoothWifiBuiltIn = bluetoothWifiBuiltIn;
    }
    
    
    
}
