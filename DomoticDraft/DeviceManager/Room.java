package DeviceManager;

import Devices.Device;

public class Room {

    private Inventory<Device> deviceInventory;
    private String roomName;

    public Room(){
        this("roomName");
    }

    public Room(String roomName){
        this.deviceInventory = new Inventory<>();
        this.roomName = roomName;
    }

    public void add(Device device){
        this.deviceInventory.add(device);
    }

    public void remove(Device device){
        this.deviceInventory.remove(device);
    }

    public Device searchDevice(String deviceName){
        Device device = null;
        for(int i = 0; i<this.deviceInventory.length(); i++){
            device = this.deviceInventory.get(i);
            if(device.getName().equals(deviceName)){
                break;
            }
        }
        return device;
    }

    public String getName(){
        String output = "";
        output = this.roomName;
        return output;
    }

    public Inventory<Device> getInventory(){
        Inventory output = this.deviceInventory;
        return output;
    }

    public String toString(){
        String output = "";
        output = "Room name: " + this.roomName + "\n" +
                this.deviceInventory.toString();
        return output;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }

        if (!(compared instanceof Room)){
            output = false;
        }

        Room comparedRoom = (Room) compared;

        if (this.roomName.equals(comparedRoom.getName()) &&
                this.deviceInventory.length() == comparedRoom.getInventory().length() &&
                this.deviceInventory.equals(comparedRoom.getInventory())){
            output = true;
        }
        return output;
    }

}
