package Section6;

public class LocalAndScopes {
    public static void main(String[] args) {
        boolean aBoolean = true;

        if(aBoolean){
            //local variable. Scope of this variable is only to this if block
            int myCounter = 10;
            System.out.println(myCounter);
        }
        //System.out.println(myCounter);
        //out of scope variable


        int value = 20;
        switch(value){
            case 10:
                String string = "within scope";
                System.out.println(string);
                break;
            case 20:
                string = "within the second scope";
                System.out.println(string);
                break;
            default:
                string = new String("this is within default");
                System.out.println(string);
                break;
        }
    }
}
