package DeviceManager;

public class Inventory<Type> {

    private ArrayManager<Type> arrayManager;

    public Inventory(){
        this.arrayManager = new ArrayManager<>();
    }

    public void add(Type item){
        this.arrayManager.addItem(item);
    }

    public void remove(Type item){
        this.arrayManager.removeItem(item);
    }

    public Type search(Type item){
        return this.arrayManager.getItem(item);
    }

}