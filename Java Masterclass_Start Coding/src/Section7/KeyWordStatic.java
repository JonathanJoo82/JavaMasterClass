package Section7;

public class KeyWordStatic {

    private static String test;
    public KeyWordStatic(String name){
        this.test = name;
    }
    public void printName(){
        System.out.println(test);
    }
}
