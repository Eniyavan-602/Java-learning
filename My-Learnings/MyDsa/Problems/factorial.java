
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter an Number: ");   
    int n = scan.nextInt();
    int res = fact(n);
    System.out.println("Factorial of a Number: "+res);

}
public static  int fact(int n){
int res = 1;
for (int i = 1; i <= n; i++) {
    res *= i;
}
return res;
}
}
