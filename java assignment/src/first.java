import java.util.Scanner;


public class first {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        Scanner scanner = new Scanner( System.in);
        String word;
        word = scanner.next();

        int place;
        int length;

        if (word.length() %2 == 1) {
            place = word.length() / 2;
            length = 1;
            System.out.printf("The middle of the word is: " + word.substring(place, place + length));
        }
        else {
            System.out.printf("please enter a odd number of words");

        }




        
    }
    }

