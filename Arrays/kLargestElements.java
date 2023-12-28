/*k largest elements 
 * 
 * Given an array Arr of N positive integers and an integer K, find K largest elements from the array.  
 The output elements should be printed in decreasing order.
 * 
 * Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
 * 
 * Input:
N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
Output: 50 30 23
 * 
*/

package Arrays;

import java.util.PriorityQueue;

public class kLargestElements {

    public static int[] solution(int[] arr, int n, int k){
        if(n < k) return new int[]{};
        
        int[] result = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i = k; i< n; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        for(int i = k-1; i>=0; i--){
            result[i] = pq.poll();
        }

        return result;

    }
    public static void main(String[] args) {
        // int[] arr = new int[]{12, 5, 787, 1, 23};
        // int n = arr.length;
        // int k = 2;

        int[] arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        int n = arr.length;
        int k = 3;
        
        int[] result = solution(arr, n, k);
        System.out.println("Largest" + k + " elements in the given array:");
        for(int element : result){
            System.out.println(element);
        }
    }
}
