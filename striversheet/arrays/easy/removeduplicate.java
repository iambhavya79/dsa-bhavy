package striversheet.arrays.easy;

public class removeduplicate {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int n = remove(arr);
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int remove(int arr[]){
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);

    }
}
