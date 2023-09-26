public class Hello {
    public static void main(String[] args) {
        double a = 20d;
        double b = 80d;
        double remainder = (a + b) * 100d % 40d; 
        
        boolean isZero = (remainder == 0 ? true : false);
        System.out.println(isZero);
        if (!isZero)
            System.out.println("Got some remainder");
    }
}
