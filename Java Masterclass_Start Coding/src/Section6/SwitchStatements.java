package Section6;

public class SwitchStatements {

    public static void main(String[] args){
        //switch statements

        int x = 5;
        switch(x){
            case 5:
                System.out.println("number is 5");
                break;
            case 10:
                System.out.println("number is 10");
                break;

            case 15: case 20: case 25:
                System.out.println("15 20 25");
                break;
            default:
                System.out.println("aint 5 or 10");
        }

        // new syntex
        switch(x) {
            case 5 ->  System.out.println("number is 5");
            case 10 ->  System.out.println("number is 10");
            case 15, 20,25 ->  System.out.println("15 20 25");
            default -> System.out.println("aint 5 or 10");
        }
    }
}
