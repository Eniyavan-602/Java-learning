import java.util.Scanner;

public class fibbonacci { // Corrected class name
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt(); 

        fibbonacci(n); // Call the fibbonacci method

        scan.close(); // Close the scanner
    }

    public static void fibbonacci(int n) {
        int res = 1;
        while (n > 0) {
            res = res * n; // You might need to adjust the logic here
            n--;
        }
        System.out.println("Fibonacci Numbers: " + res);
    }
}