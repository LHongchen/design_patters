package principles.demo2.after;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 17:04
 */
public class Square implements Quadrilateral{

    private double size;

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getLength() {
        return size;
    }

    @Override
    public double getWidth() {
        return size;
    }
}
