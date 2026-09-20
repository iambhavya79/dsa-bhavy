package striversheet.arrays.easy;

public class array_sorted {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(sort(arr));
    }
    static boolean sort(int arr[]){
        int cout = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[(i+1) % arr.length]){
                cout++;
            }
            if(cout>1){
                return false;
            }
        }
    
    return true;
}
}
