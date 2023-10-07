package Object;

//オブジェクトを格納するルートソース
public class Object {

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

    ////イニシャライザー
    //staticイニシャライザー
    //インスタンスイニシャライザ―

    ////コンストラクタ
    //クラスコンストラクタ
    //シングルトン
    Object() {
        //インスタンス生成時に実行する
    }

    //コンストラクタのオーバーロード
    public Object(String name, int age) {
    }
    //コピーコンストラクタ

    ////内部クラス
    //SetMethods
    private class SetMethods {
    }

    //GetMethods
    private class GetMethods {
    }

    ////getterとsetter
    //getter
    //setter

}
