package Object;

//Instrumentsデータを格納する

import Interface.InterfaceMyService;

import java.util.ArrayList;
import java.util.List;

public class ObjectCatalog {

//    コードは一番下に記入

//    ////フィールド
//    //staticフィールド
//    protected static int staticDefault; //ObjectRoot.defaultでアクセス
//
//    //インスタンスフィールド
//    protected int instanceDefault; //インスタンス名.defaultでアクセス
//
//
//    ////イニシャライザー
//    //staticイニシャライザー
//    {
//    staticDefault = 0; //staticクラスの初期化
//    }
//
//    //インスタンスイニシャライザ―
//    {
//    instanceDefault = 0; //インスタンスの初期化
//    }
//
//
//    ////コンストラクタ
//    //クラスコンストラクタ
//    //シングルトン
//    private ObjectRoot(){
//    //インスタンス生成時に実行する
//    }
//
//    //コンストラクタのオーバーロード
//    public ObjectRoot(int staticDefault, int instanceDefault){
//    this.staticDefault = staticDefault;
//    this.instanceDefault = instanceDefault;
//    }
//
//    ////シャロ―コピー
//    //コピーコンストラクタ
//    public ObjectRoot(ObjectRoot Objectroot){
//    this.staticDefault = Objectroot.staticDefault;
//    this.instanceDefault = Objectroot.instanceDefault;
//    }
//    (使用例)
//    ObjectRoot object1 = new ObjectRoot(20, 20);
//    ObjectRoot object2 = new ObjectRoot(object1);
//    object1をobject2にシャロ―コピーする
//
//
//    ////内部クラス
//    //SetMethods
//    private class SetMethods{
//        public void setStaticMethod(int staticDefault){
//            setStaticDefault(staticDefault);
//        }
//        public void setInstanceMethod(int instanceDefault){
//            setInstanceDefault(instanceDefault);
//        }
//    }
//    //GetMethods
//    private class GetMethods{
//        public int getStaticMethods() {
//            return getStaticDefault();
//        }
//        public int getInstanceMethods(){
//            return getInstanceDefault();
//        }
//    }
//
//
//    ////getterとsetter
//    //getter
//    private int getStaticDefault(){
//        return ObjectRoot.staticDefault;
//    }
//    private int getInstanceDefault(){
//        return this.instanceDefault;
//    }
//    //setter
//    private void setStaticDefault(int staticDefault){
//        ObjectRoot.staticDefault = staticDefault;
//    }
//    private void setInstanceDefault(int instanceDefault){
//        this.instanceDefault = instanceDefault;
//    }


    //////default

    ////フィールド
    //staticフィールド
    //インスタンスフィールド
    //製品名を格納するprivate修飾子のString型のproductNameを宣言する
    private String productName;
    //製品価格を格納するprivate修飾子のint型のproductPriceを宣言する
    private int productPrice;
    //在庫数を格納するprivate修飾子のint型のproductStockを宣言する
    private int productStock;
    //製品価格productPriceと在庫数productStockを格納数するList型のproductListにArrayList型を宣言する
    private final List<Integer> productList = new ArrayList<>();

    //依存性注入：取得したインターフェースを保管することで、そのインターフェースが間接的に取得したクラスのメソッドを呼び出せる
    public final InterfaceMyService myService;//本来はfinalの方がよい

    ////イニシャライザー
    //staticイニシャライザー
    //インスタンスイニシャライザ―

    ////コンストラクタ
    //クラスコンストラクタ
    //シングルトン
    private ObjectCatalog(InterfaceMyService myService) {
        this.myService = myService;
    }

    //コンストラクタのオーバーロード
    //引数として、製品名を持つString型のproductName、製品価格を持つint型のproductPrice、在庫数を持つint型のproductStockがある
    //引数のproductName、productPrice、productStockをDataItem.javaのproductName、productPrice、productStockに代入する
    public ObjectCatalog(String productName, int productPrice, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.myService = null;//依存性注入を行わない場合はnullを代入します
        productList.add(this.productPrice);//productPriceをList型のproductListに追加する
        productList.add(this.productStock);//productStockをList型のproductListに追加する
    }

    public ObjectCatalog(String productName, int productPrice, int productStock, InterfaceMyService myService) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.myService = myService;
        productList.add(this.productPrice);//productPriceをList型のproductListに追加する
        productList.add(this.productStock);//productStockをList型のproductListに追加する
    }
    //コピーコンストラクタ

    ////内部クラス
    //GetMethods
    public class GetProduct {
        //製品名を格納するString型のProductNameを返す
        public String getInProductName() {
            return getProductName();
        }

        //製品価格を格納するString型のproductPriceを返す
        public int getInProductPrice() {
            return getProductPrice();
        }

        //在庫数を格納するString型のproductStockを返す
        public int getInProductStock() {
            return getProductStock();
        }

        //製品価格productPriceと在庫数productStockが格納されたList型のproductListを返す
        public List<Integer> getInProductList() {
            return getProductList();
        }
    }

    //SetMethods
    public class SetProduct {
        //製品名を格納するString型のproductNameを変更する
        public void setInProductName(String productName) {
            setProductName(productName);
        }

        //製品価格を格納するint型のproductPriceを変更する
        public void setInProductPrice(int productPrice) {
            setProductPrice(productPrice);
        }

        //在庫数を格納するint型のproductStockを変更する
        public void setInProductStock(int productStock) {
            setProductStock(productStock);
        }
    }

    ////getterとsetter
    //getter
    private String getProductName() {
        return this.productName;
    }

    private int getProductPrice() {
        return this.productPrice;
    }

    private int getProductStock() {
        return this.productStock;
    }

    private List<Integer> getProductList() {
        return this.productList;
    }


    //setter
    private void setProductName(String productName) {
        this.productName = productName;
    }

    private void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    private void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    //依存性注入
    public void dependencyInjection() {
        myService.doSomething();// 依存性を利用
    }

}
