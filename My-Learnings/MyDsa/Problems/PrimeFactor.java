
import java.util.Scanner;

/*
1   2   3   4   5   6   7   8   9  10
11  12  13  14  15  16  17  18  19  20
21  22  23  24  25  26  27  28  29  30
31  32  33  34  35  36  37  38  39  40
41  42  43  44  45  46  47  48  49  50
51  52  53  54  55  56  57  58  59  60
61  62  63  64  65  66  67  68  69  70
71  72  73  74  75  76  77  78  79  80
81  82  83  84  85  86  87  88  89  90
91  92  93  94  95  96  97  98  99 100 */


 
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int n = scan.nextInt();
        enhancedPrimeFactor(n);
    }
    public static void primeFactor(int n){ // Not an efficient way   Time Complexity : O(n)
        int i = 2; // Initialize from first Prime Number : 2
        while(n>1) {
        while( n%i == 0){   //check which is modulus equals to run an endless loop until it get fails
            System.out.println(i);// print the i values;
            n = n/i; //Update n values
        }
        i++; //increment when while loop fails.
    }
 
}
public static void  enhancedPrimeFactor(int n){
    
    int i = 2;
    
    while(i*i <= n){
        while( n % i == 0){
            System.out.println(i);
            n = n / i;
        }
        i++;
        
    }
    if(n > 1){
        System.out.print(n);
    }
}
}
