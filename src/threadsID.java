public class threadsID extends Thread{

    @Override
    public void run(){
        System.out.println("ID: "+ threadsID.currentThread().getId());
    }

    public static void main(String[] args) {
        threadsID t1 = new threadsID();
        threadsID t2 = new threadsID();

        t1.start();
        t2.start();
    }
}
