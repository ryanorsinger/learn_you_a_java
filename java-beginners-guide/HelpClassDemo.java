/*
 *
 */

class Help {
    void helpOn(int choice) {
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
            break;
        case '3':
        case '4':
        case '5':
        case '6':
        case '7': 
        	System.out.println("section under construction");
    	}
    }

    void showMenu() {
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue"); 
        System.out.println("\n");
        System.out.println("Choose one: or q to quit");
    }
    
    boolean isValid(int ch) {
    	if(ch < '1' | ch > '7'  &  ch != 'q') return false;
    	else return true;
    }
}

class HelpClassDemo {
	public static void main(String[] args) 
    	throws java.io.IOException {
		
		char choice, ignore;
		Help hlpobj = new Help();
		
		for(;;) {
			do {
				hlpobj.showMenu();
				choice = (char) System.in.read();
				do {
					ignore = (char) System.in.read();
				} while(ignore != '\n');
				
			} while(!hlpobj.isValid(choice));
				
			if(choice == 'q') break;
			System.out.println("\n");
			
			hlpobj.helpOn(choice);
		}
	}
}
