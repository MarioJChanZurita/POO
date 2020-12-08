import DeviceManager.Area;
import DeviceManager.Room;
import Devices.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creando espacios, habitaciones y dispositivos
        Area area = new Area("roomsArea");
        Room mainRoom = new Room("mainRoom");
        Room secondaryRoom = new Room("secondaryRoom");

        DeviceSpecs deviceSpecsAC = new DeviceSpecs(Brand.YORK, "Minisplit", true, false);
        Device mainRoomAC = new AC(1234, true, "mainRoomAC", deviceSpecsAC, 16);

        DeviceSpecs deviceSpecsTV = new DeviceSpecs(Brand.SONY, "Bravia 8k", true, false);
        Device secondaryRoomTV = new TV(5678, true, "secondaryRoomTV", deviceSpecsTV, "OLED");

        //-------------------------
        area.add(mainRoom);
        area.add(secondaryRoom);

        mainRoom.add(mainRoomAC);
        secondaryRoom.add(secondaryRoomTV);

        System.out.println("Todo lo almacenado:");
        System.out.println(area.toString());

        Device deviceToEdit = mainRoom.searchDevice("mainRoomAC");
        String featureToEdit = "status";
        deviceToEdit.edit(featureToEdit, scanner);

    }
}