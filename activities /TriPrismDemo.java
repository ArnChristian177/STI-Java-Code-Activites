//Triangle Prism
//coded by Arn
//
import java.text.DecimalFormat;
class TriPrism<T extends Number> {
    private T length;
    private T base;
    private T height;
    public void setLength(T length) {
        this.length = length;
    }
    public void setBase(T base) {
        this.base = base;
    }
    public void setHeight(T height) {
        this.height = height;
    }
    public T getLength() {
        return length;
    }
    public T getBase() {
        return base;
    }
    public T getHeight() {
        return height;
    }
    public double totalOfVolume() {
        double volume = length.doubleValue() * (0.5 * base.doubleValue() * height.doubleValue());
        return volume;
    }
}
public class TriPrismDemo {
    public static void main(String[] args) {
        //Instantiation
        DecimalFormat df = new DecimalFormat("0.00");
        TriPrism<Integer> tp1 = new TriPrism<>();
        TriPrism<Double> tp2 = new TriPrism<>();
        
        //Triangle Prism 1
        tp1.setLength(10);
        tp1.setBase(7);
        tp1.setHeight(5);
        //Output
        System.out.println("Triangle Prism 1");
        System.out.println("Length: " + tp1.getLength());
        System.out.println("Base: " + tp1.getBase());
        System.out.println("Height: " + tp1.getHeight());
        System.out.println("The volume of triangular prism is: " + tp1.totalOfVolume());
        
        System.out.println();
        
        //Triangle Prism 2
        tp2.setLength(9.10);
        tp2.setBase(6.25);
        tp2.setHeight(4.20);
        //Output
        System.out.println("Triangle Prism 2");
        System.out.println("Length: " + df.format(tp2.getLength()));
        System.out.println("Base: " + df.format(tp2.getBase()));
        System.out.println("Height: " + df.format(tp2.getHeight()));
        System.out.println("The volume of triangular prism is: " + tp2.totalOfVolume());
    }
}
