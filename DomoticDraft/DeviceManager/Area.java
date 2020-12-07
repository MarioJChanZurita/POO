package DeviceManager;

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

    public Room search(Room room){
        return this.roomInventory.search(room);
    }

    public String toString(){
        String output = " ";
        output = "Area name: " + this.areaName + "\n";
        output += this.roomInventory.toString() + "\n";
        return output;
    }

}
