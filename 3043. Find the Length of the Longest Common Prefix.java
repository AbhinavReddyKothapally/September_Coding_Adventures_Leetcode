class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num: arr1) {
            while (num > 0) {
                set.add(num);
                num = num / 10;
            }
        }
        int result = 0;
        for (int num: arr2) {
            while (num > 0) {
                if (set.contains(num)) {
                    result = Math.max(result, String.valueOf(num).length());
                    break;
                }
                num = num / 10;
            }
        }
        return result;
    }
}
