package UF2.SegonMesGran;
import java.util.Scanner;

public class SegonMesGranSenseFuncio {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int mida = 0; //variable mida del vector
        float max1 = 0;
        float max2 = 0;
        

        System.out.println("Hi");

        while(mida <= 0){ //control d'error
            System.out.println("Si us plau, posa la mida del vector"); 
            if (lector.hasNextInt()) { // si el valor posat es un nombre enter, segueix
                 mida = lector.nextInt(); //mida = valor posat per l'usuari
            }
            else {
              lector.next(); //si valor posat no és um nombre enter, el programa segueix demanant fins a que posi.
            }
        }

        float[] vector = new float [mida]; //creació del vector
        
        System.out.println("Ara, has de posar els nombres del vector"); 
        
        for (int i = 0; i < vector.length; i++){           
            while(!lector.hasNextFloat()){ // control d'error
                System.out.println("Posa un número, si us plau"); 
                lector.next(); //si valor posat no és um nombre, el programa segueix demanant fins a que posi
            }
            vector[i] = lector.nextFloat(); //vector[i] = valor posat per l'usuari7
        }

        for(int i = 0; i < vector.length; i++){
            if(max1 < vector[i]){
                max1 = vector[i];
            }
        }
        
        for(int i = 0; i < vector.length; i++){
            float j = vector[i];
            if(vector[i] == max1){
            }
            else if(max2 < vector[i]){
                max2 = vector[i];
            }
        }
            
        System.out.println("El segon valor mès gran és: " + max2);
        
        
    }
}