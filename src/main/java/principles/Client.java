package principles;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/8 23:37
 */
public class Client {
    public static void main(String[] args) {

        SougoInput input = new SougoInput();

//        DefalultSkin skin = new DefalultSkin();
        HeimaSkin skin = new HeimaSkin();

        input.setSkin(skin);

        input.display();

    }
}
