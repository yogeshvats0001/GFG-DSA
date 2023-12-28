/*Move all zeroes to end of array
 * 
 * Given an array arr[] of n positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in-place.
 * 
 * Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
 * 
 * N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
 * 
 * 
*/

package Arrays;

public class moveZeroAtEnd {
    public static void solution(int[] arr, int n){
        if(n == 0 || n == 1) return;

        int i = 0;
        for(int j = 0; j<n; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,5,0,0,4,8,9,0,5,4,3,0,7,3,21,2,0};
        int n = arr.length;
        solution(arr, n);
        System.out.println("Array after moving zeros:");
        for(int element : arr){
            System.out.println(element);
        }
    }
}
