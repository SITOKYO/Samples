package interfaceSample.after;

/**
 * Mainクラス
 */
public class Main {
    public static void main(String... args){
        //書類作成者オブジェクトを生成
        DocumentMaker documentMaker = new DocumentMaker();
        //筆記用具としてボールペンオブジェクトを生成
        Writable ballpointPen = new BallpointPen();
        //筆記用具として万年筆オブジェクトを生成
        Writable fountainPen = new FountainPen();
        //筆記用具としてシャープペンシルオブジェクトを生成
        Writable mechanicalPencil = new MechanicalPencil();
        
        //ボールペンで書類を作成
        documentMaker.documentMake(ballpointPen);
        //万年筆で書類を作成
        documentMaker.documentMake(fountainPen);
        //シャープペンシルで書類を作成
        documentMaker.documentMake(mechanicalPencil);
    }
}
