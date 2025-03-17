/*
 * Method Overloading / Polymorphism / compile Time Polymorphism / static Binding / Early Binding
    Steps for Method Overloading :
    1.Name
    2.Number of parameter
    3.Type of Parameter
    4.Implicit Type Casting
    (Ambiguity error)[calc.add('A','B')
    class Calculator{
    void add(int a, char b){
    }
    void add(char a, int b){
    }
    }
    ]
    Can you over load Main Method ?
    Yes , Main Method Can be overloaded
    PSVM(){
        s.opln("2";)
        }
    PSVM(int a){
    s.o.pln("3");
    }
    psvm(String[]args)//Main Method {
    s.o.pln("1");
    }
    o/p:
    1
    2
    3
 */ 
import java.util.Scanner;

class Calculator{
    void add(){
        System.out.println(100+200);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a, float b){
        System.out.println(a+b);
    }
    void  add(int a, float b, float c){
        System.out.println(a+b+c);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
     Scanner scan =   new Scanner(System.in);
       Calculator calc = new Calculator();
        calc.add();
        calc.add(20,40);
        calc.add(20,30.3f);
        calc.add(20,30.3f,40);
        calc.add(20,40,50);
    }

}
