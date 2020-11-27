package Devices;

public class Lamp extends Device {

    private String Color;

    public Lamp(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, String Color) {
        super(Id, Status,Name,deviceSpecs);
        this.Color=Color;
    }

    public String toString(){
        String output = " ";
        output = super.toString() + "Color: " + this.Color+ "\n";
        return output;
    }

    public boolean equals(Object o) {
        boolean output = false;
        if(o != null && o instanceof Lamp) {
            Lamp d = (Lamp) o;
            if(Color.equals(d.Color) && super.equals(d)) {
                output = true;
            }
        }
        return output;
    }

}
