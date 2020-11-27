import DeviceManager.Area;
import DeviceManager.Room;
import Devices.*;

public class Main{

    public static void main(String[] args) {

        Area rooms = new Area("roomsArea");
        Room mainRoom = new Room("mainRoom");
        Room secondaryRoom = new Room("secondaryRoom");

        DeviceSpecs deviceSpecsAC = new DeviceSpecs(Brand.YORK, "Minisplit", true, false);
        Device mainRoomAC = new AC(1234, true, "mainRoomAC", deviceSpecsAC, 16);

        DeviceSpecs deviceSpecsTV = new DeviceSpecs(Brand.SONY, "Bravia 8k", true, false);
        Device secondaryRoomTV = new TV(5678, true, "mainRoomAC", deviceSpecsTV, "OLED");

        rooms.add(mainRoom);
        rooms.add(secondaryRoom);

        mainRoom.add(mainRoomAC);
        secondaryRoom.add(secondaryRoomTV);
    
    }
}