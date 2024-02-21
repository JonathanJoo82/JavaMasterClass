package Section5;

public class KeywordsAndStatements {

    public static void main(String[] args) {

        /*
        Keywords and Expressions
         */

        /*
        51 reserved words that java uses as keywords
        these words can not be used to declare as variables or other ways.
        must be used for the designed purpose of it

        Expression = computes to a single value
        int x = 1+5;
        "1+5;" is the expresssion

        Statement = stand alone units of work
        int x = 1+5; is the statement

        code block = set of 0, 1, or more statements usually grouped together to acheive a single goal
         */
        int highscore = 540;
        if (highscore > 25){
            highscore = 1000 + highscore;
        }

        int health = 100;
        if ((health < 25) && (highscore > 1000)){
            highscore = highscore - 1000;
        }
        /*
        there are six statments here
        health = 100
        health < 25
        highscore > 1000
        (health < 25) && (highscore > 1000)
        highscore - 1000
        highscore = highscore - 1000 //this is an assigment and calculation expression. it's two expressions in one statement.
         */
    }
}
