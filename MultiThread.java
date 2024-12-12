
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Class");
    }
}

class NewThread implements Runnable{
    public void run(){
        System.out.println("Runnable interface");
    }
}

public class MultiThread{
    public static void main(String[] args){
        MyThread m = new MyThread();
        m.start();

        NewThread n = new NewThread();
        Thread thread = new Thread(n);
        thread.start();
    }
}
