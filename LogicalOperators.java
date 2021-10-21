package HomeWork12;

public class LogicalOperators {

    public static void main(String[] args) {

        int A = 88;
        System.out.println(A < 88 & A < 20); //returns false
        System.out.println(A < 88 || A < 20); //returns false
        System.out.println(!(A < 88 & A < 20)); //returns true

        int a = 50;
        System.out.println(a < 50 && a < 60); //returns false
        System.out.println(a < 50 || a < 60); //returns true
        System.out.println(!(a < 50 & a < 60)); //returns true

    }
}
    