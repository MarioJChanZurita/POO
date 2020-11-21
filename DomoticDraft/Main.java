public class Main{

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Device device = new Device(1600, true, "Room AC", Type.AC, Brand.YORK);
        inventory.addDevice(device);
    
    }
}