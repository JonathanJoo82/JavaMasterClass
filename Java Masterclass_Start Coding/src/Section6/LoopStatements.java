package Section6;

public class LoopStatements {

    public static void main(String[] args){
        //for loops
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }
        System.out.println();

        //while loops
        boolean check = true;
        int j = 1;
        while (check){
            System.out.println(j);
            j++;
            if(j > 5){
                check = false;
            }
        }

        // do while loops
        //runs logic then checks the condition.
        //can use condition to break or a break statement.
        System.out.println();
        int x = 1;
        boolean isReady = true;
        do {
            System.out.println(x);
            x++;
            isReady = (x < 6);
        } while(isReady);
    }


}
