import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int mida = 0;

        System.out.println("Hola");

        while(mida <= 0){ //control d'error
            System.out.println("Si us plau, posa la mida dels vectors que vols somar"); 
            if (lector.hasNextInt()) { // si el valor posat es un nombre enter, segueix
                 mida = lector.nextInt(); //mida = valor posat per l'usuari
            }
            else {
              lector.next(); //si valor posat no és um nombre enter, el programa segueix demanant fins a que posi.
            }
        }

        float[] vector1 = new float [mida];
        float[] vector2 = new float [mida]; 
        float[] vector3 = new float [mida]; //creació dels vectors

        System.out.println("Ara, has de posar els nombres del primer vector"); 
        
        for (int i = 0; i < vector1.length; i++){           
            while(!lector.hasNextFloat()){ // control d'error
                System.out.println("Posa un número, si us plau"); 
                lector.next(); //si valor posat no és um nombre, el programa segueix demanant fins a que posi
            }
            vector1[i] = lector.nextFloat(); //vector1[i] = valor posat per l'usuari
        }

        System.out.println("Ara, has de posar els nombres del segon vector"); 
        
        for (int i = 0; i < vector2.length; i++){           
            while(!lector.hasNextFloat()){ // control d'error
                System.out.println("Posa un número, si us plau"); 
                lector.next(); //si valor posat no és um nombre, el programa segueix demanant fins a que posi
            }
            vector2[i] = lector.nextFloat(); //vector2[i] = valor posat per l'usuari
        }

        System.out.println("La suma és: "); 

        for(int i = 0; i < vector3.length; i++){
            vector3[i] = vector1[i] + vector2[i]; //suma i emmagatzema en altre vector
            System.out.print(vector3[i] + " "); //imprime
        }

    }
}
