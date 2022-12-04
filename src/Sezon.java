public class Sezon {
    String terminarz;
    int iloscDruzyn;
    int iloscZagranychMeczy;
    int punkty;

    public Sezon(String terminarz, int iloscDruzyn, int iloscZagranychMeczy, int punkty) {
        this.terminarz = terminarz;
        this.iloscDruzyn = iloscDruzyn;
        this.iloscZagranychMeczy = iloscZagranychMeczy;
        this.punkty = punkty;
    }

    public String getTerminarz() {
        return terminarz;
    }

    public void setTerminarz(String terminarz) {
        this.terminarz = terminarz;
    }

    public int getIloscDruzyn() {
        return iloscDruzyn;
    }

    public void setIloscDruzyn(int iloscDruzyn) {
        this.iloscDruzyn = iloscDruzyn;
    }

    public int getIloscZagranychMeczy() {
        return iloscZagranychMeczy;
    }

    public void setIloscZagranychMeczy(int iloscZagranychMeczy) {
        this.iloscZagranychMeczy = iloscZagranychMeczy;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    @Override
    public String toString() {
        return "Sezon{" +
                "terminarz='" + terminarz + '\'' +
                ", iloscDruzyn=" + iloscDruzyn +
                ", iloscZagranychMeczy=" + iloscZagranychMeczy +
                ", punkty=" + punkty +
                '}';
    }
}
