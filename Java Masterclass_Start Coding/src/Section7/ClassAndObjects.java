package Section7;

public class ClassAndObjects {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getMake());
        car.setMake("Tesla");
        System.out.println(car.getMake());

//        Car carWithArguments = new Car("Toyota", "Rav4", "Red", 4, true);
//        System.out.println(carWithArguments.getDoors());




        //static keyword
        System.out.println();
        KeyWordStatic instance1 = new KeyWordStatic("rex");
        instance1.printName();
        KeyWordStatic instance2 = new KeyWordStatic("fluffy");
        System.out.println();
        instance1.printName();
        instance2.printName();
    }


}
