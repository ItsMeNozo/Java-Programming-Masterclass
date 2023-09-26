public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68)); 
    }

    public static double convertToCentimeters(int hInch ){
        return (double)hInch * 2.54d; 
    }
    public static double convertToCentimeters(int hFeet, int hInch){
        int totalHeightInch = hFeet * 12 + hInch; 

        return convertToCentimeters(totalHeightInch);
    }
}
