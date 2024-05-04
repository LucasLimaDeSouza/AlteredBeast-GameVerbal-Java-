import java.util.ArrayList;

public class Werewolf extends Luke {
    private String rasgar;
    private String correr;
    private String beast;
    ArrayList<String> Beasts = new ArrayList<String>();
    public Werewolf(String rasgar, String correr) {
        super(correr);

        this.rasgar = rasgar;
        this.correr = correr;
        Beasts.add(beast);
    }
//    @Override
//    public String call() {
//        return "CARALHO MENOO FOI? FOI!";
//    }

    public void setRasgar(String rasgar) {
        this.rasgar = rasgar;
    }

    public void getRasgar() {
        System.out.println(rasgar);
    }

    @Override //PRECISA SER IGUAL AO METODO DA CLASSE PAI
    public void setAndar(String andar) {
        this.correr = andar;
    }
    @Override //PRECISA SER IGUAL AO METODO DA CLASSE PAI
    public void getAndar() {
        System.out.println(correr);
    }

}
