package AccessModifiers;

public class TestParentChild {
    public static void main(String[] args) {
        child s=new child();
        System.out.println("value of x before increment "+s.x);
        s.increment();
        System.out.println("value of x after increment "+ s.x);


        Parent p=new Parent();
        System.out.println("Value of x before increment "+p.x);
        p.increment();
        System.out.println("Value of x after increment "+p.x);
        p.increment();
    }
}
