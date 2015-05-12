/**
 * Created by RockStar on 5/12/2015.
 */

public class TestRobot
{
    public static void main(String[] args)
    {
        asimo24 unit = new asimo24(30, 150, 1000, 5);
        unit.CetakSpesifikasi();
        unit.upgrade(20);
        unit.upgrade(25);
    }
}
