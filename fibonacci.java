//Fibonacci series

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int n1=0,a=1,b=1;
        for(int i=2;i<n;i++){
            n1=a+b;
            a=b;
            b=n1;
        }
        if(n<0){
            System.out.print("Invalid parameter!");
        }
        else{
            if((n==1)||(n==2)){n1=1;}
            System.out.print("In the fibonacci series F"+n+" is: "+n1);
        }
        sc.close();
        System.out.println("");
    }
}
