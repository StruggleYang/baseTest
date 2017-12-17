package base.thread;

/**
 * @author StruggleYang
 *
 * 两个线程交替打印1-100
 */
public class ThreadTest {

    public void thread1(int init,int end,String name) throws InterruptedException {
        boolean flag = true;

        synchronized (this) {
            while (flag) {
                for (int i = init; i <= end; i += 2) {
                    System.out.println(name+"-"+ i);
                    if (i == end) {
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

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();

        new Thread(() -> {
            try {
                test.thread1(1,99,"t1");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                test.thread1(2,100,"t2");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
