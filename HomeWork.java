import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive index number of  Fibonacci sequence  to count to: ");
        int Position = scanner.nextInt();
        int firstFib = 0;
        int nextFib = 1;
        if (Position < 0) {
            System.out.println("An index number must be a positive number.");
            return;
        }
        for (int i = 0; i < Position; i++) {
            int sumFib = firstFib + nextFib;
            firstFib = nextFib;
            nextFib = sumFib;
        }
        if (firstFib == 1) {
            System.out.println("the number you receive is : " + firstFib + " in " + Position + "st index");
        } else if (firstFib == 2) {
            System.out.println("the number you receive is : " + firstFib + " in " + Position + "nd index");
        } else if (firstFib == 3) {
            System.out.println("the number you receive is : " + firstFib + " in " + Position + "rd index");
        } else {
            System.out.println("the number you receive is : " + firstFib + " in " + Position + "th index");
        }
    }

}
