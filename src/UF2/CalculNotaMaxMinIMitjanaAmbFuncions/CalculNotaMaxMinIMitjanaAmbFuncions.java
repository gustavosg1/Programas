package UF2.CalculNotaMaxMinIMitjanaAmbFuncions;
import java.util.Scanner;

public class CalculNotaMaxMinIMitjanaAmbFuncions {
    private Scanner lector = new Scanner(System.in);
    private int[] notes = new int[5];
    private int ellecio = 0;
    private double max = 0;
    private double min = 100;
    private double mitja = 0;

    public static void main(String [] args){
        CalculNotaMaxMinIMitjanaAmbFuncions programa = new CalculNotaMaxMinIMitjanaAmbFuncions();
        programa.inici();

    }

    public void inici(){
        llegirDades();
        mostrarMenu();
        if(ellecio == 1){
            calculaMax();
        }
        else if(ellecio == 2){
            calculaMin();
        }
        else if(ellecio == 3){
            calculaMitj();
        }
        imprimir();
    }



    public int[] llegirDades() {

        System.out.println("Hola. Si us plau, diguis les 5 notes: ");

        for (int i = 0; i < notes.length; i++){
            while(!lector.hasNextInt()){ // control d'error
                System.out.println("Posa un número, si us plau");
                lector.next(); //si valor posat no és um nombre, el programa segueix demanant fins a que posi
            }
            notes[i] = lector.nextInt(); //vector[i] = valor posat per l'usuari7
        }
        return notes;
    }

    public int mostrarMenu() {
        System.out.println("Que vols calcular? Tria una de les opcions abaix:");
        System.out.println("1 - Màxim");
        System.out.println("2 - Mínim");
        System.out.println("3 - Mitjana");
        System.out.println("Escriu el nombre de 1 a 3");


        while(ellecio < 1 || ellecio > 3){
            if(lector.hasNextInt()) {
                ellecio = lector.nextInt(); //recollim la dada a la variable edat
                if(ellecio < 1 || ellecio > 3){
                    System.out.println("Si us plau, escriu un nombre entre 1 i 3.");
                }
            }
            else{
                System.out.println("Si us plau, escriu um nombre entre 1 i 3");
                lector.next();
            }
        }
        return ellecio;
    }


    public double calculaMax() {
        for (int i = 0; i < notes.length; i++) {
            if (max < notes[i]) {
                max = notes[i];
            }
        }
        return max;
    }

    public double calculaMin(){
        for (int i = 0; i < notes.length; i++) {
            if (min > notes[i]) {
                min = notes[i];
            }
        }
    return min;
    }

    public double calculaMitj() {
        double sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum = notes[i] + sum;
        }
        mitja = sum / notes.length;
        return mitja;
    }

    public void imprimir() {
        System.out.print("Has triat calcular " );
        if(ellecio == 1){
            System.out.print("el max. La respost és " + max);
        }
        else if(ellecio == 2){
            System.out.print("el min. La respost és " + min);
        }
        else if(ellecio == 3){
            System.out.print("la mitja. La respost és " + mitja);
        }
    }

}
