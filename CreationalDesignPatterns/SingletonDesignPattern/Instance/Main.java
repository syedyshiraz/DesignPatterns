package CreationalDesignPatterns.SingletonDesignPattern.Instance;

class ThreadThree extends Thread{
    public void run()
    {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Singleton singleton = Singleton.getInstance("thread 3");
        System.out.println(singleton.value);
    }
}
class ThreadFour extends Thread{
    public void run()
    {
        Singleton singleton = Singleton.getInstance("thread 4");
        System.out.println(singleton.value);
    }
}

public class Main {
    static class t1 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Singleton singleton = Singleton.getInstance("thread 1");
            System.out.println(singleton.value);
        }

    }

    static class t2 implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Singleton singleton = Singleton.getInstance("thread 2");
            System.out.println(singleton.value);
        }

    }
    public static void main(String[] args) {

        t1 threadOne = new t1();
        t2 threadTwo = new t2();

        Thread tOne = new Thread(threadOne);
        Thread tTwo = new Thread(threadTwo);

        ThreadThree tThree = new ThreadThree();
        ThreadFour tFour = new ThreadFour();

        tFour.setPriority(Thread.MAX_PRIORITY);

        tOne.start();
        tTwo.start();
        tThree.run();
        tFour.run();


    }
}
