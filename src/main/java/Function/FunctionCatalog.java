package Function;

import Error.ErrorCatalog;
import Interface.InterfaceMyService;
import Object.ObjectCatalog;

import java.util.*;
import java.util.stream.Collectors;


//楽器ソフトウェアインスタンスを管理するクラス
public class FunctionCatalog {
    private final List<ObjectCatalog> catalogList;
    private Map<String, List<Integer>> catalogMap;
    private Map<String, List<Integer>> catalogMapBackup;

    //クラスコンストラクタ
    public FunctionCatalog() {
        //ArrayListを使用し、FunctionCatalogクラスのインスタンスを格納するためのリスト（ObjectCatalogクラス型）のcatalogListを作成する
        catalogList = new ArrayList<>();
        //HashMapを使用し、キーのStringとListのInteger型のmap型のcatalogMapを作成する
        catalogMap = new HashMap<>();
        //HashMapを使用し、キーのStringとListのInteger型のmap型のcatalogMapBackupを作成する
        catalogMapBackup = new HashMap<>();
        
    }

    //実行
    public static void start() {

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
        guitars.printMap();

        //検索した内容が含まれるmapキーのデータを出力する
        drums.searchMap("SUPERIOR DRUMMER 3");
        drums.searchMap("BFD 3");
        drums.searchMap("MODO DRUM 1.5");
        drums.searchMap("TOKYO SCORING DRUM KITS");
        drums.searchMap("EZ Drummer 3");

        //ここでシリアライズ・デシリアライズを用いてcatalogMapをcatalogMapBackupにバックアップします
        //これはディープコピーというやり方で、シャロ―コピーと違い、コピー元とコピー先が独立したデータであり、コピー元やその先を変更してもその影響を受けません
        drums.backupMap();

        //addInstrumentListメソッドを使いcatalogListに新たなドラムソフトウェアのインスタンスを追加する
        drums.addList("TOKYO SCORING DRUM KITS", 44671, 0);
        drums.addList("BFD 3", 35799, 37);

        //リスト内のインスタンスデータを全て、catalogMapに代入する
        drums.createMap();
        guitars.createMap();

        //HashMapの特徴として、要素が順番に並ばないことがある
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

    //catalogListに新たなObjectCatalogインスタンスを追加する
    public void addList(String productName, int productPrice, int productStock) {
        InterfaceMyService myService = new FunctionMyServiceImpl();
        try {
            ErrorCatalog.checkNullProductName(productName);
            catalogList.add(new ObjectCatalog(productName, productPrice, productStock, myService));
            System.out.println(productName + "　の製品登録が完了しました");
            System.out.println("--------------");
        } catch (IllegalArgumentException error) {
            System.out.println(error);
            System.out.println("--------------");
        }
    }

    //list内の指定したインスタンスのデータを変更する
    public void putList(int catalogListNumber, String productName, int productPrice, int productStock) {
        catalogList.get(catalogListNumber).new SetProduct().setInProductName(productName);
        catalogList.get(catalogListNumber).new SetProduct().setInProductPrice(productPrice);
        catalogList.get(catalogListNumber).new SetProduct().setInProductStock(productStock);
        System.out.println("リスト番号：" + catalogListNumber + "　の変更が完了しました");
        System.out.println("----------------------------");
    }

    //List内から指定したインスタンスのデータを削除する
    public void removeList(int catalogListNumber) {
        try {
            catalogList.remove(catalogListNumber);
            System.out.println("リスト番号：" + catalogListNumber + "　の削除が完了しました");
            System.out.println("----------------------------");
        } catch (IndexOutOfBoundsException e) {
            //リストの範囲外が検索されたとき
            System.out.println("指定リストにデータはありません");
            System.out.println("----------------------------");
        }
    }

    //list内にあるすべてのインスタンスに格納されているデータを出力する
    public void printAllInfo() {
        int catalogListNumber = 0;
        for (ObjectCatalog item : catalogList) {
            System.out.println("リスト番号：" + catalogListNumber);
            System.out.println("製品：" + item.new GetProduct().getInProductName());
            System.out.println("価格：" + item.new GetProduct().getInProductPrice());
            System.out.println("在庫：" + item.new GetProduct().getInProductStock());
            System.out.println("--------------");
            catalogListNumber++;
        }

        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを出力する
    public void printInfo(int catalogListNumber) {
        try {
            System.out.println("リスト番号：" + catalogListNumber);
            System.out.println("製品：" + catalogList.get(catalogListNumber).new GetProduct().getInProductName());
            System.out.println("価格：" + catalogList.get(catalogListNumber).new GetProduct().getInProductPrice());
            System.out.println("在庫：" + catalogList.get(catalogListNumber).new GetProduct().getInProductStock());
            System.out.println("----------------------------");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("出力範囲外です");
        }
    }

    //mapを初期化した後、拡張forループを使用し、リスト化したインスタンスからkeyとデータリストを用意し、mapを作成する
    public void createMap() {
        catalogMap.clear();
        for (ObjectCatalog item : catalogList) {
            catalogMap.put(item.new GetProduct().getInProductName(), item.new GetProduct().getInProductList());
        }
    }

    //引数のString型productNameと一致するキーがあれば、その結果を出力する
    //引数のString型productNameと一致するキーがなければ、エラーを返す
    public void searchMap(String productName) {
        System.out.println(productName + "　の検索を開始します");
        try {
            ErrorCatalog.searchProductInfo(catalogMap.get(productName));
            System.out.println(productName + "：[価格/在庫]" + catalogMap.get(productName));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("----------------------------");
    }

    //現在登録されているMapの情報のバックアップ
    public void backupMap() {
        FunctionDeepCopy functionDeepCopy = new FunctionDeepCopy();
        catalogMapBackup = functionDeepCopy.deepCopyCatalog(catalogMap);

        System.out.println("下記のとおりバックアップしました:");
        Set<Map.Entry<String, List<Integer>>> entrySet = catalogMapBackup.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            System.out.println("キー: " + key + ", 値: " + value);
        }
        System.out.println("----------------------------");
    }

    //インスタンスのmap内の要素をすべて表示する
    public void printMap() {
        System.out.println("catalogMap:");
        Set<Map.Entry<String, List<Integer>>> entrySet = catalogMap.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            System.out.println("キー: " + key + ", 値: " + value);
            System.out.println("--------------");
        }
        System.out.println("----------------------------");
    }

    //インスタンスの指定したmap要素を表示する
    public void printBackupMap() {
        System.out.println("catalogMapBackup:");
        Set<Map.Entry<String, List<Integer>>> entrySet = catalogMapBackup.entrySet();
        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            String key = entry.getKey();
            List<Integer> value = entry.getValue();
            System.out.println("キー: " + key + ", 値: " + value);
            System.out.println("--------------");
        }
        System.out.println("----------------------------");
    }

