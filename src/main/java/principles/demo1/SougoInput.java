package principles.demo1;

/**
 * @author liaohongchen
 * @Description 搜狗输入法
 * @date 2022/5/8 23:19
 */
public class SougoInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        this.skin.display();
    }
}
