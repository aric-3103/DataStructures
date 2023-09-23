package DataStructures.MergeSort;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 8, 10, 12, 15};
        int[] arr2 = {3, 5, 7, 11};
        int[] ans = mergeTwoSortedArray(arr1, arr2);
        for (int val : ans) {
            System.out.println(val + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            int[] result = new int[1];
            result[0] = arr[low];
            return result;
        }
        int mid = (low + high) / 2;
        int[] firstSortedHalf = mergeSort(arr, low, high);
        int[] secondSortedHalf = mergeSort(arr, mid + 1, high);
        int[] ans = mergeTwoSortedArray(firstSortedHalf, secondSortedHalf);
        return ans;
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        //check if Arr[i] and Arr[j] goes out of range or not !
        while (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
