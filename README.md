# 第4回課題

主にmain.javaで実行した `FunctionCatalog.start()`について説明します。

<br><br><br>

## 1.課題：Streamを動かしてみよう

<br>

### 1-1.降順に並び替える<br>
#### 初期データ<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/de87628e-c1aa-4d6f-83b1-ee061daf80fa)<br>
#### 実行したコード<br>
- FunctionCatalog startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/41777cb1cb386fa119b213b75b2a0c39e53c1aa4/src/main/java/Function/FunctionCatalog.java#L91-L95<br>
#### 呼び出したコード<br>
- FunctionCatalog sortDescMapメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/c0e094c3fae6cde57c7a753239bfb9e21a58d590/src/main/java/Function/FunctionCatalog.java#L255-L265<br>
#### 出力結果<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/9088ac6a-e5d8-47fe-adee-2e295f4097db)
<br>

### 1-2.昇順に並び替える<br>
#### 初期データ<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/4053aa9f-ed55-4486-83bc-36918a43802e)<br>
#### 実行したコード<br>
- FunctionCatalog startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/41777cb1cb386fa119b213b75b2a0c39e53c1aa4/src/main/java/Function/FunctionCatalog.java#L97-L101<br>
#### 呼び出したコード<br>
- FunctionCatalog sortAscMapメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/2da6501cc28bfda9cfecd4e5a1489dd3f9509cd6/src/main/java/Function/FunctionCatalog.java#L243-L253<br>
#### 出力結果<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/0770dba6-c00c-44ba-940a-89c713ea202b)<br>

### 1-3.Mapキーを全て小文字にし、Mapキーに"drum"を含むMapデータを抽出し、更新する<br>
#### 初期データ<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/6d4fcf3f-3eb2-44ed-a2a6-ad42c7aee558)<br>
#### 実行したコード<br>
- FunctionCatalog startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L103-L110<br>
#### 呼び出したコード<br>
- FunctionCatalog convertLowerCaseメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L267-L276<br>
- FunctionCatalog extractMapメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/2da6501cc28bfda9cfecd4e5a1489dd3f9509cd6/src/main/java/Function/FunctionCatalog.java#L278-L288<br>
#### 出力結果<br>
> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/84d484aa-ebc0-479c-beba-a9e32a3d95c5)<br>

<br><br><br>

## 2.ファイル構造<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/e0cdcc29-a187-45a8-8acf-0057c4443ede)<br>

<br>

- ### org/kadai04<br>
  - 実行クラスを保管するフォルダ<br>

- ### Function<br>
  - データの計算やインスタンスを管理するフォルダ<br>

- ### Object<br>
  - インスタンスを作成するフォルダ<br>

- ### Interface<br>
  - インターフェースを作成するフォルダ<br>

- ### Run<br>
  - 並行処理を行うフォルダ<br>

- ### Error<br>
  - 例外を作成し例外処理を行うフォルダ<br>

<br><br><br>

## 3.実行<br>

<br>

### 3-1.FunctionCatalogクラス　static startメソッドを呼び出す<br>

#### 実行したコード<br>

- main.javaクラス mainメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/b2679a9d30083bec44db5b3fb71f4577586d8091/src/main/java/org/kadai04/Main.java#L11-L14<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L28-L115<br>

<br>
---<br>

### 3-2.FunctionCatalogのクラスコンストラクタを呼び出しインスタンスを生成する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
- DrumsインスタンスとGuitarインスタンスの生成<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L31-L34<br>

<br>

#### 呼び出したコード<br>

- FunvtionCatalogクラス クラスコンストラクタ<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L17-L24<br>

<br>
---<br>

### 3-3.ObjectCatalogクラスのインスタンスを生成する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L36-L45<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス addListメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L118-L130<br>

<br>

- ObjectCatalogクラス クラスコンストラクタ<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L137-L144<br>

<br>