    //インスタンスのmapを昇順に並べ替える
    public void sortAscMap() {
        catalogMap = catalogMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) //昇順に並び替え
                .collect(Collectors.toMap( //HashMapからLinkedHashMapに使用。元々LinkedHashMapだったり、同じ型に入れる場合は不要。
                        Map.Entry::getKey, // キーを保持
                        Map.Entry::getValue, // 値を保持
                        (e1, e2) -> e1, // 重複時のマージロジック (今回は上書き)
                        LinkedHashMap::new // LinkedHashMapに収集して順序を保持
                ));
    }

    //インスタンスのmapを降順に並べ替える
    public void sortDescMap() {
        catalogMap = catalogMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // 降順に並び替え
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    //インスタンスのマップキー全てを小文字に変換する
    public void convertLowerCase() {
        catalogMap = catalogMap.entrySet().stream()
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toLowerCase(),//キーを小文字に変換
                        Map.Entry::getValue,//値の保持
                        (e1, e2) -> e1, //同じキーなら値を更新
                        LinkedHashMap::new //LinkedHashMapに変換
                ));
    }

    //"drum"を含むMapデータを抽出しMapを更新する
    public void extractMap(String includedName) {
        catalogMap = catalogMap.entrySet().stream()
                .filter(entry -> entry.getKey().contains(includedName))//キーがドラムを含む要素のみを取り出す
                .collect(Collectors.toMap(
                        Map.Entry::getKey,//キーの保持
                        Map.Entry::getValue,//値の保持
                        (e1, e2) -> e1, //同じキーなら値を更新
                        LinkedHashMap::new //LinkedHashMapに変換
                ));
    }
}
