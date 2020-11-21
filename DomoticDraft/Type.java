public enum Type {

    AC("AC"),
    TV("TV"),
    LAMP("Lamp"),
    CAM("Cam");

    private String deviceType;

    Type(String deviceType){
        this.deviceType = deviceType;
    }

    public String toString(){
        return this.deviceType;
    }
}
