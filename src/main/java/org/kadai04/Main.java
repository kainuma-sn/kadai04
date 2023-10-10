package org.kadai04;

import Function.FunctionCatalog;

public class Main {

    public static void main(String[] args) {

        //derumインスタンスを保管して管理するdrumクラスを生成
        FunctionCatalog drums = new FunctionCatalog();
        //guitarインスタンスを保管して管理するguitarクラスを生成
        FunctionCatalog guitars = new FunctionCatalog();

        //addListメソッドを使いcatalogListに新たなドラムソフトウェアのインスタンスを追加する
        drums.addList("SUPERIOR DRUMMER 3", 49500, 50);
        drums.addList("BFD 3", 35799, 37);
        drums.addList("MODO DRUM 1.5", 30990, 25);
        drums.addList("", 0, 0);
        drums.addList(null, 1, 1);
        drums.addList("TOKYO SCORING DRUM KITS", 44671, 0);

        //addListメソッドを使いcatalogListに新たなギターソフトウェアのインスタンスを追加する
        guitars.addList("Hummingbird", 32890, 17);

        //指定したリストを変更する
        drums.putList(1, "EZ Drummer 3", 22000, 100);

        //指定したリストを削除する
        //範囲外エラーハンドリング
        drums.removeList(4);
        //修正後
        drums.removeList(3);

        //リスト内の全てのインスタンスデータを表示する
        drums.printAllInfo();

        //指定したリストのインスタンスデータを表示する
        guitars.printInfo(0);

        //リスト内のインスタンスデータを全て、Mapに代入する
        drums.createMap();
        guitars.createMap();

        //検索した内容が含まれるmapキーのデータを出力する
        drums.searchMap("SUPERIOR DRUMMER 3");
        drums.searchMap("BFD 3");
        drums.searchMap("MODO DRUM 1.5");
        drums.searchMap("TOKYO SCORING DRUM KITS");
        drums.searchMap("EZ Drummer 3");
        guitars.searchMap("Hummingbird");

        //ここでシリアライズ・デシリアライズを用いてcatalogMapをcatalogMapBackupにバックアップします
        //これはディープコピーというやり方で、シャロ―コピーと違い、コピー元とコピー先が独立したデータであり、コピー元やその先を変更してもその影響を受けません
        drums.backupMap();

        //addInstrumentListメソッドを使いcatalogListに新たなドラムソフトウェアのインスタンスを追加する
        drums.addList("TOKYO SCORING DRUM KITS", 44671, 0);
        drums.addList("BFD 3", 35799, 37);

        //リスト内のインスタンスデータを全て、catalogMapに代入する
        drums.createMap();

        //Mapデータを表示する
        drums.printMap();

        //BackupMapデータを表示する
        drums.printBackupMap();

        //降順に並び替える
        drums.sortDescMap();

        //Mapデータを表示する
        drums.printMap();

        //昇順に並び替える
        drums.sortAscMap();

        //Mapデータを表示する
        drums.printMap();

        //Mapキーを全て小文字にする
        drums.convertLowerCase();

        //"drum"を含むMapデータを抽出しMapを更新する
        drums.extractMap("drum");

        //Mapデータを表示する
        drums.printMap();

        //依存性注入
        drums.catalogList.get(0).dependencyInjection();

    }
}
