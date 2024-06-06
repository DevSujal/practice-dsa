import java.util.Arrays;
public class mergeSort {

    public static long divide(int arr[], int first, int last){
        if(first >= last ){
            return 0;
        }
        int mid = ((last - first) >> 1) + first;

        long count = divide(arr, first, mid) + divide(arr, mid+1, last) + merge(arr, first, last, mid);
        return count;
    }

    public static long merge(int arr[], int first, int last, int mid){
        int newArr[] = new int[last - first + 1];
        int x1 = first;
        int x2 = mid+1;
        int x = 0;
        long count = 0;

        while(x1 <= mid && x2 <= last){
            if(arr[x1] <= arr[x2]){
                newArr[x++] = arr[x1++];
            }else{
                newArr[x++] = arr[x2++];

                count += mid - x1 + 1;

            }
        }
        while (x1 <= mid) {
            newArr[x++] = arr[x1++];
        }
        while (x2 <= last) {
            newArr[x++] = arr[x2++];
        }

        for (int i : newArr) {
            arr[first++] = i;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        
        System.out.println(divide(arr, 0, arr.length-1));

        System.out.println(Arrays.toString(arr));
    }
}