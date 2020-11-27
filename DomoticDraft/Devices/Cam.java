package Devices;

public class Cam extends Device {

    private int resolution;

    public Cam(int Id, boolean Status, String Name, DeviceSpecs deviceSpecs, int resolution){
        super(Id, Status,Name,deviceSpecs);
        this.resolution = resolution;
    }

    public String toString(){
        String output = " ";
        output = super.toString() + "Resolution: " + this.resolution + "\n";
        return output;
    }

    public boolean equals(Object o) {
        boolean output = false;
        if(o != null && o instanceof Lamp) {
            Cam cam = (Cam) o;
            if(resolution == cam.resolution && super.equals(cam)) {
                output = true;
            }
        }
        return output;
    }

}
