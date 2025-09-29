import java.util.Comparator;

public class CompareAppetite implements Comparator<Marsvin> {
    @Override
    public int compare(Marsvin m1, Marsvin m2){
        return Integer.compare(m1.getFood(), m2.getFood());
    }
}
