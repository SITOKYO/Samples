package interfaceSample.after;

/**
 * シャープペンシルクラス
 */
public class MechanicalPencil implements Writable{
    @Override  // 必ずインタフェースのwriteメソッドをオーバライドする必要がある
    public void write(){
        System.out.println("シャープペンシルで書く");
    }
}
