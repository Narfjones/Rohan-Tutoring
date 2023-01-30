public class AndChecker implements Checker{
    
    Checker obj1;
    Checker obj2;

    public AndChecker(Checker check1,Checker check2){
        obj1 = check1;
        obj2 = check2;
    }

    public boolean accept(String acc){

        String wholeString = acc;

        boolean res1 = wholeString.contains(obj1); // Need to input string as param, not Checker object
        boolean res2 = wholeString.contains(obj2); // Need to input string as param, not Checker object

        if( res1 && res2 ){
            return true;
        } else {
            return false;
        }

    }
}
