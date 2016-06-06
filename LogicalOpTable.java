class LogicalOpTable {
    public static void main(String args[]) {

        boolean p, q;
        System.out.println("P\tQ\tAND\tOr\tXOR\tNOT");
        p = true; q = true;

        printTableOutput();

        p = true; q = false;
        printTableOutput();

        p = false; q = true;
        printTableOutput();

        p = false; q = false;
        printTableOutput();
    }

    public function printTableOutput() {
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}
