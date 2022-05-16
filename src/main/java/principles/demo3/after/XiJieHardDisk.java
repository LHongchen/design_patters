package principles.demo3.after;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 20:02
 */
public class XiJieHardDisk implements HardDisk {

    @Override
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据:"+data);
    }

    @Override
    public String get(){
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
