class Solution {
    public int findMin(int[] arr) {
        int min=arr[0];
        
        for(int i=1; i<arr.length; i++){
             if(arr[i] < min){
              min = arr[i];             }
        }
        return min;
    }
}
