package base.thread.alternate;

import java.util.concurrent.TimeUnit;

public class SumThread {

    public void one() throws InterruptedException{
        synchronized (this) {
            boolean flag = true;

            while (flag) {

                for(int i = 1; i <= 99;i += 2){
                    System.out.println("t1-"+i);

                    if(i==99){
                        flag = false;
                        this.notify();
                        break;
                    }
                    this.notify();
                    this.wait();
                }
            }
        }
    }

    public void two() throws InterruptedException{
        synchronized (this) {
            boolean flag = true;

            while (flag) {

                for(int i = 2; i <= 100;i += 2){
                    System.out.println("t2-"+i);

                    if(i==100){
                        flag = false;
                        this.notify();
                        break;
                    }
                    this.notify();
                    this.wait();
                }
            }
        }
    }



    public static void main(String[] args) throws Exception {
        SumThread sumThread = new SumThread();

        new Thread(()->{
            try {
                sumThread.one();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            try {
                sumThread.two();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
