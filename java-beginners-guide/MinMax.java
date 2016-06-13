class MinMax {
    public static void main(String[] args) {
        int min, max;
        // This is one way to declare and initialize array values by hand
        // int nums[] = new int[5];
        // nums[0] = 99;
        // nums[1] = -44;
        // nums[2] = 3;
        // nums[3] = 41;
        // nums[4] = 1010;

        // more common array initialization
        int nums[] = { 10, 9, 11, 4, 42, 1431234, -112 };

        min = max = nums[0];

        for(int i = 1; i < nums.length; i+=1) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];

        }

    System.out.println("Max is " + max + " and the min is " + min + ".");

    }
}
