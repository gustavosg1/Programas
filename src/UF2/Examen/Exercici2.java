import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int mida = 0; //variable mida del vector
        float valor = 0; //variable valor a ser cercat
        boolean proba = false; //variable per a probar si el valor és igual a un número del vector
        float posició = -1; //variable posició per a saber en quina posició dins del vector va ser trobat el valor posat per l'usuari

        System.out.println("Hola");

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

        System.out.println("Insereix un valor perquè veiem si hi ha en el vector");

        while(!lector.hasNextFloat()){ // control d'error
            System.out.println("Posa un número, si us plau"); 
            lector.next(); //si valor posat no és um nombre, el programa segueix demanant fins a que posi
        }
        valor = lector.nextFloat(); //variable valor definida igual valor posat per l'usuari

        for(int i = 0; i < vector.length && !proba; i++){
            if(valor == vector[i]){ 
                proba = true; // si es troba el valor posat per l'usuari, termina la cerca
            }
            posició++; //variable posició es incrementa per a cada volta    
        }

        if(proba){
            System.out.println("El valor posat ha sigut trobat en la posició: " + posició++);
        }
        else{
            System.out.println("No s'ha trobat el valor inserit");
        }

    }
}



        



