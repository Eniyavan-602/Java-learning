
import java.util.Scanner;
/* Time complexity */
public class ProgrammingDay14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n Value: ");
        int n = scanner.nextInt();
        righAnglePattern(n);

    }
    public static void righAnglePattern(int n){
        for(int i =1; i <= n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
