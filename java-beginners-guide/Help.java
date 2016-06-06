/*
 * A Java Help System built as part of "Java: A Beginner's Guide"
 */
class Help {
    public static void main(String args[])
        throws java.io.IOException {
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("Choose one: ");
        char choice;
        choice = (char) System.in.read();

        switch(choice) {
            case '1':
                System.out.println("The if: \n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant1:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    case constant2");
                System.out.println("        statement sequence");
                System.out.println("    // etc...");
                System.out.println("}");
        }

        System.out.println("Press S to stop");

        for(int i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println("Pass #" + i);
        }
    }
}
