package Devices;

public class DeviceSpecs{
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn;

    public DeviceSpecs(Brand brand, String model, boolean wifiBuiltIn, boolean bluetoothwifiBuiltIn){
        this.brand = brand;
        this.model = model;
        this.wifiBuiltIn = wifiBuiltIn;
        this.bluetoothwifiBuiltIn = bluetoothwifiBuiltIn;
    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public Brand getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public boolean getBluetooth(){
        return this.bluetoothwifiBuiltIn;
    }

    public void setBluetooth(boolean bluetooth){
        this.bluetoothwifiBuiltIn = bluetooth;
    }

    public boolean getWifi(){
        return this.wifiBuiltIn;
    }

    public void setWifi(boolean wifi){
        this.wifiBuiltIn = wifi;
    }

    public String toString(){
        String output;
        output = "Brand name: " + this.brand.getBrandName() + "\n" +
                " Model: " + this.model + "\n" +
                " WifiBuiltIn: " + this.wifiBuiltIn + "\n" +
                " BluetoothwifiBuiltIn: " + this.bluetoothwifiBuiltIn;
        return output;
    }

    public boolean equals(DeviceSpecs deviceSpecs){
        boolean output = false;
        if (deviceSpecs != null &&
                this.brand.equals(deviceSpecs.getBrand()) &&
                this.model == deviceSpecs.getModel()){
            output = true;
        }
        return output;
    }
}