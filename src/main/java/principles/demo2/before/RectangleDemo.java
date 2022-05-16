package principles.demo2.before;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 16:12
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        resize(r);
        printLengthAndWidth(r);

        System.out.println("=========================");

        Square s = new Square();
        s.setLength(20);

        resize(s);
        printLengthAndWidth(s);
    }


    private static void resize(Rectangle rectangle){
        //把宽度增加到比长度长
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    private static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }

}
