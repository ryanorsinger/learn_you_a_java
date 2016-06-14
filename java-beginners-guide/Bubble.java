/*
 * Bubble sort takes n-1 passes to sort where n is the number of elements in the array.
 * It aint efficient, but it's simple to implement.
 */

class Bubble {
    public static void main(String[] args) {
        int nums[] = { 1, 22, -42, 44, 12, 62, 29, 100 };
        int size = nums.length;
        int a, b, t;

        // show the original array
        System.out.print("The original array is ");
        for(int i = 0; i < size; i += 1)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Bubble sort algorithm
        for(a = 1; a < size; a ++) {
            for(b = size -1; b >= a; b--) {
                if(nums[b-1] > nums[b]) {

                    // exchange elements
                    t = nums[b - 1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted array is ");
        for(int i = 0; i < size; i += 1)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
