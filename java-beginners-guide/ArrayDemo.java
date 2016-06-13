class ArrayDemo {
    public static void main(String[] args) {
        // array declaration creates an int array of 10 elements and links it to an array reference called sample.
        int sample[] = new int[10];
        int i;

        for(i = 0; i < sample.length; i = i + 1) {
            sample[i] = i;

            System.out.println("This is sample[" + i + "]: " + sample[i]);
        }

    }
}
