package array;

public class pair_in_array {
    public static void kadane(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < number.length; i++){
          max = Math.max(max , number[i]);

          cs = cs + number[i];
          if(cs<0){
            cs = 0;
          }
          ms = Math.max(ms , cs);
        }
          if(max<0){
            System.out.println(max);
          }
          else{System.out.println(ms);}
        }
        
    
 
public static void main(String[] args) {
    int number[] = {-2,3,1,-2,-3};
    kadane(number);
    
}}