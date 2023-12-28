/*Third largest element
 * 
 * Given an array of distinct elements. Find the third largest element in it.
Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
 * 
 * Input:
N = 5
A[] = {2,4,1,3,5}
Output: 3
 * 
 * Input:
N = 2
A[] = {10,2}
Output: -1
 */

package Arrays;

import java.util.PriorityQueue;

public class thirdLargestElement {
    public static int solution(int[] arr, int n){
        if(n < 3) return -1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < 3; i++){
            pq.add(arr[i]);
        }

        for(int i = 3; i < n ; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        // int[] arr = new int[]{2,4,1,3,5};
        int[] arr = new int[]{10,2};
        int n = arr.length;
        int thirdLar = solution(arr, n);
        System.out.println("Third Largest : " + thirdLar);
    }
}
