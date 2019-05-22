# JavaからGoogle APIを呼び出すサンプル

JavaからGoogle APIを呼び出すサンプルを示す。  
前回[JavaからGoogle Sheets APIを呼び出すサンプル](https://github.com/ae-nishikawa/ae-nishikawa-java2gss-sample)の改造版。
変更点
*Gmail API、Apps Script API呼び出し追加
*プロパティファイル設定

手順は次の通り
1.  Google側の設定
2.  Google Apps Scriptの設定  
3.  Java実装  

## 1.Google設定
基本的に前回と一緒。  
詳細は、前回[JavaからGoogle Sheets APIを呼び出すサンプル](https://github.com/ae-nishikawa/ae-nishikawa-java2gss-sample)を参照。  
1.2　必要なAPIを有効にする、1.3　スコープを追加するで、「Gmail API」「Script API」を追加する。
  
  
## 2.Google Apps Scriptの設定
適当なGoogle Apps Scriptを作成し、実行可能なAPIとして導入を行う。  
その際、API IDをメモしておく。
  
## 3.Javaの実装
基本的に前回と一緒。
但し、プロパティファイルに必要な値を設定する。  
Google Apps Scriptを特定するAPI IDは前項で取得したものを設定する。  
FuncitonNameは自分で作成した関数名。
