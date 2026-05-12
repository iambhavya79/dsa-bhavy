package array;

public class max_sub_array01 {
    public static void max_sub_array01 (int arr[]){
        int currsum = 0;
        int maxsum =  Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            int start = i;
            
          for(int j = i ; j < arr.length; j++){
            int end = j;
            currsum = 0;
            for(int k = start; k <= end ; k++){
                currsum = currsum + arr[k];
            }
            System.out.println(currsum);
            if(currsum > maxsum){
                maxsum = currsum;         
               }
          }  
          
        }
        System.out.println("max sum " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        max_sub_array01(arr);
    }
}
    
