class Test{
    static int a, b;
    static {
        System.out.println("Inside Static Block");
        a = 10;
        b = 20;
    }
    static void fun1(){
        System.out.println("Inside Static Method");
    }
    int x,y;
    {
        System.out.println("Inside Non-Static Block");
    }
    void fun2(){
        System.out.println("Inside Non-Static Method");
    }

    public Test(){
        System.out.println("Inside Constructor");
        x = 30;
        y=40;
    }
}
public class Static1 {
    public static void main(String[] args) {
        Test.fun1();//we can call static members without creating object
        Test t = new Test();
        t.fun2();
    }
}
/*
 * when a code is loaded into code segment JVM check for 
 * 1.Static variable
 * 2.Static Block
 * for Main method only 3.
 * 3.Static Method
 * for later any class only 1. 2.   
 * 
 * Ex:main method have static
 * if any static member found  the memory will allocated in static memory
 when a object created new Test();
 1-> create object
 2-> check for Instance block
 3-> then create constructor
 4 -> then method with obj ref
 JAVA is known as Dynamic Programming language.
 Robust - manage memory efficiently

 Static Segments will be called as -> Method Area, Meta Space, permanant Generation(Perm Gen)
 */