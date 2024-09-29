import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter length of CENTIMETER");
        double length = scanner.nextDouble();
        double inches = length / 2.54;
        int feet = (int)inches /12;
        double inche = inches % 12;

        System.out.printf("feet " + feet + " inches " + inche);






    }
}



