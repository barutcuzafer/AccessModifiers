package AccessModifiers;

public class FinalVariables {

    public final int ROADSTER_MAX_RANGE=600;
    public final int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;
    public FinalVariables() {
        MODEL_3_MAXSPEED=200;
        //ADMIN_USERNAME="OZZY";

    }
    {
        MODEL_X_PASSENGERS=7;
    }
    static {
        ADMIN_USERNAME="OZZY";
    }

    public static void main(String[] args) {
        //FinalVariables f=new FinalVariables();
        final int MAX_PASSENGERS_COUNT=5;
        final int SSN;//does not give error
        SSN=66;
        FinalVariables finalVars=new FinalVariables();
        System.out.println(finalVars.MODEL_X_PASSENGERS);
        System.out.println(finalVars.MODEL_3_MAXSPEED);
        System.out.println(FinalVariables.ADMIN_USERNAME);
        System.out.println(ADMIN_USERNAME);

    }
}
