package principles.demo2.before;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 16:11
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
