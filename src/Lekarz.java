public class Lekarz extends Osoba{
    public Lekarz(String imie, String nazwosko, int wiek, String specjalizacja) {
        super(imie, nazwosko, wiek, specjalizacja);
    }

    @Override
    public String toString() {
        return "Lekarz{" +
                "imie='" + imie + '\'' +
                ", nazwosko='" + nazwosko + '\'' +
                ", wiek=" + wiek +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
