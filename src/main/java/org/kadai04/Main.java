package org.kadai04;

import Function.FunctionInstruments;

public class Main {

    public static void main(String[] args) {

        //マルチスレッドでInstrumentsを管理する
        FunctionInstruments instruments = new FunctionInstruments();
        instruments.start();

    }
}
