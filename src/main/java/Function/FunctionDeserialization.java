package Function;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;

//ObjectソースとFunctionソースを実行する
//親クラス定義せずコピペして使えます
//デシリアライズを行う
//このやり方だと危ないとintellijのコンパイルで指摘を受けたので、理由を調べることを頭に入れておく
public class FunctionDeserialization {

    //Map型String,List<Integer>のデシリアライズ
    public Map<String, List<Integer>> deserializationCatalog() {
        Map<String, List<Integer>> deserializedCatalog = null;
        try (FileInputStream fileInputStream = new FileInputStream("convert.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            deserializedCatalog = (Map<String, List<Integer>>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();//デバッグ用
        }
        return deserializedCatalog;
    }
}
