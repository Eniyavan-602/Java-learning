
import java.util.Scanner;

class Bank{
    private long accountNumber;
    private int passWord;
    
    public void setaccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setpassWord(int passWord){
        this.passWord = passWord;
    }

    public  long  getaccountNumber(){
        return accountNumber;
    }

    public int getpassWord(){
        return passWord;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank b = new Bank();
        System.out.print("Enter Accoun Number: ");
        long AccaountNumber = scan.nextInt();
        System.out.print("Enter Password: ");
        int PassWord =  scan.nextInt();
        b.setaccountNumber(AccaountNumber);
        b.setpassWord(PassWord);
        System.out.println("Your Account Number is: "+b.getaccountNumber());
        System.out.println("Your Password is: "+b.getpassWord());           
    }
}
