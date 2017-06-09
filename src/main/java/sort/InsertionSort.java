package sort;

/*
将为参与排序的元素插入到已经排序好的数组中，将第j个元素插入0~j-1的有序数组中，A[j]与A[j-1]-->A[0]依次比较，插入
正确的位置，其他元素后移
 */
public class InsertionSort {
    public static void doSort(int[] arr) {
        for (int j=1; j<arr.length; j++) {
            int key = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 6, 1, 3};
        doSort(arr);
        for(int in : arr) {
            System.out.print(in + " ");
        }
    }
}
