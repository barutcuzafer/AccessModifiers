package AccessModifiers;

public class MethodHidingTest {
    public static void main(String[] args) {

    }

}

class Bear{
    public static void eat(){
        System.out.println("Bear is eating");
    }
    public static void sneeze(){
        System.out.println("SNEEZİNG");
    }
    public void hibernate(){
        System.out.println("hibernating");
    }
}
class Panda extends Bear{
    //hiding
    public static void eat(){
        System.out.println("Panda is eating");
    }

  //  public void sneeze(){
    //    System.out.println("Panda is sneezing");
    //}

     @Override
    public void hibernate(){
        System.out.println("hiberating");
    }



}
