//Calculate percentage

import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of each Subject: ");
        System.out.print("Subject 1: ");
        int n1=sc.nextInt();
        System.out.print("Subject 2: ");
        int n2=sc.nextInt();
        System.out.print("Subject 3: ");
        int n3=sc.nextInt();
        System.out.print("Subject 4: ");
        int n4=sc.nextInt();
        System.out.print("Subject 5: ");
        int n5=sc.nextInt();
        float p=((n1+n2+n3+n4+n5)/5.0f);
        System.out.println("Percentage is: "+p+"%");
        sc.close();
    }
}
