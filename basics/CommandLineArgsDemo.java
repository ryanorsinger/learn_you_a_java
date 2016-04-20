/**
 * Iterates
 */
public class CommandLineArgsDemo {
    public static void main(String[] args) {
        String message = "";

        if(args.length == 0) {
            System.out.println("You did not provide any command line arguments");
            // System.exit(0);
        }

        for(String item : args) {
            System.out.println(item);
        }
    }
}
