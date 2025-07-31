<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherModelingFileSingle {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            solveQuadratic(a, b, c);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots. Complex solutions.");
        }
    }
}
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherModelingFileSingle {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            solveQuadratic(a, b, c);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }

    static void solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots. Complex solutions.");
        }
    }
}
>>>>>>> e69770c13510116bc30718975dbd512d9020f4b8
