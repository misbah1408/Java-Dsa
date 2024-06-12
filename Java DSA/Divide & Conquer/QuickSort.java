public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pTdx = partition(arr, si, ei);
        // left 
        quickSort(arr, si, pTdx-1);
        // right
        quickSort(arr, pTdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot ){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        quickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
