//Creating a square matrix where diagonals are 1 and other elements are 0
/*

e.g. A square matrix of dimensions 5x5:

1 | 0 | 0 | 0 | 1
0 | 1 | 0 | 1 | 0
0 | 0 | 1 | 0 | 0
0 | 1 | 0 | 1 | 0
1 | 0 | 0 | 0 | 1

*/


import java.util.Scanner;

public class sqaure_matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to create a nxn matrix: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                if((i==j)||(i+j==n-1)){
                    arr[i][j]=1;
                }
                else{arr[i][j]=0;}
            }
        }
        System.out.println("\nResultant Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}