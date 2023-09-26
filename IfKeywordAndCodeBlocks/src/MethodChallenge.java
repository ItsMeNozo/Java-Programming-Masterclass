public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("A", calculateHighScorePosition(1500)); 
        displayHighScorePosition("B", calculateHighScorePosition(1000)); 
        displayHighScorePosition("C", calculateHighScorePosition(500)); 
        displayHighScorePosition("D", calculateHighScorePosition(100)); 
        displayHighScorePosition("E", calculateHighScorePosition(25)); 
    }

    public static void displayHighScorePosition(String pName, int pPosition){
        System.out.println(pName + " managned to get into position " + pPosition + " on the high score list ");
    }

    public static int calculateHighScorePosition(int pScore){
        int position = 4; 
        if (pScore >= 1000)
            position =  1; 
        else if (pScore >= 500)
            position =  2; 
        else if (pScore >= 100)
            position =  3; 
        return position; 

    }
}
