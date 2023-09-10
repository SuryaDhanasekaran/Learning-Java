public class CodeBlocksAndTheIfThenElseControlStatements {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        // int secondscore = 10000;
        // int levelCompleted2 = 8;
        // int bonus2 = 200;
        // boolean game2Over = true;

        // if(score == 5000)
        // {
        //     System.out.println("Your Score was 5000");
        // }
        // if(score < 5000 && score>1000)//4000
        // {
        //     System.out.println("Your Score was less than 5000 but greater than 1000");
        // }
        // else if (score < 1000)//800
        // {
        //     System.out.println("Your score was less than 1000");

        // }
        // else{//5000
        //     System.out.println("Got here");
        // }

        if(gameOver)//scope - accessibility of variable
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
            System.out.println("Your final Score was " + finalScore);
        }
        //int savedFinalScore = finalScore;//error-cannot able to acces the variable created inside the codeblock
        //from outside the codeblock
        // if(game2Over)//scope - accessibility of variable
        // {
        //     int finalScore2 = secondscore + (levelCompleted2 * bonus2);
        //     System.out.println("Your final Score was " + finalScore2);
        // }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver)//scope - accessibility of variable
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final Score was " + finalScore);
        }


    }
}
    

