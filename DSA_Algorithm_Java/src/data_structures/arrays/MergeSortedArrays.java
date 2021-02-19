package data_structures.arrays;

public class MergeSortedArrays {

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        if(arr1.length == 0) return arr2;
        if(arr2.length == 0) return arr1;
        int[] mergeSortedArray = new int[arr1.length+arr2.length];
        int i = 0, j=0,k=0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] < arr2[j]) {
                mergeSortedArray[k++] = arr1[i++];
            } else {
                mergeSortedArray[k++] = arr2[j++];
            }
        }
        // Store remaining elements of first array
        while (i < arr1.length)
            mergeSortedArray[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < arr2.length)
            mergeSortedArray[k++] = arr2[j++];

        return mergeSortedArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 3, 4, 31};
        int[] arr2 = {3, 4, 6, 30};
        int[] result = mergeArray(arr1, arr2);

        System.out.println("Array after merging");
        for (int i=0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
