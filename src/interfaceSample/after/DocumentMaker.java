package interfaceSample.after;

/**
 * 書類作成クラス
 */
public class DocumentMaker {
    //書けるものを受け取って書類を作成する
    public void documentMake(Writable writable){
        writable.write();
    }
}
