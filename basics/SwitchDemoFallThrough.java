/** Class Description of MyClass
 * This switch demonstrates the dangers of falling through by not using breaks.
 * The takeaway is to use breaks!
 */

public class SwitchDemoFallThrough {
    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();

        int month = 8;

        switch(month) {
            case 1: futureMonths.add("jan");
            case 2: futureMonths.add("feb");
            case 3: futureMonths.add("mar");
            case 4: futureMonths.add("apr");
            case 5: futureMonths.add("may");
            case 6: futureMonths.add("jun");
            case 7: futureMonths.add("jul");
            case 8: futureMonths.add("aug");
            case 9: futureMonths.add("sept");
            case 10: futureMonths.add("oct");
            case 11: futureMonths.add("nov");
            case 12: futureMonths.add("dec");
                     break;
            default: break;
        }

        if(futureMonths.isEmpty()) {
            System.out.println("invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }

    }
}
