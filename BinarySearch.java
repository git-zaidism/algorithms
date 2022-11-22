public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 12, 67, 89};
        int target = 2;
        int index = binarSearch(arr,target);
        System.out.println(target+" Present at index "+index);
    }

    static int binarSearch(int arr[], int target) {
       int start = 0;
       int end = arr.length - 1;
       
       while (start <= end) {
         int mid = (start + end) / 2;
         
         if (target == arr[mid]) 
             return mid;
           
         else if (target > arr [mid])
            start = mid + 1;
           
         else 
           end = mid - 1;
           
       }
        
       return -1;
    }
}
