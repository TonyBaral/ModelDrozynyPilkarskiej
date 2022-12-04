public class Trener extends Osoba{
    int staz;

    public Trener(String imie, String nazwosko, int wiek, String specjalizacja, int staz) {
        super(imie, nazwosko, wiek, specjalizacja);
        this.staz = staz;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    @Override
    public String toString() {
        return "Trener{" +
                "staz=" + staz +
                ", imie='" + imie + '\'' +
                ", nazwosko='" + nazwosko + '\'' +
                ", wiek=" + wiek +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
