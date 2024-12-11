//Reversing a string in Java

import java.util.Scanner;

public class string_reversal{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String s2 = "";

        //Main logic
        //---------------------------------------------------
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        //---------------------------------------------------

        System.out.printf("Reverse of %s is %s.\n",s,s2);
        sc.close();

    }
}