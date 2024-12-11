
//Substring of a string


import java.util.Scanner;

public class get_substring{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Substrings: ");
        int c=1;
        //Main Logic
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(c+". "+s.substring(i,j));
                c++;
            }
        }
        sc.close();
    }
}