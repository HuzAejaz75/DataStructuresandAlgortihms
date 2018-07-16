import java.util.Arrays;

/**
 * Created by huzaifa.aejaz on 7/13/18.
 */
public class QuickSort {
    public void quickMain(int[] array){
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private void sort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int pivot = array[(left+right)/2];
        int index = partition(array,left,right, pivot);
        sort(array, left,index-1);
        sort(array,index, right);
    }
    private int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left]< pivot){
                left++;
            }
            while(array[right]> pivot){
                right--;
            }
            if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] arr, int l, int r)
    {
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
