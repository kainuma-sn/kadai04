package Error;

//リストをインポートする

import java.util.List;

//親クラスExceptionを持つサブクラスErrorCatalog
public class ErrorCatalog extends Exception {

    //引数を持たない親クラスExceptionのクラスコンストラクタを呼び出す
    public ErrorCatalog() {
        super();
    }

    //    int型iとString型valueを引数に持つcheckProductNameクラス
//    引数String型のproductNameがnull又は空白の場合、エラーを返す
//    引数String型のproductNameがどちらでもない場合、処理を終了する
    //キーと値の入力検証
    public static void checkNullProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("エラー！　製品登録に失敗しました");
        }
    }

    //引数List<Integer>型のvalueを持つsearchProductInfoクラス
    //productNameがnull又は空の場合、エラーを返す
    //productNameがnull又は空でもない場合、処理を終了する
    public static void searchProductInfo(List<Integer> productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("該当する製品はありません");
        }
    }
}
