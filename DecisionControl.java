//read 2 int nos , swap them using 3rd variable, display on the screen

public class DecisionControl {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}   