//Creare poi una classe menu che permetta in loop di ordinare il 
//piatto speciale selezionando tra una lista gli ingredienti public e 
//facendo inserire a mano gli ingredienti PRIVATE dopo aver stampato 
//una lista dei possibili casi ( solo quelli devono essere accettati ) 
//a quel punto calcolare il totale e riportare all'inizio
import java.util.ArrayList;
public class Menu {
    //attributi: piatto speciale (privato)

    private PiattoSpeciale piattoSpec;

    final int prezzoDiBase = 1;

    //costruttore
    public Menu(){
        this.piattoSpec = new PiattoSpeciale();
    }

    //funzione get

    public PiattoSpeciale getPiatto(){
        return piattoSpec;
    }

    //metodi : stampo lista di ingredienti privati
    //         stampo lista di ingredienti pubblici
    //         altre cose

    public void inserisciIngredientePub(String ingrediente){
        piattoSpec.setIngredientiPub(ingrediente);
    }

    public void inserisciIngredientePriv(String ingrediente){
        piattoSpec.setIngredientiPriv(ingrediente);
    }

    public void inserisciPrezzoPub(int prezzo){
        piattoSpec.setPrezziPub(prezzo);
    }

    public void inserisciPrezzoPriv(int prezzo){
        piattoSpec.setPrezziPriv(prezzo);
    }

    public void stampaIngredientiPub(){
        for(int i=0; i<piattoSpec.ingredientiPub.size(); i++){
            System.out.println(i + ". " + piattoSpec.ingredientiPub.get(i) + " prezzo:  " + piattoSpec.prezziPub.get(i));
        }
    }

    public void stampaIngredientiPriv(){
        for(int i=0; i<piattoSpec.getIngredientiPriv().size(); i++){
            System.out.println(i + ". " + piattoSpec.getIngredientiPriv().get(i) + " prezzo:  " + piattoSpec.getIngredientiPriv().get(i));
        }
    }
}
