import java.util.Scanner;
public class Div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        while (true) {
            System.out.print("\nEnter Marks (out of 100): ");
            marks=sc.nextInt();
            if((marks>100) || (marks<0)){
                System.out.println("Invalid Entry!");
            continue;
            }
            break;
        }
        String divison;
        if(marks>=80){divison="Hons.";}
        else if(marks>=60){divison="First";}
        else if(marks>=50){divison="Second";}
        else if(marks>=40){divison="Third";}
        else{divison="Fail";}
        System.out.println("\nDivision: "+divison);
        sc.close();
    }
}
