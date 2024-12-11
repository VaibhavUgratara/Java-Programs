//Linear search in array

import java.util.Scanner;

public class search_array {

    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in array: ");
        for(int i=0;i<10;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        System.out.print("\nEnter element to be searched: ");
        int n=sc.nextInt();

        for(int i=0;i<10;i++){
            if(arr[i]==n){
                System.out.println("\nElement found at index: "+i);
                break;
            }
            if(i==9){
                System.out.println("\nElement not found!!");
            }
        }
        sc.close();
    }
}