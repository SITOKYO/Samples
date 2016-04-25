package interfaceSample.before;

/**
 * Mainクラス
 */
public class Main {
    public static void main(String... args){
        //書類作成者作成
        DocumentMaker documentMaker = new DocumentMaker();
        //ボールペンとしてボールペンを作成
        BallpointPen ballpointPen = new BallpointPen();
        //万年筆として万年筆を作成
        FountainPen fountainPen = new FountainPen();
        //シャープペンシルとしてシャープペンシルを作成
        MechanicalPencil mechanicalPencil = new MechanicalPencil();
        
        //ボールペンで書類を作成
        documentMaker.documentMake(ballpointPen);
        //万年筆で書類を作成
        documentMaker.documentMake(fountainPen);
        //シャープペンシルで書類を作成
        documentMaker.documentMake(mechanicalPencil);
    }
}
