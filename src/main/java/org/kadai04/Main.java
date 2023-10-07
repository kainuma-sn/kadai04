package org.kadai04;

import Function.FunctionCatalog;
import Interface.InterfaceMyService;

public class Main {
    InterfaceMyService myService;

    public static void main(String[] args) {

        //課題
        //streamを動かしてみる
        //課題箇所：FunctionInstrumentsSoftware.java　92行-111行、　244行-287行
        FunctionCatalog.start();
        //外から呼び出しても使えます
//        FunctionCatalog piano = new FunctionCatalog();
//        piano.addList("ピアノ", 11, 1);
//        piano.printInfo(0);

        //デバッカーは独自に使いました

        ////その他
        //マルチスレッド処理
//        FunctionSleeping.start(); //実装間に合わず

        //例外と例外処理の練習
//        FunctionError.start();


    }
}