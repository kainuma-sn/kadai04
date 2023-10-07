package Run;

public class RunSleeping2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread2: " + i);
            try {
                Thread.sleep(1200); // 1.2秒間スリープ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
