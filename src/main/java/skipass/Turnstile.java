package skipass;

public class Turnstile {

    public Turnstile(){

    }

    public boolean pass_skipass(Skipass skipass){
        if (skipass.isBlocked()){
            System.out.println("Skipass is blocked");
            return false;
        }else if(!skipass.isValid()){
            System.out.println("Skipass is not valid");
            return false;
        }
        System.out.println("Success");
        skipass.riding();
        return true;
    }

}
