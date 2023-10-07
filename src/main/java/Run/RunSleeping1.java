package Run;

public class RunSleeping1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread1: " + i);
            try {
                Thread.sleep(500); // 0.5秒間スリープ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}