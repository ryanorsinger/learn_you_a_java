class Queue {
    int putloc, getloc;
    char q[];

    Queue(int size) {
        q = new char[size]; // allocate memory for queu
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QueueDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i = 0;

        System.out.println("Using bigQ to store the alphabet");
        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from the bigQ
        System.out.println("Contents of bigQ: ");
        for(i = 0; i<26; i+=1) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

        // Now, use smallQ to generate some errors
        System.out.println("Using smallQ to generate errors.");
        for(i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // More errors on smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i<5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }

    }
}
