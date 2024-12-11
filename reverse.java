//Reverse a number


import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int n=sc.nextInt();
        int t=n;
        int rev=0;
        while(t!=0){
            rev=(rev*10)+t%10;
            t=t/10;
        }
        System.out.println("\nReverse of "+n+" is "+rev);
        sc.close();
    }
    
}