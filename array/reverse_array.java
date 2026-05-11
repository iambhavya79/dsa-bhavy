package array;

public class reverse_array {
    public static void reverse_array(int number []){
      int start = 0; int end  = number.length - 1 ;
      
      while(end>start){
        //swap code
        int temp = number[end];
        number[end] = number[start];
        number[start] = temp;

        start++;
        end--;
      }
    }
    public static void main(String[] args) {
        int number [] = {2,3,4,5,6,7};

        reverse_array(number);
        for(int i = 0 ; i < number.length; i++){
            System.out.print(number[i]+ " ");
        }
    }
    
}
