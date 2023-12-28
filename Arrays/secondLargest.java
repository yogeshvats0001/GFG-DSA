/*Second Largest
 * 
 * Given an array Arr of size N, print second largest distinct element from an array.
 * 
 * N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
 * 
 * N = 3
Arr[] = {10, 5, 10}
Output: 5
 * 
 */

package Arrays;

public class secondLargest {
    public static int solution(int[] arr, int n){
        int maxi = Integer.MIN_VALUE, chotaMaxi = Integer.MIN_VALUE;
        for(int element : arr){
            if(maxi < element){
                chotaMaxi = maxi;
                maxi = element;
            }else if(chotaMaxi < element && element != maxi){
                chotaMaxi = element;
            }
        }

        if(chotaMaxi == Integer.MIN_VALUE) return -1;

        return chotaMaxi;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,35,1,10,34,1};
        int n = arr.length;
        int secondLar = solution(arr, n);
        System.out.println("Second Largest : " + secondLar);
    }
}
