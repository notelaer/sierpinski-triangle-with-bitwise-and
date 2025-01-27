import java.util.Scanner;

/**
 * Java program to print a Sierpinski triangle.
 * Based on <a href="https://www.geeksforgeeks.org/sierpinski-triangle/">this geeksforgeeks page with the original program</a>
 * where the initial Java code was contributed by Sahil_Bansall.
 * Adapted by Bart Notelaers to learn and understand the bitwise operator &
 * by printing values of x and y instead of a single '*'.
 */
public class Sierpinski {

    public static void main(String[] args) {
        // ask for size from user
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size for the Sierpinski triangle, as a power of 2.\nFor example 16, 32, 64 etc;\n");
            size = input.nextInt();
        } while ((size == 0) || ((size & (size - 1)) != 0)); // input must be a power of 2

        // start printing Sierpinski triangle
        for (int y = size - 1; y >= 0; y--) {
            // print spaces up to the left side of the triangle
            for (int i = 0; i < y; i++) {
                System.out.printf("%3s", " ");
            }
            // print a horizontal line of the triangle
            for (int x = 0; x + y < size; x++) {
                // if bitwise AND value of x and y is 0, print x,y
                // else print !0
                if ((x & y) == 0) {
                    String xy = x + "," + y;
                    System.out.printf("%6s", xy);
                } else {
                    System.out.printf("%6s", "!0");
                }
            }
            System.out.print("\n");
        }
    }
}


