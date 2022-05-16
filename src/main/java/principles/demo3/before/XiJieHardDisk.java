package principles.demo3.before;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 20:02
 */
public class XiJieHardDisk {

    public void save(String data){
        System.out.println("使用希捷硬盘存储数据:"+data);
    }

    public String get(){
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
