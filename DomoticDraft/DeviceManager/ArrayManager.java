package DeviceManager;

import Devices.Device;

public class ArrayManager<Type> {

    private Type[] items;
    private int firstFreeIndex;

    public ArrayManager(){
        this.items = (Type[]) new Object[20];
        this.firstFreeIndex = 0;
    }

    public void addItem(Type item){
        if (this.getLastIndex() == this.items.length){
            grow();
        }
        this.items[this.getLastIndex()] = item;
        this.setLastIndex(this.getLastIndex() + 1);
    }

    public Type getItem(Type item){
        return this.searchItem(item);
    }

    public Type searchItem(Type item){
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].equals(item)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(Type item) {
        int indexOfDevice = indexOfDevice(item);
        if (indexOfDevice < 0){
            return;
        }

        moveToTheLeft(indexOfDevice);
        this.setLastIndex(this.getLastIndex() - 1);
    }


    public void setLastIndex(int index){
        this.firstFreeIndex = index;
    }
    public int getLastIndex(){
        return this.firstFreeIndex;
    }

    public int indexOfDevice(Type device){
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].equals(device)) {
                return i;
            }
        }
        return -1;
    }

    public void moveToTheLeft( int fromIndex){
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++){
            this.items[i] = this.items[i + 1];
        }
    }

    public void grow(){
        int newSize = this.items.length + this.items.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.items.length; i++){
            newValues[i] = this.items[i];
        }
        this.items = newValues;
    }

}
