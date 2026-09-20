package striversheet.arrays.easy;

public class largest_elemnet {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        System.out.println(large(arr));
    }
    static int large(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(max < arr[i]){ 
                max = arr[i];
                
            }
        }
        return max;
    }
}
