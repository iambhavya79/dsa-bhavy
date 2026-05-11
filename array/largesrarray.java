package array;

public class largesrarray {
    public static int largestarray(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
            
        }
        return largest ;

    }
public static void main(String[] args) {
    int number[] = {5,7,4,9,3,10,8};
    System.out.println(largestarray(number));
}}

