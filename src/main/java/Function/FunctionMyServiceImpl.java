package Function;

import Interface.InterfaceMyService;

//依存性注入　具体的な実装クラスを作成
public class FunctionMyServiceImpl implements InterfaceMyService {
    @Override
    public void doSomething() {
        //依存性の処理を実装
        System.out.println("FunctionMyServiceImpl.javaの処理をFunctionCatalog.javaを経由してObjectCatalogインスタンスで依存性注入を行っています");
        System.out.println("----------------------------");
    }

}
