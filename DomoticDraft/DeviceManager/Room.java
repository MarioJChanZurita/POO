package DeviceManager;

import Devices.Device;

public class Room extends Area {

    private Inventory<Device> deviceInventory;
    private String roomName;

    public Room(){
        this("roomName");
    }

    public Room(String roomName){
        this.deviceInventory = new Inventory<>();
        this.roomName = roomName;
    }

    public String toString(){
        String output = " ";
        output = super.toString() +
                "Room name: " + this.roomName + "\n";
        return output;
    }

}
