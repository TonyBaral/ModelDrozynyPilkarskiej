public class Zawodnik {
    int nrKoszulki;

    public Zawodnik(int nrKoszulki) {
        this.nrKoszulki = nrKoszulki;
    }

    public int getNrKoszulki() {
        return nrKoszulki;
    }

    public void setNrKoszulki(int nrKoszulki) {
        this.nrKoszulki = nrKoszulki;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "nrKoszulki=" + nrKoszulki +
                '}';
    }
}
