class Main {

    public static void sortTwoColors(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == 0) {
                i++;
            } else { // nums[i] == 1
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 0, 0, 1, 1};
        sortTwoColors(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

