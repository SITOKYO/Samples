package interfaceSample.before;

/**
 * 書類作成クラス
 */
public class DocumentMaker {
    //ボールペンを受け取って書類を作成する
    public void documentMake(BallpointPen ballpointPen){
        ballpointPen.write();
    }
    //万年筆を受け取って書類を作成する
    public void documentMake(FountainPen fountainPen){
        fountainPen.write();
    }
    //シャープペンシルを受け取って書類を作成する
    public void documentMake(MechanicalPencil mechanicalPencil){
        mechanicalPencil.write();
    }
}
