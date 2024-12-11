//Grade using Switch


import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        String grade;
        int x=marks/10;
        switch (x) {
            case 10:
                grade="O";
                break;
            case 9:
                grade="A+";
                break;
            case 8:
                grade="A";
                break;
            case 7:
                grade="B+";
                break;
            case 6:
                grade="B";
                break;
            case 5:
                grade="C+";
                break;
            case 4:
                grade="C";
                break;
            default:
                grade="F";
                break;
        }
        System.out.println("Grade: "+grade);
        sc.close();
    }
    
}