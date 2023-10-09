# 第4回課題

主にmain.javaで実行した `FunctionCatalog.start()`について説明します。

<br>

## 目次

<br>

## ファイル構造

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/e0cdcc29-a187-45a8-8acf-0057c4443ede)

<br>

- ### org/kadai04<br>
  - 実行クラスを保管するフォルダ

- ### Function<br>
  - データの計算やインスタンスを管理するフォルダ

- ### Object<br>
  - インスタンスを作成するフォルダ

- ### Interface<br>
  - インターフェースを作成するフォルダ

- ### Run<br>
  - 並行処理を行うフォルダ

- ### Error<br>
  - 例外を作成し例外処理を行うフォルダ

<br><br>

## 実行

<br>

### 1.FunctionCatalogクラス　static startメソッドを呼び出す

#### 実行したコード

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/org/kadai04/Main.java#L11-L14

<br>

#### 呼び出したコード

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L28-L116

<br>

### 2.FunctionCatalogのクラスコンストラクタを呼び出しインスタンスを生成する

#### 実行したコード

- DrumsインスタンスとGuitarインスタンスの生成
> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L31-L34

<br>

#### 呼び出したコード

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L17-L24

<br>

### 3.ObjectCatalogクラスのインスタンスを生成する

#### 実行したコード

> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L36-L45

<br>

#### 呼び出したコード

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Function/FunctionCatalog.java#L118-L130

<br>

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L137-L144

<br>

> https://github.com/kainuma-sn/kadai04/blob/b343d7ba391996ad2d6cad89b0a4e0ddb0a83439/src/main/java/Error/ErrorCatalog.java#L15-L23
  
<br>

#### 出力結果

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/0f7700d6-1dae-4b49-999c-3ae92729377a)

### 4.drumsリストから指定したdrumインスタンスを変更します

#### 実行したコード

> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L47-L48

<br>

#### 呼び出したコード

> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L132-L139

<br>

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L171-L187

<br>

> https://github.com/kainuma-sn/kadai04/blob/383e0fc4b4654d5a384ced43fce8f06c47725305/src/main/java/Object/ObjectCatalog.java#L208-L224

<br>

#### 出力結果

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/2661e37d-1a35-444a-93b7-3be634d9eede)

### 5.drumリストから指定したdrumインスタンスを削除します

#### 実行したコード

> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L50-L54

<br>

#### 呼び出したコード

> https://github.com/kainuma-sn/kadai04/blob/0148b2182ebe49a9e6b832b3721b55c55bfcef48/src/main/java/Function/FunctionCatalog.java#L141-L152

<br>

#### 出力結果

> ![image](https://github.com/kainuma-sn/kadai04/assets/145829664/0b8b138e-fa14-4f0b-93d8-b3329e700421)

<br>

### 6.
