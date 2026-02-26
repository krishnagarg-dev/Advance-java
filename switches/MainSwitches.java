package switches;

public class MainSwitches {
    public static void main(String[] args) {
        
        int day = 1;
        String result = switch(day) {
            case 1,7 -> {
            System.out.println("this is 1,7 case");
            yield "Monday";
            }
            //yield is used to return a value from a block of code in a switch expression. 
            // it allows you to specify the value that should be returned when a particular case is matched, even if that case contains multiple statements or complex logic.
            case 2,4,5 -> "Tuesday";
            // we can add multiple cases together, like multiple case 1 2 3 -> "Weekday";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}