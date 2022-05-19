package pattern.singleton.demo7;

import java.io.*;

/**
 * @author liaohongchen
 * @Description 利用序列化反序列化破坏单例  枚举方式无法破坏是由于是JVM层实现的
 * @date 2022/5/18 17:19
 */
public class Test {

    public static void main(String[] args) throws Exception {
        writeObject2File();
        Singleton singleton1 = readObjectFromFile();
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }


    public static Singleton readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\123\\test\\a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        return instance;
    }


    public static void writeObject2File() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\123\\test\\a.txt"));
        oos.writeObject(instance);
        oos.close();
    }



}
