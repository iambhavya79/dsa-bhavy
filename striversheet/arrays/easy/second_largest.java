    package striversheet.arrays.easy;

    public class second_largest {
        public static void main(String[] args) {
            int arr[] = {2,3,4,5,8,9};
            secondlargest(arr);
        }
        static void secondlargest(int arr[]){
            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            for(int i = 0 ; i<arr.length;i++){
            if(max < arr[i] ){
                smax = max;
                max = arr[i];
                }
            else if(arr[i] > smax && arr[i] != max)  {
                smax = arr[i];
            }
            }   
        System.out.println(max);
        System.out.println(smax);
        }
    }
