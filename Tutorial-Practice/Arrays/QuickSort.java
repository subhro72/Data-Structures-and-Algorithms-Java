public class QuickSort {

    public static void printsortedArr(int arr[]){
        System.out.print("The sorted array is: ");
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
  
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pivotIndex = Partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int Partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot) {
                i++;

              swap(arr, i, j);  
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {6,5,7,3,2,9,8};
        quickSort(arr, 0, arr.length-1);
        printsortedArr(arr);
    }
}
