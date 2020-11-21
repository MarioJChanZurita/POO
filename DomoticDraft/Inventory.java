public class Inventory extends ManageArray{
    private final Device[] devices;

    public Inventory(){
        this.devices = new Device[20];
    }

    public void addDevice(Device device){
        if (this.getLastIndex() == this.devices.length){
            grow(this.devices);
        }
        this.devices[this.getLastIndex()] = device;
        this.setLastIndex(this.getLastIndex() + 1);
    }

    public Device getDevice(Device device){
        return this.searchDevice(device);
    }

    public Device searchDevice(Device device){
        for (int i = 0; i < this.devices.length; i++){
            if (this.devices[i].equals(device)) {
                return device;
            }
        }
        return null;
    }

    public void removeDevice(Device device) {
        int indexOfDevice = indexOfDevice(this.devices, device);
        if (indexOfDevice < 0){
            return;
        }

        moveToTheLeft(this.devices, indexOfDevice);
        this.setLastIndex(this.getLastIndex() - 1);
    }

}