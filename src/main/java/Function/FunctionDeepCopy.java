package Function;

import java.util.List;
import java.util.Map;

//ObjectソースとFunctionソースを実行する
//親クラス定義せずコピペして使えます
public class FunctionDeepCopy {
    //実行

    //ディープコピー
    public Map<String, List<Integer>> deepCopyCatalog(Map<String, List<Integer>> catalogList) {
        //シリアライゼーション
        FunctionSerialization functionSerialization = new FunctionSerialization();
        functionSerialization.serializaiton(catalogList);

        //デシリアライゼーション
        FunctionDeserialization functionDeserialization = new FunctionDeserialization();
        return functionDeserialization.deserializationCatalog();
    }

}
