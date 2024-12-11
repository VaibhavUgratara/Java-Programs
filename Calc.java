import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.print("Num1: ");
        float n1=sc.nextFloat();
        System.out.print("Num2: ");
        float n2=sc.nextFloat();

        System.out.println("Enter operation you want to perform: ");
        System.out.println("1. +\n2. -\n3. *\n4. /\n5. %");
        int op;
        while (true) {
            System.out.print("Your Choice (1-5): ");
            op=sc.nextInt();
            if((op<1)||(op>5)){
                System.out.println("Invalid Choice");
                continue;
            }
            break;
        }
        switch (op) {
            case 1:
                System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;

            case 2:
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            case 3:
                System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            case 4:
                System.out.println(n1+" / "+n2+" = "+(n1/n2));
                break;
            default:
                System.out.println(n1+" % "+n2+" = "+(n1%n2));
                break;
        }
        sc.close();
    }
}
