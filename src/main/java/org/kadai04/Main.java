package org.kadai04;

import Function.FunctionInstruments;
import Function.FunctionSleeping;
import Function.FunctionError;
import Interface.InterfaceMyService;

public class Main {
    InterfaceMyService myService;

    public static void main(String[] args) {

        //マルチスレッドでInstrumentsを管理する
        FunctionInstruments instruments = new FunctionInstruments();
        instruments.start();

//        //課題
//        //streamを動かしてみる
//        //課題箇所：java/Function/FunctionCatalog.java　91行-110行、　243行-287行
//        FunctionCatalog.start();
//        //外から呼び出しても使えます
//        FunctionCatalog piano = new FunctionCatalog();
//        piano.addList("ピアノ", 11, 1);
//        piano.printInfo(0);
//
//        //デバッカーは独自に使いました
//
//        ////その他
//        //マルチスレッド処理
//        FunctionSleeping.start(); //FunctionCatalogへの実装間に合わず。実行してマルチスレッドの処理を確認することはできます
//
//        //例外と例外処理の練習
//        FunctionError.start();


    }
}
