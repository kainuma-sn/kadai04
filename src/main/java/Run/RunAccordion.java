package Run;

import Function.FunctionCatalog;

//並行処理を実現するためのクラス
public class RunAccordion implements Runnable {
    @Override
    public void run() {
        FunctionCatalog accordions = new FunctionCatalog();
        try {
            for (int i = 0; i < 5; i++) {
                accordions.addList("Accordion" + i, 10, 10);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

