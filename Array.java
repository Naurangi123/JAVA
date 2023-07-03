public class Array {

    public static void main(String[] args) {
        
        int arr[] = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 1, 0 };
        int size = arr.length;
        int low = 0;
        int mid = 0;
       
        int high = size - 1;

        while (mid <= high && mid>=low) {
            if (arr[mid] == 0) {
                low--;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                high--;
            }

        }
         System.out.println(arr);
    }
    
}
