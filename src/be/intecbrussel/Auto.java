package be.intecbrussel;

public class Auto {
    private static final Object auto = ;
    private final Garage garage;
    private String merknaam;
//    private Garage garage = new Garage("garage niet gekend");

    public Auto(String merknaam){
        this.merknaam = merknaam;
    }
    public Auto(String merknaam, Garage garage){
        this.merknaam = merknaam;
        this.garage = garage;
    }
        Auto
    public Auto(Auto auto){

        this(auto.merknaam, auto.garage);
    }

    public Auto(String vw_golf, String bhz456) {
        this(auto.merknaam);
    }

    public String getMerknaam(){
        return merknaam;
    }

//    public Garage getGarage(){
//        return garage;
//    }
//    public void setGarage(Garage garage) {
//        this.garage = garage;
//    }

    public String toString(){
        return "Auto: " + merknaam + " " + garage.toString();

    }

    public String geefGas(int i) {
        return "i";

    }

    public void toonToerental() {
        return ;
    }

    public void rem() {

        return;
    }
}
