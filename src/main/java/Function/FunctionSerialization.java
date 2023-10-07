package Function;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.List;

//ObjectソースとFunctionソースを実行する
//親クラス定義せずコピペして使えます

public class FunctionSerialization {
    //Map型<String, List<Integer>>用のシリアライズ
    public void serializaiton(Map<String, List<Integer>> catalogList){
        //try開始前にFileOutputStreamとObjectOutputStreamを初期化
        try(FileOutputStream fileOutputStream = new FileOutputStream("convert.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(catalogList);
        }catch(IOException e){
            e.printStackTrace();//デバッグ用
        }
    }

}