package Section7;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;


    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public Dog(String type, double weight){
        this(type, weight, "perky", "Curled");
    }

    public Dog() {
        super("Mutt", "Big", 50);
    }

//    public Dog(){
//        super();
//    }


//    @Override
//    public void makeNoise() {
//        System.out.println("The dog goes woof");
//    }

//    @Override
//    public void makeNoise() {
//        System.out.println("in the dog POJO class");
//        super.makeNoise();
//    }
}
