package sort;


public class QuickSort {

    public static void quickSort(int[] a, int left, int right) {
        if(left >= right) {
            return;
        }
        int index = partition(a, left, right);
        quickSort(a, left, index-1);
        quickSort(a, index+1, right);

    }

    public static int partition(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int key = a[left];
        while(i < j) {
            while(a[j] >= key && j > i) {
                j--;
            }
            if(i < j) {
                a[i] = a[j];
                i++;
            }
            while(a[i] < key && j > i) {
                i++;
            }
            if(i < j) {
                a[j] = a[i];
                j--;
            }

        }
        a[i] = key;
        return i;
    }

    public static void main(String[] args) {
        int []a = new int[]{1, 5, 3, 6, 2, 11, 7};
        quickSort(a, 0, a.length-1);
        for(int in : a) {
            System.out.println(in);
        }
    }

}
