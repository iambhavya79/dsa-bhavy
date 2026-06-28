package array;

public class kadanesmaxarray {
    public static void maxarraySum(int number[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i = 1; i<number.length;i++){
            prefix[i]= prefix[i-1] + number[i] ;
        }
        for(int i = 0 ; i < number.length; i++){
            int start = i;
             for(int j = i; j<number.length;j++){
                int end = j;

                currsum = start == 0 ? prefix[end]: prefix[end]  -  prefix[start - 1];
                
                 if(maxsum < currsum){
                 maxsum = currsum;
                 } 
             } 
        }    
        System.out.println("max sum is : " + maxsum);     
    }    

    public static void kadane(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
          for(int i = 0 ; i<number.length;i++){
            cs = cs + number[i];
            if(cs<0){
                cs = 0;
            }
            if(cs < 0 )
            ms = Math.max(ms,cs);
          } 
    }

    public static void main(String[] args) {
        int number[] = {2,3,-4,5};
        maxarraySum(number);
    }

}    
