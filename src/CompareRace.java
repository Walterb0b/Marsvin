import java.util.Comparator;

public class CompareRace implements Comparator<Marsvin> {
    @Override
    public int compare(Marsvin m1, Marsvin m2){
        return m1.getRace().compareToIgnoreCase(m2.getRace());
    }
}
