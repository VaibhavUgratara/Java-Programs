import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int f=1;
        for (int i = 2; i <=n; i++) {
            f*=i;
        }
        if(n<0){
            System.out.println("Undefined");
        }else{
            System.out.println("Factorial of "+n+" is "+f);
        }
        sc.close();
    }
    
}