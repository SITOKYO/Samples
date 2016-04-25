package interfaceSample.after;

/**
 * Mainクラス
 */
public class Main {
    public static void main(String... args){
        DocumentMaker documentMaker = new DocumentMaker();
        Writable ballpointPen = new BallpointPen();
        Writable fountainPen = new FountainPen();
        Writable mechanicalPencil = new MechanicalPencil();
        
        documentMaker.documentMake(ballpointPen);
        documentMaker.documentMake(fountainPen);
        documentMaker.documentMake(mechanicalPencil);
    }
}
