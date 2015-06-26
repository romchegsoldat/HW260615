import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Sklad {

    int ploscha;
    String nameSklad;
    String adres;
    String mol; //mat.otvet.litso
    private static Set<Tovar> tovars = new TreeSet<>();

    public Sklad(int ploscha, String nameSklad, String adres, String mol) {

        this.ploscha = ploscha;
        this.nameSklad = nameSklad;
        this.adres = adres;
        this.mol = mol;
    }

    public void rotateKladovschik(String nameKladovschik) {
        this.mol = nameKladovschik;
    }

    public void addTovarToSklad(Tovar tovar) {
        tovars.add(tovar);
    }

    public static void main(String[] args) {
        Sklad sklad1 = new Sklad(100, "Sklad 1", "Hersonskoe shosse", "Petrov");

        Tovar tovar1 = new Tovar("Galuzi", "Zorro", new Date(), "Okonnie", "kv.m", 10000, 24, 50);
        Tovar tovar2 = new Tovar("Galuzi", "Zorro", new Date(), "Okonnie", "kv.m", 12000, 24, 50);
        Tovar tovar3 = new Tovar("Galuzi", "Zorro", new Date(), "Okonnie", "kv.m", 14000, 24, 50);
        Tovar tovar4 = new Tovar("Galuzi", "Batman", new Date(), "Okonnie", "kv.m", 8000, 12, 150);
        Tovar tovar5 = new Tovar("Galuzi", "Vatman", new Date(), "Okonnie", "kv.m", 18000, 36, 30);

        sklad1.addTovarToSklad(tovar1);
        sklad1.addTovarToSklad(tovar2);
        sklad1.addTovarToSklad(tovar3);
        sklad1.addTovarToSklad(tovar4);
        sklad1.addTovarToSklad(tovar5);

        ArrayList<Tovar> magazin = new ArrayList<>();
        magazin.add(tovar1);

        Collections.sort(magazin, new myComparator());

        for (Tovar t : tovars) {
            System.out.println(t.nameTovar + " " + "eto tovar s cenoy" + " " + t.tsena);
        }
    }
}
