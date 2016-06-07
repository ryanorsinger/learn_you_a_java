/*
 * Use nested loops to find the factors of numbers between 1 and 100
 */
public class FindFactorial {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j <= 100; j++) {
                if((i % j) == 0) System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}
