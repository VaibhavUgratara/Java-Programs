//Matrix multiplication


import java.util.Scanner;

public class matrix_mul {
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of Matrix 1: ");
        System.out.print("Row: ");
        r1=sc.nextInt();
        System.out.print("Column: ");
        c1=sc.nextInt();
        System.out.println("\nEnter the dimensions of Matrix 2: ");
        System.out.print("Row: ");
        r2=sc.nextInt();
        System.out.print("Column: ");
        c2=sc.nextInt();

        int[][] arr1=new int[r1][c1];
        int[][] arr2=new int[r2][c2];

        if(c1!=r2){
            System.out.println("\nMultiplication of matrices with such dimensions is not possible!!");
        }
        else{

            System.out.println("\nEnter data in Matrix 1: ");
            arr1=fill_matrix(arr1,r1,c1);
            System.out.println("\nEnter data in Matrix 2:");
            arr2=fill_matrix(arr2, r2, c2);



            //Main logic
            //----------------------------------------------------------
            System.out.println("\nMultiplication of Matrix 1 and Matrix 2 is:\n");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    int sum=0;
                    for(int k=0;k<r2;k++){
                        sum+=(arr1[i][k]*arr2[k][j]);
                    }
                    System.out.print(sum+" ");
                }
                System.out.println(" ");
            }
            //----------------------------------------------------------
        }
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