- ErrorCatalogクラス checkNullProductNameメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/a87150592aa3a0f918e3f258e7e84240b13039bb/src/main/java/Error/ErrorCatalog.java#L15-L23<br>
  
<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/0f7700d6-1dae-4b49-999c-3ae92729377a)<br>

<br>
---<br>

### 3-4.drumsリストから指定したdrumインスタンスを変更します<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L47-L48<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス putListメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L132-L139<br>

<br>

- ObjectCatalogクラス SetProduct内部クラス<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L171-L187<br>

<br>

- ObjectCatalogクラス setter<br>
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L208-L224<br>

<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/2661e37d-1a35-444a-93b7-3be634d9eede)<br>

<br>
---<br>

### 3-5.drumリストから指定したdrumインスタンスを削除します<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L50-L54<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス removeListメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L141-L152<br>

<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/0b8b138e-fa14-4f0b-93d8-b3329e700421)<br>

<br>

### 3-6.drumsリスト内全てのインスタンスデータを表示する<br>

#### 実行したコード<br>

- FunctionCatalog startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L56-L57<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス printAllInfoメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L155-L167<br>

<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/8ed2f62c-b584-466a-9e66-9e3b0be8747b)<br>

<br>

### 3-7.guitarsリストの指定したインスタンスデータを表示する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L59-L60<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス putListメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L59-L60<br>

<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/3f52c697-c17f-4063-ab25-970af341bcc9)<br>

<br>

### 3-8.drumsとguitarsリストをそれぞれMapに代入する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L62-L64<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L181-L187<br>

<br>

- ObjectCatalogクラス GetProduct内部クラス<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Object/ObjectCatalog.java#L148-L169<br>

<br>

- ObjectCatalogクラス getter<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Object/ObjectCatalog.java#L190-L205<br>

<br>

### 3-9.drumsとguitarsmapのキーを検索し、値を表示する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L66-L72<br>

<br>

#### 呼び出したコード<br>

- FunctionCatalogクラス searchMapメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L189-L200<br>

<br>

- ErrorCatalogクラス checkNullOrEmptyProductNameメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/80e25e0a7230a50cc45555786842da1218e3eedc/src/main/java/Error/ErrorCatalog.java#L25-L32<br>

#### 出力結果

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/aa1a3665-1392-4263-b14b-2f0c074a4b2d)<br>

<br>

### 3-10.drumsインスタンスmapのバックアップをディープコピーで作成し、表示する<br>

#### 実行したコード<br>

- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L74-L89<br>

#### 呼び出されたコード<br>

- FunctionCatalogクラス backupMapメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L202-L215<br>

<br>

- FunctionDeepCopyクラス<br>
> https://github.com/kainuma-sn/kadai04/blob/80e25e0a7230a50cc45555786842da1218e3eedc/src/main/java/Function/FunctionDeepCopy.java#L1-L25<br>

<br>

- FunctionSerializationクラス<br>
> https://github.com/kainuma-sn/kadai04/blob/80e25e0a7230a50cc45555786842da1218e3eedc/src/main/java/Function/FunctionSerialization.java#L1-L24<br>

<br>

- FunctionDeserializationクラス<br>
> https://github.com/kainuma-sn/kadai04/blob/80e25e0a7230a50cc45555786842da1218e3eedc/src/main/java/Function/FunctionDeserialization.java#L1-L30<br>

<br>

#### 出力結果<br>

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/e863ae91-f25a-465f-96a2-4c67d1f5d2d1)<br>

<br>

### 3-11.drumsインスタンスmapのバックアップをディープコピーで作成し、表示する<br>

#### 実行したコード<br>
- FunctionCatalogクラス インスタンスフィールド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L4<br>
- FunctionCatalogクラス startメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L37<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L112-L113<br>
- FunctionCatalogクラス addリストメソッド<br>
> https://github.com/kainuma-sn/kadai04/blob/bb637a9de3c26b1700f88ebb4f8a8a78a0165622/src/main/java/Function/FunctionCatalog.java#L117-L129<br>
