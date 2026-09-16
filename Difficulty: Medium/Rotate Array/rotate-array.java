class Solution {
    public void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // If d is greater than n
        d = d % n;

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);

        // Reverse the complete array
        reverse(arr, 0, n - 1);
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}