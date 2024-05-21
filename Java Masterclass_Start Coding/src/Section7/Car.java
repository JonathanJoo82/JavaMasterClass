package Section7;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    Car(){
        this("Toyota", "Rav4", "Red", 4, true);
        System.out.println("Calling constructor within a constructor");

        System.out.println("empty constructor call");


    }

    Car(String make, String model, String color, int doors, boolean convertible){
        System.out.println("Calling constructor with arguments passed.");
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible": "Non Convertible"));
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
