package DeviceManager;

public class Area extends Inventory {

    private Inventory<Room> roomInventory;
    public String areaName;

    public Area(){
        this("areaName");
    }

    public Area(String areaName){
        this.roomInventory = new Inventory<>();
        this.areaName = areaName;
    }

    public String toString(){
        String output = " ";
        output = "Area name: " + this.areaName + "\n";
        return output;
    }

}
