public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        calculateScore(true,800,5,100);

        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(gameOver,score,levelCompleted,bonus);
        
        

        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;
        // if(gameOver)//scope - accessibility of variable
        // {
        //     int finalScore = score + (levelCompleted * bonus);
        //     System.out.println("Your final Score was " + finalScore);
        // }


    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        
        if(gameOver)//scope - accessibility of variable
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
            System.out.println("Your final Score was " + finalScore);
            return finalScore;
        }
        return -1;
        // }else{
        //     return -1;
        // }

    }
}
