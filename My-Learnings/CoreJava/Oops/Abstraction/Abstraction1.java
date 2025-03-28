abstract class Bird{
    abstract void  eat();
    abstract void fly();
}
abstract class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle Fly at Greatest Height");
    }
class SerpentEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Serpent Eagle Hunt and Eat Snake");
    }
}
class GoldenEagle extends Eagle{
    @Override
    public void eat(){
        System.out.println("Golden Eagle Hunt Fishes");
    }
}
}
public class Abstraction1 {
    
}
