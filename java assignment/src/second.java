import java.util.Scanner;

public class second{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the your full name(first middle and last):");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.println(last + "," + first + " " + middle.charAt(0));


    }

}

