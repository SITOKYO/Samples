package interfaceSample.before;

/**
 * 書類作成クラス
 */
public class DocumentMaker {
    public void documentMake(BallpointPen ballpointPen){
        ballpointPen.write();
    }
    
    public void documentMake(FountainPen fountainPen){
        fountainPen.write();
    }
    
    public void documentMake(MechanicalPencil mechanicalPencil){
        mechanicalPencil.write();
    }
}
