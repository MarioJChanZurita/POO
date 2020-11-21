public class ManageArray {

    private int firstFreeIndex;

    public ManageArray(){
        this.firstFreeIndex = 0;
    }

    public void setLastIndex(int index){
        this.firstFreeIndex = index;
    }
    public int getLastIndex(){
        return this.firstFreeIndex;
    }

    public int indexOfDevice(Device[] devices, Device device){
        for (int i = 0; i < devices.length; i++){
            if (devices[i].equals(device)) {
                return i;
            }
        }
        return -1;
    }

    public void moveToTheLeft(Device[] devices, int fromIndex){
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++){
            devices[i] = devices[i + 1];
        }
    }

    public void grow(Device[] devices){
        int newSize = devices.length + devices.length / 2;
        Device[] newValues = new Device[newSize];
        for (int i = 0; i < devices.length; i++){
            newValues[i] = devices[i];
        }
        devices = newValues;
    }

}
