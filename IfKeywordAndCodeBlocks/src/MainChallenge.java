public class MainChallenge {
    public static void main(String[] args){
        int highScore = Integer.MIN_VALUE; 
        
        highScore = Integer.max(highScore, calculateScore(true, 800, 5, 100)); 

        highScore = Integer.max(highScore, calculateScore(true, 10000, 8, 200)); 

        
        System.out.println("Your highest score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score; 

        if (gameOver){
            finalScore += (levelCompleted * bonus); 
        }

        return finalScore; 
    }
}
