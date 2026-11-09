class Solution {
    public int largest(int[] arr) {

        int max = -1;
        int second = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
            else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }

        return second;
    }
}
