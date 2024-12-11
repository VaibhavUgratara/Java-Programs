//Sum of all the digits of a number


import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("\nThe sum of digits of "+n+" is: ");
        int s=0;
        while (n!=0) {
            s+=n%10;
            n=n/10;
        }
        System.out.print(s);
        sc.close();
    }
}
