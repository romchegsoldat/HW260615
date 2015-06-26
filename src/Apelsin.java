import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Created by user025 on 6/19/2015.
 */
public class Apelsin {
    //это тестовый коментарий
    String sort;
    int ves;

    public Apelsin(String sort, int ves) {
        this.sort = sort;
        this.ves = ves;
    }

    @Override
    public String toString() {
        return "Eto apelsin sorta " + sort + "  vesom " + ves + "\n";
    }

    public static void main(String[] args) {

        Apelsin apelsin1 = new Apelsin("TursiaX", 1);
        Apelsin apelsin2 = new Apelsin("TursiaXX", 4);
        Apelsin apelsin3 = new Apelsin("TursiaXXX", 2);
        Apelsin apelsin4 = new Apelsin("TursiaLX", 3);
        Apelsin apelsin5 = new Apelsin("TursiaL", 5);

        ArrayList<Apelsin> orange = new ArrayList<>();
        orange.add(apelsin1);
        orange.add(apelsin2);
        orange.add(apelsin3);
        orange.add(apelsin4);
        orange.add(apelsin5);
        System.out.println(orange);

        Collections.sort(orange, new myComparator());


        Vector<Apelsin> vec1 = new Vector<>();
        Vector<Apelsin> vec2 = new Vector<>();
        Vector<Apelsin> vec3 = new Vector<>();
        Vector<Apelsin> vec4 = new Vector<>();
        Vector<Apelsin> vec5 = new Vector<>();
        vec1.add(apelsin1);
        vec2.add(apelsin2);
        vec3.add(apelsin3);
        vec4.add(apelsin4);
        vec5.add(apelsin5);
        vec1 = vec2;
        System.out.println(vec2);


        System.out.println(orange);
    }
}

class myComparator implements Comparator<Apelsin> {

    @Override
    public int compare(Apelsin apelsin, Apelsin t1) {
        return apelsin.ves - t1.ves;


    }
}
