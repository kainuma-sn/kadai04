package Function;

import Object.ObjectCatalog;

//ObjectソースとFunctionソースを実行する
//親クラス定義せずコピペして使えます
public class FunctionError {
    //検証用String型errorText
    private String errorText;
    //検証用int型errorValue
    private int errorValue;

    //実行
    public static void start() {
        //try-catchは複数のcatchを書ける、finallyで処理完了後の手続を入れられる
        //下記以外のエラーは適宜調べる
        System.out.println("----------------------------------------");
        FunctionError functionError = new FunctionError();

        //nullPointerExceptionの実行
        functionError.nullPointerException();

        //arrayIndexOutOfBoundsExceptionの実行
        functionError.arrayIndexOutOfBoundsException();

        //ArithmeticExceptionの実行
        functionError.ArithmeticException();

    }

    //////実行時エラー
    private void nullPointerException() {
        System.out.println("例外：NullPointerException");//nullで生じるエラー
        //メソッド呼び出し
        try {
            this.errorText = null;
            int length = errorText.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("メソッド呼び出し：" + e);
        }
        //フィールドにアクセス
        try {
            ObjectCatalog objectCatalog = null;
            int fieldValue = objectCatalog.new GetProduct().getInProductPrice(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("フィールドにアクセス：" + e);
        }
        System.out.println("----------------------------------------");
        System.out.println("例外処理：NullPointerException");
        System.out.println("--------------------");
        //キーと値の入力検証（NullPointerException）
        errorText = null;
        if (errorText != null) {
            int length = errorText.length(); // NullPointerException
        } else {
            System.out.println("キーと値の入力検証（NullPointerException）");
        }
        System.out.println("--------------------");
        //エラーハンドリング
        try {
            int length = errorText.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("エラーハンドリング（NullPointerExceptionを検出）：" + e);
            System.out.println("String型のtextにnull以外を代入してください");
        } finally {
            System.out.println("--------------------");
        }
        //代替処理
        try {
            int length = errorText.length(); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionを検出：" + e);
            errorText = "おこだよ";
            System.out.println("String型のtextに別のデータを代入しました： text = " + errorText);
        }
        //ドキュメンテーション
        // FunctionError.java25行目のString型のtext変数にはnull以外を代入してください
    }

    private void arrayIndexOutOfBoundsException() {
        System.out.println("----------------------------------------");
        System.out.println("例外：ArrayIndexOutOfBoundsException");//配列で生じるエラー
        //空の配列へアクセス
        try {
            int[] number = {}; //初期化されていない
            int error = number[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("空の配列へアクセス：" + e);
        }
        //無効なインデックス
        try {
            int[] number = {1, 2, 3};//[0]=1,[1]=2,[2]=3
            int error = number[3];//[3]は範囲外のためエラーが発生する
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("無効なインデックス：" + e);
        }
        //loopの制御
        //for
        try {
            int[] number = {1, 2, 3};
            for (int count = 0; count < 4; count++) {
                errorValue = number[count];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("loop(for)の制御：" + e);
        }
        //for-each
        try {
            int[] number = {5, 2, 3};
            for (int count : number) {
                errorValue = count;//for-eachは普通に使う分にはエラーがおきない
                System.out.println(number[3]);//無効なインデックスによるエラーを発生させる
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("loop(for-each)の制御：" + e);
        }
        System.out.println("----------------------------------------");
        System.out.println("例外処理：ArrayIndexOutOfBoundsException");
        System.out.println("【省略】");
        System.out.println("----------------------------------------");
    }

    private void ArithmeticException() {
        System.out.println("例外：ArithmeticException");
        //ゼロ除算
        try {
            errorValue = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ゼロ除算：" + e);
        }
        //整数オーバーフロー
        try {
            errorValue = 0;
            errorValue = Integer.MAX_VALUE + 1;//2147483647からオーバーフローして-2147483648になる
            System.out.println("【エラー起きず】整数オーバーフロー：" + errorValue);
        } catch (ArithmeticException e) {
            System.out.println("整数オーバーフロー：" + e);
        }
        //整数の除算による丸めエラー
        try {
            errorValue = 1 / 3;
            System.out.println("【エラー起きず】整数オーバーフロー：" + errorValue);
        } catch (ArithmeticException e) {
            System.out.println("整数の除算による丸めエラー：" + e);
        }
        System.out.println("----------------------------------------");
        System.out.println("例外処理：ArithmeticException");
        System.out.println("【省略】");
        System.out.println("----------------------------------------");
    }
}
