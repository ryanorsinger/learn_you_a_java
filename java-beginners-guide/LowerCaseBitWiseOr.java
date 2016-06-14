class LowerCaseBitWiseOr {
    public static void main(String[] args) {
        char ch;

        for(int i = 0; i < 26; i+=1) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // This statement turns ON the 6th bit, effectively adding 32 to the ascii integer
            ch = (char) ((int) ch | 32); // ch is now lowercase.

            System.out.print(ch + " ");
        }
    }
}

