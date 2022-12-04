public class Main {
    public static void main(String[] args) {

Lekarz lekarz = new Lekarz("Jan","Kowalski",46,"Playometryka");
Trener trener = new Trener("Oskar","Kukiewicz",52,"Trener" ,14);
Psycholog psycholog = new Psycholog("Grzegorz", "Hyzy", 30, "Psycholog sportowy");
Druzyna korona = new Druzyna("Korona", "Kielce","CK");
Sezon pierwszy = new Sezon("2022",18,2,3);
Zawodnik zawodnik = new Zawodnik(9);

        EnumTest e =  new EnumTest(Pozycja.OBRONCA);
        e.who();

        System.out.println(lekarz);
        System.out.println(trener);
        System.out.println(psycholog);
        System.out.println(korona);
        System.out.println(pierwszy);
        System.out.println(zawodnik);
    }
}