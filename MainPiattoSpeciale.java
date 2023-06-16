//Creare una classi Piatto Speciale che ha ingredienti di tipo PRIVATE e ingredienti pubblic 
//( es: un panino normale o di sesamo ) e un prezzo specifico per ognuno di loro 
//( es ingr1 = 2 euro ) + una base di fisso ( prezzo = 1 euro )

//Creare poi una classe menu che permetta in loop di ordinare il 
//piatto speciale selezionando tra una lista gli ingredienti public e 
//facendo inserire a mano gli ingredienti PRIVATE dopo aver stampato 
//una lista dei possibili casi ( solo quelli devono essere accettati ) 
//a quel punto calcolare il totale e riportare all'inizio

import java.util.Scanner;
import java.util.ArrayList;

public class MainPiattoSpeciale {
    public static void main(String[] args) {

        // variabili usate
        boolean flag = true;
        boolean flag1 = true;
        ArrayList<String> ingredientiScelti =new ArrayList<>();
        int totale = 0;
        Scanner scanner = new Scanner(System.in); // per string
        Scanner scanner1 = new Scanner(System.in);// per int

        // Dichiaro il menu

        Menu menu = new Menu();

        // compongo gli elementi del menu

        while (flag) {
            System.out.println(" Vuoi inserire un ingrediente base? ");
            System.out.println("1. sì ");
            System.out.println("2. no");
            int scelta = scanner1.nextInt();
            if (scelta == 1) {
                System.out.print("\n Nome ingrediente : ");
                String nome = scanner.nextLine();
                System.out.println(nome);
                menu.inserisciIngredientePub(nome);
                System.out.print(" prezzo ingrediente : ");
                int prezzo = scanner1.nextInt();
                menu.inserisciPrezzoPub(prezzo);
            }else{
                flag=false;
            }
        }

        //rimetto flag a true per un altro ciclo
        flag=true;

        while (flag) {
            System.out.println(" Vuoi inserire un ingrediente speciale? ");
            System.out.println("1. sì ");
            System.out.println("2. no");
            int scelta = scanner1.nextInt();
            if (scelta == 1) {
                System.out.print("\n Nome ingrediente : ");
                String nome = scanner.nextLine();
                menu.inserisciIngredientePriv(nome);
                System.out.print(" prezzo ingrediente : ");
                int prezzo = scanner1.nextInt();
                menu.inserisciPrezzoPriv(prezzo);
            }else{
                flag=false;
            }
        }

        // scelgo un piatto ad ogni iterazione

        do {
            System.out.println(" Componi il tuo piatto speciale ");
            // stampo ingredienti base
            System.out.println("\n INGREDIENTI BASE : ");
            menu.stampaIngredientiPub();

            // stampo ingredienti speciali
            System.out.println("\n INGREDIENTI SPECIALI : ");
            menu.stampaIngredientiPriv();

            //aggiorno flag
            flag=true;

            do {
                System.out.println(" Vuoi selezionare un ingrediente base? ");
                System.out.println("1. sì");
                System.out.println("2. no");
                int scelta = scanner1.nextInt();

                switch(scelta){
                    case 1:
                        System.out.println("\n scegli un ingrediente base : ");
                        menu.stampaIngredientiPub();
                        int scelta1 = scanner1.nextInt(); //indice dell'ingrediente scelto
                        ingredientiScelti.add(menu.getPiatto().ingredientiPub.get(scelta1));
                        totale+=menu.getPiatto().prezziPub.get(scelta1) + menu.prezzoDiBase;
                        break;
                    case 2:
                        flag=false;
                        break;
                    default:
                        System.out.println(" comando non valido, riprovare ");
                        break;
                }

            } while (flag);

             flag=true;

            do {
                System.out.println(" Vuoi selezionare un ingrediente speciale? ");
                System.out.println("1. sì");
                System.out.println("2. no");
                int scelta = scanner1.nextInt();

                switch(scelta){
                    case 1:
                        System.out.println("\n scegli un ingrediente speciale : ");
                        menu.stampaIngredientiPriv();
                        int scelta1 = scanner1.nextInt(); //indice dell'ingrediente scelto
                        ingredientiScelti.add(menu.getPiatto().getIngredientiPriv().get(scelta1));
                        totale+=menu.getPiatto().getPrezziPriv().get(scelta1) + menu.prezzoDiBase;
                        break;
                    case 2:
                        flag=false;
                        break;
                    default:
                        System.out.println(" comando non valido, riprovare ");
                        break;
                }

            } while (flag);
            
            // stampo somma totale
            System.out.println(" hai speso in totale : " + totale);

            // chiedo se voglio scegliere un altro piatto speciale
            System.out.println(" Vuoi comporre un nuovo piatto? ");
            System.out.println("1. sì");
            System.out.println("2. no");
            int scelta2 = scanner1.nextInt();
             switch(scelta2){
                case 1:
                    break;
                case 2:
                    System.out.println(" Grazie per aver usato il menu a presto! ");
                    flag1=false;
                    break;
                default:
                    System.out.println(" comando non valido ");
                    break;
             }

        } while (flag1);

    }

    

}
