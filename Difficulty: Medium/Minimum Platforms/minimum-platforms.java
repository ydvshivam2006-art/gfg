import java.util.Arrays;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1;
        int maxPlatforms = 1;
        int i = 1;
        int j = 0;
        int n = arr.length;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            if (platforms > maxPlatforms) {
                maxPlatforms = platforms;
            }
        }

        return maxPlatforms;
    }
}