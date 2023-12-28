/*Largest Element in Array
 * 
 * Given an array A[] of size n. The task is to find the largest element in it.
 * 
 * n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
 * 
 * Input:
n = 7
A[] = {1, 2, 0, 3, 2, 4, 5}
Output:
5
 */

package Arrays;

public class largestElement {
    public static int solution(int[] arr, int n){
        if(n==0) return -1;

        int maxi = Integer.MIN_VALUE;
        for(int element : arr){
            if(maxi < element){
                maxi = element;
            }
        }
        
        if(maxi == Integer.MIN_VALUE) return -1;

        return maxi;
    }
    public static void main(String[] args) {
        // int[] arr = new int[]{1,8,7,56,90};
        int[] arr = new int[]{1, 2, 0, 3, 2, 4, 5};
        int n = arr.length;
        int maxi = solution(arr ,n);
        System.out.println("Largest element : " + maxi);
    }
}
