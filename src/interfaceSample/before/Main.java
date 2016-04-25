package interfaceSample.before;

/**
 * Mainクラス
 */
public class Main {
    public static void main(String... args){
        DocumentMaker documentMaker = new DocumentMaker();
        BallpointPen ballpointPen = new BallpointPen();
        FountainPen fountainPen = new FountainPen();
        MechanicalPencil mechanicalPencil = new MechanicalPencil();
        
        documentMaker.documentMake(ballpointPen);
        documentMaker.documentMake(fountainPen);
        documentMaker.documentMake(mechanicalPencil);
    }
}
