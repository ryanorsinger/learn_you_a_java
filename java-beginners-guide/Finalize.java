class FinalizeDemo {
    int x;

    // constructor
    FinalizeDemo(int i) {
        x = i;
    }

    // called when object is recycled
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    void generator(int i) {
        FinalizeDemo o = new FinalizeDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {
        int count;

        FinalizeDemo ob = new FinalizeDemo(0);

        /* Now, generate a very large number of objects. At some point, garbage collection occurs.
         * Note, you may need to increase the number of objects generated to see finalize() in action.
         */

        for(count = 1; count < 500000; count += 1) {
            ob.generator(count);
        }
    }
}
