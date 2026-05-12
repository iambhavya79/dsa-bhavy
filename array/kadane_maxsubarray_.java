package array;

public class kadane_maxsubarray_ {

    public static void kadane(int arr[]) {

        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            largest = Math.max(largest, arr[i]);

            cs = cs + arr[i];

            if (cs < 0) {
                cs = 0;
            }

            ms = Math.max(ms, cs);
        }

        // print only once
        if (ms == 0) {
            System.out.println(largest);
        } else {
            System.out.println(ms);
        }
    }

    public static void main(String[] args) {

        int arr[] = {-3, -4, -5, -6, -7};

        kadane(arr);
    }
}