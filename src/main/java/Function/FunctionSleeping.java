package Function;

import Run.RunSleeping1;
import Run.RunSleeping2;

//ObjectソースとFunctionソースを実行する
//親クラス定義せずコピペして使えます
public class FunctionSleeping {
    //実行
    public static void start() {
        RunSleeping1 runSleeping1 = new RunSleeping1();
        Thread thread1 = new Thread(runSleeping1);
        RunSleeping2 runSleeping2 = new RunSleeping2();
        Thread thread2 = new Thread(runSleeping2);

        thread1.start();
        thread2.start();
    }

}
