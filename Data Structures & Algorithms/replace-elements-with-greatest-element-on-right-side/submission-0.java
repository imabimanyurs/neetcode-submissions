class Solution {
    public int[] replaceElements(int[] arr) {
    int maxRight =-1;
    int maxSoFar = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
        int original = arr[i];
        arr[i] = maxRight;
        maxRight = Math.max(original,maxRight);
}
        return arr;
    }
}