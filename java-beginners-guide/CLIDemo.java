class CLIDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " number of arguments sent from the command line");
        System.out.println("They are: ");
        for(String x : args) {
            System.out.println(x);
        }
    }
}
