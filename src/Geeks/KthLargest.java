package Geeks;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {12,3,5,7,4,19,26};
        System.out.println(kthLargest(arr, 2));
    }

//    static int kthLargest(int[] arr, int n, int k) {
//        return (arr[n - k]);
//    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                index++;
                swap(arr, index, j);
            }
        }
        swap(arr, index + 1, high);
        return (index + 1);
    }


//    static int partition(int[] arr, int left, int right) {
//        int pivot = arr[left] ;
//        int l = left + 1 ;
//        int r = right;
//        while (l <= r) {
//            if (arr[l] < pivot && arr[r] > pivot) {
//                int temp=arr[l];
//                arr[l]=arr[r];
//                arr[r]=temp;
//                l++ ;
//                r-- ;
//            }
//            if (arr[l] >= pivot) {
//                l++;
//            }
//            if (arr[r] <= pivot) {
//                r--;
//            }
//        }
//        int temp2=arr[left];
//        arr[left]=arr[r];
//        arr[r]=temp2;
//        return r;
//    }
    static int kthLargest(int[] arr, int k) {
        int low = 0, high = arr.length - 1, ans;
        while (true) {
            int index = partition(arr, low, high);
            if (index == k - 1) {
                ans = arr[index];
                break;
            }
            if (index < k - 1)
                low = index + 1;
            else
                high = index - 1;
        }
        return ans;
    }
}
