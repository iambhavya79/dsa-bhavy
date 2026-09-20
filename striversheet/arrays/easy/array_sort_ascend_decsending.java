package striversheet.arrays.easy;

public class array_sort_ascend_decsending {
     public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        System.out.println(sort(arr));
    }
    static boolean sort(int arr[]){
        boolean asscending = true;
        boolean decsending = true;

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                asscending = true;
            }
            if(arr[i] > arr[i+1]){
                decsending = true;
            }
        }
    return asscending || decsending ;
    }
}
