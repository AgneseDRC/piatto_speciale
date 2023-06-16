//Creare una classi Piatto Speciale che ha ingredienti di tipo PRIVATE e ingredienti pubblic 
//( es: un panino normale o di sesamo ) e un prezzo specifico per ognuno di loro 
//( es ingr1 = 2 euro ) + una base di fisso ( prezzo = 1 euro )

import java.util.ArrayList;

public class PiattoSpeciale {
    public ArrayList<String> ingredientiPub;// lista di ingedienti pubblici
    private ArrayList<String> ingredientiPriv;// lista di ingredienti privati
    private ArrayList<Integer> prezziPriv;// lista di prezzi dei privati
    public ArrayList<Integer> prezziPub;// lista di prezzi dei pubblici

    // costruttore
    public PiattoSpeciale() {
        this.ingredientiPriv = new ArrayList<>();
        this.ingredientiPub = new ArrayList<>();
        this.prezziPriv = new ArrayList<>();
        this.prezziPub = new ArrayList<>();
    }

    // METODI GET
    public ArrayList<String> getIngredientiPriv() {
        return ingredientiPriv;
    }

    /*
     * public ArrayList<String> getIngredientiPriv(){
     * return ingredientiPub;
     * }
     */

    public ArrayList<Integer> getPrezziPriv() {
        return prezziPriv;
    }

    /*
     * public ArrayList<Integer> getPrezziPub(){
     * return prezziPub;
     * }
     */



    // METODI SET : aggiungo una cosa alla volta o tutta la lista?


    public void setIngredientiPriv(String ingrediente) {
        this.ingredientiPriv.add(ingrediente);
    }

    public void setIngredientiPub(String ingrediente) {
        this.ingredientiPub.add(ingrediente);
    }


    public void setPrezziPriv(int prezzo) {
        this.prezziPriv.add(prezzo);
    }

    public void setPrezziPub(int prezzo) {
        this.prezziPub.add(prezzo);
    }

}
