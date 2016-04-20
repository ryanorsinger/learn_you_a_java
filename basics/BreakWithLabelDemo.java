public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
            { 32, 23, 11, 4},
            { 90, 14, 28, 0},
            { 31, 113, 39, 2}
        };

        int searchFor = 113;

        int i = 0;
        int j = 0;
        boolean foundIt = false;

        search:
            for (i = 0; i < arrayOfInts.length; i++) {
                for(j = 0; j < arrayOfInts[i].length; j++) {
                    if(arrayOfInts[i][j] == searchFor) {
                        foundIt = true;
                        break search;
                    }
                }
            }
            if(foundIt) {
                System.out.println("Found " + searchFor + " at " + i + ", " + j);
            } else {
                System.out.println(searchFor + " not found in the array");
            }
    }
}
