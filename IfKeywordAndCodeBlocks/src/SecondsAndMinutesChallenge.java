public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(36097));
    }


    public static String getDurationString(int seconds){
        if (seconds < 0)
        {
            System.out.println("Invalid seconds");
            return ""; 
        }

        int minutes = seconds/60; 
        int remainingSeconds = seconds % minutes; 
        // System.out.println(minutes + " " + remainingSeconds);

        return getDurationString(remainingSeconds, minutes); 
        
    }

    public static String getDurationString(int seconds, int minutes){
        if ((seconds < 0 || seconds > 59) || minutes < 0)
        {
            System.out.println("Invalid seconds or minutes");
            return ""; 
        }

        int hours = minutes / 60, 
        remainingMinutes = minutes % hours; 
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
        
    }
}
