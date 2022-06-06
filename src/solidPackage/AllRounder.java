package solidPackage;

public class AllRounder implements Player,Fielder,Bowler {
    @Override
    public void bowl() {
        System.out.println(" AllRounder bowl     ");
    }

    @Override
    public void feild() {
        System.out.println(" AllRounder fild");
    }

    @Override
    public void bat() {
        System.out.println(" AllRounder bat");
    }
}
