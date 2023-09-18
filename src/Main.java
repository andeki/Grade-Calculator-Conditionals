import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //prompts user for input
        System.out.println("Input grade:");
        System.out.print("__%: ");
        //run scanner
        double grade = s.nextDouble();

        //conditionals, if else-ing every condition
        //more than or equal to represent [ ] math symbols
        if (grade >= 92) {
            System.out.println("Your grade is an A");
        } else if (grade >= 89) {
            System.out.println("Your grade is an A-");
        } else if (grade >= 87) {
            System.out.println("Your grade is a B+");
        } else if (grade >= 82) {
            System.out.println("Your grade is a B");
        } else if (grade >= 79) {
            System.out.println("Your grade is a B-");
        } else if (grade >= 77) {
            System.out.println("Your grade is a C+");
        } else if (grade >= 72) {
            System.out.println("Your grade is a C");
        } else if (grade >= 69) {
            System.out.println("Your grade is a C-");
        } else if (grade >= 67) {
            System.out.println("Your grade is a D+");
        } else if (grade >= 60) {
            System.out.println("Your grade is a D");
        } else if (grade >= 0) {
            System.out.println("An F. Representative of your failure.");
        } else {
            System.out.println("Error: likely entered a negative number or invalid input to be graded.");
        }

        //modulo to ensure the user is not confused by 89s, 79s, or 69s
        if (grade % 10 == 9 && grade < 99)
        {
            System.out.println("Grades ending in 9s qualify for traditionally associated above grade.");
        }
    }
}
