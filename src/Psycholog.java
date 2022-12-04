public class Psycholog extends  Osoba{
    public Psycholog(String imie, String nazwosko, int wiek, String specjalizacja) {
        super(imie, nazwosko, wiek, specjalizacja);
    }

    @Override
    public String toString() {
        return "Psycholog{" +
                "imie='" + imie + '\'' +
                ", nazwosko='" + nazwosko + '\'' +
                ", wiek=" + wiek +
                ", specjalizacja='" + specjalizacja + '\'' +
                '}';
    }
}
