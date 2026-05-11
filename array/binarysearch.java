package array;

public class binarysearch {
    public static int binarysearch (int number[],int key){
        int start = 0 ; int end  = number.length - 1 ;
        while(end>=start){
            int mid = (start + end ) / 2 ;
                if (number[mid]== key) {
                    return mid ; 
                }
                if(number[mid] < key){
                    start = mid + 1;

                }
                else{
                    end = mid - 1;

                }

            }
            return -1;
        }
    
    
    public static void main(String[] args) {
        int number[] = {3,4,5,6,7,8,9};
        int key = 8;
        int index = binarysearch(number,key);
        System.out.println(index);
    }

    }

