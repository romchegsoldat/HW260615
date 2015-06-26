import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Tovar implements Comparable<Tovar> {

    String nameTovar;
    String proizvoditel;
    Date dateProizvodstva;
    String category;
    String edinitsa;
    int tsena;
    int godnost;
    int kolichestvoObschee;


    public Tovar(String nameTovar, String proizvoditel, Date dateProizvodstva, String category, String edinitsa, int tsena,
                 int godnost, int kolichestvoObschee) {

        this.nameTovar = nameTovar;
        this.proizvoditel = proizvoditel;
        this.dateProizvodstva = dateProizvodstva;
        this.category = category;
        this.edinitsa = edinitsa;
        this.tsena = tsena;
        this.godnost = godnost;
        this.kolichestvoObschee = kolichestvoObschee;


    }

    @Override
    public int compareTo(Tovar tovar) {
        if (this.nameTovar.equals(nameTovar) &
                this.proizvoditel.equals(tovar.proizvoditel) &
                this.tsena == tovar.tsena) {
            return 0;
        } else return 10;

    }
}

class myComparator implements Comparator<Tovar> {

    @Override
    public int compare(Tovar tovar, Tovar t1) {
        return tovar.tsena - t1.tsena;


    }
}