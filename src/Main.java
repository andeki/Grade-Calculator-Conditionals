import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input grade:");
        System.out.print("__%: ");
        double grade = s.nextDouble();

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

        if (grade % 10 == 9)
        {
            System.out.println("Grades ending in 9s qualify for traditionally associated above grade.");
        }
    }
}
