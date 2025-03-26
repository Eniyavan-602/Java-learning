import java.util.Scanner;

public class nNumbers { // Corrected class name (capital 'O' and 'N')
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scan.nextInt();
        int res = sum(n); // Corrected call to the sum method
        System.out.println("sumofnumbers: " + res);
        scan.close(); // Close the Scanner
    }

    public static int sum(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
        
    }
}