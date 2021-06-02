public class SwitchApp {
    public static void main(String[] args) {
        String season = "Summe";


        switch (season){
            case "Spring": System.out.println("birds are singing");break;
            case "Summer": System.out.println("sunshine");break;
            case "Fall": System.out.println("halloween");break;
            case "Winter": System.out.println("snow");break;
            default:
                System.out.println("you gav wrong season: "+season);

        }
    }
}
