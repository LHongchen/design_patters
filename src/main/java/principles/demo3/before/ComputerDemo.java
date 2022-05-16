package principles.demo3.before;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 20:09
 */
public class ComputerDemo {

    public static void main(String[] args) {
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        Computer c = new Computer();
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);
        c.run();
    }
}
