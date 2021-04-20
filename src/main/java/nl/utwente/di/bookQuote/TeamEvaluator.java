package nl.utwente.di.bookQuote;

public class TeamEvaluator {

    public TeamEvaluator(){

    }

    public String getTruthAboutATeam(String team){
        String result = "";
        team = (team == null) ? "" : team;

        switch (team){
            case "Arsenal":
                result = "The best but wel tantoeslecht";
                break;
            case "Ajax":
                result = "ez landskampioen in nederland niet close";
                break;
            case "Barcelona":
                result = "Messi";
                break;
            case "Real Madrid":
                result = "moker rich";
                break;
            case "Santos":
                result = "Neymar 'acteurtje' Junior";
                break;
            case "Tottenham":
                result = "Shite";
                break;
            default:
                result = "not in the system";
        }

        return result;
    }
}
