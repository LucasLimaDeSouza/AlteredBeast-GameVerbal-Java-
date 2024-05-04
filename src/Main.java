import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "Luke";

    public static void main(String[] args) {
        String ele = name;
        Luke luke = new Luke(ele + ": ta correndo");



        luke.setAndar("CORRE DEVAGAR, TU VAI CAIR KKKK");
        luke.getAndar();
        luke.setBeasts("Merman");
        luke.setBeasts("Garuda");
        luke.setBeasts("Minotaur");
        luke.setBeasts("UWH");
        luke.deleteBeasts("UWH");
        luke.setBeasts("Dragon");
        luke.setBeasts("Grizzle Bear");
        luke.getLengthBeasts();
        Luke wolf = new Werewolf(ele + ": ta correndo", "Werewolf");



    }
}
