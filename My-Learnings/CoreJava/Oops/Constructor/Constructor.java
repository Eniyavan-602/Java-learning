
import java.util.Scanner;

class Customer{
    private int accountNUmber;
    private String accountHolder;
    private int passWord;
    private String emailId;
    private long phoneNumber;

    public Customer(){
        accountNUmber = 1234567;
        accountHolder = "Jhonny";
        passWord = 78945;
        emailId = "eniyavan822@gmail.com";
        phoneNumber = 789456101;
    }
    public Customer(int accountNUmber,String accountHolder, int passWord, String emailId, long phoneNumber){
        this();
        this.accountHolder ="Jack";
    }
    public int getaccountNumber(){
        return accountNUmber;
    }
    public String getaccountHolder(){
        return accountHolder;
    }
    public int getpassWord(){
        return passWord;
    }
    public String getemailId(){
        return emailId;
    }
    public long getphoneNumber(){
        return phoneNumber;
    }

}
public class Constructor{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an AccountNumber: ");
        int accountNUmber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an Account Holder Name: ");
        String accountHolder = scan.nextLine();
        System.out.print("Enter an PassWord: ");
        int passWord = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter an Email ID: ");
        String emailId = scan.nextLine();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = scan.nextLong();
       Customer details = new Customer(accountNUmber, accountHolder, passWord, emailId, phoneNumber);
        System.out.println(details.getaccountNumber());
        System.out.println(details.getaccountHolder());
        System.out.println(details.getpassWord());
        System.out.println(details.getemailId());
        System.out.println(details.getphoneNumber());
    
    
    }

}