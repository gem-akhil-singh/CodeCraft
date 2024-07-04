package intermediate;


/*
Write a Program to rotate a given array towards right,
for eg: Problem: Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

 */
public class RotateArray {

    static void rotateRight(int[] array, int k){

        int n = array.length;
        k = k%n;

        reverse(array,0,n-1);
        reverse(array,0,k-1);
        reverse(array,k,n-1);


    }

    static void reverse(int[] array,int start,int end){
        while(start <end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k=3;
        rotateRight(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

}
