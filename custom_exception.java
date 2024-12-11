//This program shows how to create custom exception and also handle any exception

import java.util.Scanner;


class MyException extends Exception{

    public MyException(String str){
        super(str);
    }

}

public class custom_exception{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        try{
            checkAge(age);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Jao yaar program khatam");
        }
        sc.close();

    }

    public static void checkAge(int age) throws MyException {
        if(age<18){
            throw new MyException("Aap Raja aadmi nahi ban sakte");
        }
        System.out.println("Raja aadmi ki yahi pehchaan hai ki wo 18+ hai");
    }
}
