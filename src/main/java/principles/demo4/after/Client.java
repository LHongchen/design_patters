package principles.demo4.after;

import principles.demo4.before.HeimaFafetyDoor;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 20:49
 */
public class Client {

    public static void main(String[] args) {
        HeimaFafetyDoor door = new HeimaFafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
