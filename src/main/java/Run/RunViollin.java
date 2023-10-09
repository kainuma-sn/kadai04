package Run;

import Function.FunctionCatalog;

//並行処理を実現するためのクラス
public class RunViollin implements Runnable {
    @Override
    public void run() {
        FunctionCatalog viollins = new FunctionCatalog();
        try {
            for (int i = 0; i < 5; i++) {
                viollins.addList("Viollin" + i, 10, 10);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


