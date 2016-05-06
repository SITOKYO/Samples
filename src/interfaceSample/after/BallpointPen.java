package interfaceSample.after;

/**
 * ボールペンクラス
 */
public class BallpointPen implements Writable{
    @Override  // 必ずインタフェースのwriteメソッドをオーバライドする必要がある
    public void write(){
        System.out.println("ボールペンで書く");
    }
}
