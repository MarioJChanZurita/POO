package DeviceManager;

import Devices.Device;

public class Area {

    private Inventory<Room> roomInventory;
    public String areaName;

    public Area(){
        this("areaName");
    }

    public Area(String areaName){
        this.roomInventory = new Inventory<>();
        this.areaName = areaName;
    }

    public void add(Room room){
        this.roomInventory.add(room);
    }

    public void remove(Room room){
        this.roomInventory.remove(room);
    }

    public Room searchRoom(String roomName){
        Room room = null;
        for(int i = 0; i<this.roomInventory.length(); i++){
            room = this.roomInventory.get(i);
            if(room.getName().equals(roomName)){
                break;
            }
        }
        return room;
    }

    public String toString(){
        String output = " ";
        output = "Area name: " + this.areaName + "\n";
        output += this.roomInventory.toString() + "\n";
        return output;
    }

}
