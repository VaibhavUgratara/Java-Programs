//Method Overloading

public class method_overloading {

    public static void main(String[] args) {
        int n1=1,n2=2,n3=3;
        float f1=5.5f,f2=3.8f;
        System.out.println("\nSum of n1 and n2: "+sum(n1,n2));
        System.out.println("\nSum of n1, n2 and n3: "+sum(n1,n2,n3));
        System.out.println("\nSum of f1 and f2: "+sum(f1,f2));
    }

    static int sum(int a,int b){return a+b;}
    static int sum(int a,int b, int c){return a+b+c;}
    static float sum(float a,float b){return a+b;}
    
}