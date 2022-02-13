package AccessModifiers;

public class Kangroo extends marsupial {

    @Override
    public boolean isBiped() {
        return true;
    }


    public void getKangrooDescription() {
        System.out.println("Kangroo hops on two legs: "+isBiped());
    }
}

