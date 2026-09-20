class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {

        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int nextGre[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGre[i] = -1;
            } else {
                nextGre[i] = arr[s.peek()];
            }

            s.push(i);
        }

        // Convert array to ArrayList
        for (int i = 0; i < nextGre.length; i++) {
            ans.add(nextGre[i]);
        }

        return ans;
    }
}