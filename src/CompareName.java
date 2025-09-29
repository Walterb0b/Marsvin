import java.util.Comparator;

public class CompareName implements Comparator<Marsvin> {
    @Override
    public int compare (Marsvin m1, Marsvin m2){
        return m1.getName().compareToIgnoreCase(m2.getName());
    }
}
