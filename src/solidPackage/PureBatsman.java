package solidPackage;

public class PureBatsman implements Player,Fielder{
    @Override
    public void feild() {
        System.out.println("PureBatsman  filding");
    }

    @Override
    public void bat() {
        System.out.println(" PureBatsman bating");
    }
}
