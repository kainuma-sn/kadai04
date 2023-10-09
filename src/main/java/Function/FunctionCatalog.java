package Function;

import Error.ErrorCatalog;
import Interface.InterfaceMyService;
import Object.ObjectCatalog;

import java.util.*;
import java.util.stream.Collectors;


//カタログインスタンスを管理するクラス
public class FunctionCatalog {
    public final List<ObjectCatalog> catalogList;
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
        catalogList.get(catalogListNumber).setProductName(productName);
        catalogList.get(catalogListNumber).setProductPrice(productPrice);
        catalogList.get(catalogListNumber).setProductStock(productStock);
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
            System.out.println("製品：" + item.getProductName());
            System.out.println("価格：" + item.getProductPrice());
            System.out.println("在庫：" + item.getProductStock());
            System.out.println("--------------");
            catalogListNumber++;
        }

        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを出力する
    public void printInfo(int catalogListNumber) {
        try {
            System.out.println("リスト番号：" + catalogListNumber);
            System.out.println("製品：" + catalogList.get(catalogListNumber).getProductName());
            System.out.println("価格：" + catalogList.get(catalogListNumber).getProductPrice());
            System.out.println("在庫：" + catalogList.get(catalogListNumber).getProductStock());
            System.out.println("----------------------------");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("出力範囲外です");
        }
    }

    //mapを初期化した後、拡張forループを使用し、リスト化したインスタンスからkeyとデータリストを用意し、mapを作成する
    public void createMap() {
        catalogMap.clear();
        for (ObjectCatalog item : catalogList) {
            catalogMap.put(item.getProductName(), item.getProductList());
        }
    }

    //引数のString型productNameと一致するキーがあれば、その結果を出力する
    //引数のString型productNameと一致するキーがなければ、エラーを返す
    public void searchMap(String productName) {
        System.out.println(productName + "　の検索を開始します");
        try {
            ErrorCatalog.checkNullorEmptyProductName(catalogMap.get(productName));
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
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap( //昇順に並び替え
                        Map.Entry::getKey, // キーを保持
                        Map.Entry::getValue, // 値を保持
                        (e1, e2) -> e1, //同じキーなら値を更新
                        LinkedHashMap::new //LinkedHashMapに変換
                ));
    }

    //インスタンスのmapを降順に並べ替える
    public void sortDescMap() {
        catalogMap = catalogMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // 降順に並び替え
                .collect(Collectors.toMap(
                        Map.Entry::getKey, //キーの保持
                        Map.Entry::getValue, //値の保持
                        (e1, e2) -> e1, //同じキーなら値を更新
                        LinkedHashMap::new //LinkedHashMapに変換
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

    //String型の引数includedNameを含むMapデータを抽出しMapを更新する
    public void extractMap(String includedName) {
        catalogMap = catalogMap.entrySet().stream()
                .filter(entry -> entry.getKey().contains(includedName))//キーがincludedNameを含む要素のみを取り出す
                .collect(Collectors.toMap(
                        Map.Entry::getKey,//キーの保持
                        Map.Entry::getValue,//値の保持
                        (e1, e2) -> e1, //同じキーなら値を更新
                        LinkedHashMap::new //LinkedHashMapに変換
                ));
    }
}
