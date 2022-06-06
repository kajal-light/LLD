package polymorphism;

public class Ascending implements Comparator{
    @Override
    public boolean compare(int a, int b) {
        return a<b;
    }
}
