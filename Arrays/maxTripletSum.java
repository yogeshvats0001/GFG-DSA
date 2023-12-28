/*Maximum triplet sum in array
 * 
 * Given an array, the task is to find the maximum triplet sum in the array.
 * 
 * Input : arr[ ] = {4, 2, 7, 9}
Output : 20
Explanation:
Here are total 4 combination: 
(0, 1, 2),(0, 1, 3),(0, 2, 3),(1, 2, 3).
So, the Sum of these combinations is 
13,15, 20,and 18.The maximum sum is 20.
 * 
 * Input : arr[ ] = {1, 0, 8, 6, 4, 2} 
Output : 18 

 * 
 */


package Arrays;

import java.util.PriorityQueue;

class maxTripletSum {

    public static int solution(int[] arr, int n){
        if(n < 3) return -1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < 3; i++){
            pq.add(arr[i]);
        }

        for(int i=3; i<n; i++){
            if(pq.peek() < arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += pq.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
        // int[] arr = new int[]{4,2,7,9};
        int[] arr = new int[]{1, 0, 8, 6, 4, 2} ;
        int n = arr.length;
        System.out.println("Triplet Sum: " + solution(arr, n));
    }
}