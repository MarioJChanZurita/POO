package DeviceManager;

public class Inventory<Type> {

    private Type[] items;
    private int firstFreeIndex;

    public Inventory(){
        this.items = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type item){
        if (this.firstFreeIndex == this.items.length){
            grow();
        }
        this.items[this.firstFreeIndex] = item;
        this.setLastIndex(this.firstFreeIndex + 1);
    }
    /*
    public Type search(String itemName){
        Type output = null;
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].equals(itemName)) {
                output = this.items[i];
            }
        }
        return output;
    }
    */
    public Type get(int index){
        return this.items[index];
    }

    public void remove(Type item) {
        int indexOfItem = indexOfItem(item);
        if (indexOfItem < 0){
            return;
        }
        moveToTheLeft(indexOfItem);
        this.setLastIndex(this.firstFreeIndex - 1);
    }

    private void setLastIndex(int index){
        this.firstFreeIndex = index;
    }

    private int indexOfItem(Type device){
        int output = -1;
        for (int i = 0; i < this.items.length; i++){
            if (this.items[i].equals(device)) {
                output = i;
            }
        }
        return output;
    }

    private void moveToTheLeft( int fromIndex){
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++){
            this.items[i] = this.items[i + 1];
        }
    }

    private void grow(){
        int newSize = this.items.length + this.items.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.items.length; i++){
            newValues[i] = this.items[i];
        }
        this.items = newValues;
    }

    public int length(){
        return this.items.length;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null){
                output += this.items[i] + "\n";
            }
        }
        return output;
    }

}