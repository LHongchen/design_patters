package principles.demo5;

/**
 * @author liaohongchen
 * @Description
 * @date 2022/5/14 21:07
 */
public class Client {

    public static void main(String[] args) {

        Agent agent = new Agent();

        Star star = new Star("liaohongchen");
        agent.setStar(star);

        Fans fans = new Fans("张小狗");
        agent.setFans(fans);

        Company company = new Company("xinshu");
        agent.setCompany(company);

        agent.meeting();

        agent.business();

    }

}
