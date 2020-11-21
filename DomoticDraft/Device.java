public class Device {
    private int Id;
    private boolean Status;
    private Type deviceType;
    private String Name;
    private Brand brand ;

    public Device() {
        this(0, false, "name", null, null);
    }

    public Device(int Id, boolean Status, String Name, Type deviceType, Brand brand) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceType = deviceType;
        this.brand = brand;
    }

    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }

    public Brand getBrand() {
        return brand;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setBrand(Brand brand){
        this.brand = brand;
    }
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "Brand: " + this.brand.getBrandName()+ "\n";
        return output;
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Device)){
            return false;
        }

        Device comparedDevice = (Device) compared;

        if (this.Id == comparedDevice.getId() &&
                this.Status == comparedDevice.getStatus() &&
                this.Name.equals(comparedDevice.getName()) &&
                this.brand.equals(comparedDevice)){
            return true;
        }
        return false;
    }


}    