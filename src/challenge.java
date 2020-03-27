public class challenge {

    public static void main(String []args){

        boolean gameOver = true;
        int score = 800;
        int levelcompleted  = 5;
        int bonus = 100;


        if(gameOver){
            int finalScore = score + ( levelcompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Print second score on the screen with the following
        //score set to 10000
        //level completed set to 8
        //bonus set to 200
        
        int scoreTwo = 10000;
        int levelCompletedTwo = 8;
        int bonusTwo = 200;
        
        if(gameOver){

            int finalScore = scoreTwo + ( levelCompletedTwo * bonusTwo);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
