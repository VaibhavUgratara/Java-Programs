//Matrix addition

import java.util.Scanner;

public class matrix_add {

    public static void main(String[] args) {
     
        int r,c;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter dimensions of Matrices:");
        System.out.print("Row: ");
        r=sc.nextInt();
        System.out.print("Column: ");
        c=sc.nextInt();

        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];

        System.out.println("\nEnter data in Matrix 1:");
        arr1=fill_matrix(arr1, r, c);
        System.out.println("\nEnter data in Matrix 2:");
        arr2=fill_matrix(arr2, r, c);



        System.out.println("\nThe addition of Matrix 1 and Matrix 2:");

       //main logic
       //------------------------------------------------------------
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            }
            System.out.println(" ");
        }
        //-----------------------------------------------------------
        sc.close();
        
    }
    static int[][] fill_matrix(int[][] arr,int r,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter element at row "+(i+1)+" and column "+(j+1)+": ");
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
}