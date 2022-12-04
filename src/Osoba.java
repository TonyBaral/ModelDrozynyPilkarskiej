public class Osoba {

String imie;
String nazwosko;
int wiek;
String specjalizacja;

    public Osoba(String imie, String nazwosko, int wiek, String specjalizacja) {
        this.imie = imie;
        this.nazwosko = nazwosko;
        this.wiek = wiek;
        this.specjalizacja = specjalizacja;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwosko() {
        return nazwosko;
    }

    public void setNazwosko(String nazwosko) {
        this.nazwosko = nazwosko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwosko='" + nazwosko + '\'' +
                ", wiek=" + wiek +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
