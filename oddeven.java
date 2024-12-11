//Find number is odd or even

import java.util.Scanner;

public class oddeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,odd=0,even=0;
        System.out.println("Enter 5 Numbers: ");
        for(int i=0;i<5;i++){
            System.out.print("Number "+(i+1)+": ");
            n=sc.nextInt();
            if(n%2!=0){
                odd++;
            }
            else{even++;}
        }
        System.out.println("Total odd: "+odd+"\nTotal even: "+even);
        sc.close();

    }
}