import java.util.ArrayList;

public class Luke {
    private String correr;
//    private String beast;
    ArrayList<String> Beasts = new ArrayList<String>();


    public Luke(String correr) { //Constructor
        this.correr = correr;

    }

    public String call() {
        return null;
    }

    public void setAndar(String correr) {
        this.correr = correr;
    }

    public void getAndar() {
        System.out.println(correr);
    }

    public void setBeasts(String beast) {
        Beasts.add(beast);
    }
    public void getLengthBeasts() {

        ArrayList<String> Feras = new ArrayList<>();

        for (String beast : Beasts) {
            Feras.add(beast);
        }

        for (String beast : Feras) {

            System.out.println(beast);

        }
    }


    public void deleteBeasts(String beast) {
        Beasts.remove(beast);
    }

//    public String call() {
//        return null;
//    }
}



