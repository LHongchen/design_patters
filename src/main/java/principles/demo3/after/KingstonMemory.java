package principles.demo3.after;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 20:05
 */
public class KingstonMemory implements  Memory{

    @Override
    public void save(){
        System.out.println("使用金士顿作为内存条");
    }

}
