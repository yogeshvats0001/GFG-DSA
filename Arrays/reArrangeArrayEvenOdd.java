/*Rearrange array such that even positioned are greater than odd
 * 
 * Given an array A of n elements, rearrange the array according to the following relations :
A[i] >= A[i-1], if i is even.
A[i] <= A[i-1], if i is odd.[Considering 1-indexed array]
Return the resultant array.
 * 
 * Input 1:
A[] = {1, 2, 2, 1}
Output:
1 2 1 2
 * 
 * Input 2:
A[] = {1, 3, 2}
Output:
1 3 2
 * 
 * 
*/

package Arrays;

import java.util.ArrayList;

class reArrangeArrayEvenOdd {
    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> aList = new ArrayList<>();

        int n = arr.length;
        if(n == 1){
            aList.add(arr[0]);
            return aList;
        }

        for(int i = 2; i<=n; i++){
            if(i % 2 == 0 && arr[i-1] < arr[i-1-1]){
                int temp = arr[i-1];
                arr[i-1] = arr[i-1-1];
                arr[i-1-1] = temp;
            }else if(i % 2 != 0 && arr[i-1] > arr[i-1-1]){
                int temp = arr[i-1];
                arr[i-1] = arr[i-1-1];
                arr[i-1-1] = temp;
            }
        }

        for(int element : arr){
            aList.add(element);
        }

        return aList;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1};
        System.out.println("Initial Array:");
        for(int element : arr){
            System.out.println(element);
        }

        ArrayList<Integer> aList = solution(arr);
        System.out.println("Final Array:");
        aList.forEach((i) -> System.out.println(i));
    }
}