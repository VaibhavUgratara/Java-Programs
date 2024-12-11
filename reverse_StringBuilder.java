// Reversing a string using reverse() method
import java.util.Scanner;

public class reverse_StringBuilder{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        System.out.printf("Reverse of %s is: ",s);



//Using reverse() method
        s.reverse();

        System.out.println(s);

        sc.close();

    }


}