package interfaceSample.after;

/**
 * 万年筆クラス
 */
public class FountainPen implements Writable{
    @Override  // 必ずインタフェースのwriteメソッドをオーバライドする必要がある
    public void write(){
        System.out.println("万年筆で書く");
    }
}
