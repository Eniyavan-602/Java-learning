/*
 * Method Overloading / Polymorphism / compile Time Polymorphism / static Binding / Early Binding
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
