public class Main {

    public static void main(String[] args) {
        System.out.println("Main");

        WindowOne one = new WindowOne();
        WindowTwo two = new WindowTwo();

        one.windowTwo = two;
        two.windowOne = one;
        one.start();
        two.start();
        System.out.println("Main exiting...");
    }

}


