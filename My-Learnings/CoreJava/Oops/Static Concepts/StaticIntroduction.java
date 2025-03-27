

/*
 * Static Intro-
 * Four pillars of OOPS in that between of Encapsulation and Inheritance there is a Concept Static
 */
class Car{
  private String name;     //Giving an name as Private to achieve Encapsulation
    public String getName(){ // Provide an Controled accesses
        return name;
    }
}
public class StaticIntroduction {
    public static void main(String[] args) {
        Car c=new Car();
    System.out.println(c.getName());
    }
}
/*
 * When we Compiling by using Javac - > Convert the code into Byte Code,
 * During this the .class file created(the numb of files depends on how many class in the code)
 * when a code is executed it will loaded into code segement(in the form of Machine Level Language)
 * Afeter that It will load tha main class first then create an stack frame of main() in Stack
 * Then we created an object(new Car()) that will created on Heap the object will have what are the Class ,
 * then it as an address , the address will pointed to main method Car c in main method the address store in c => address
 */