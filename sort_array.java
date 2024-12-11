//Sorting an array

import java.util.Scanner;

public class sort_array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("\nEnter elements in your array:");
        arr=fill_array(arr);


//Main logic
//-----------------------------------------------------------------
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }
        }
//-----------------------------------------------------------------
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }

    public static int[] fill_array(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    }

}