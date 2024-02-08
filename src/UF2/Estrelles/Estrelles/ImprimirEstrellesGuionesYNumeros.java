package UF2.Estrelles.Estrelles;
public class ImprimirEstrellesGuionesYNumeros{
    public static void main (String[] args){
        ImprimirEstrellesGuionesYNumeros program =  new ImprimirEstrellesGuionesYNumeros();
        program.inici();
    }


    private void inici() {
        ImprimirEstrelles(5);
        ImprimirGuions(7);
        ImprimirNumeros(7,3);
    }

    private void ImprimirNumeros(int numero, int veces) {
        for(int i = 0; i < veces; i++){
            System.out.print(numero);
        }
        System.out.println();
    }

    private void ImprimirGuions(int guions) {
        for(int i = 0; i < guions; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    private void ImprimirEstrelles(int estrelles) {
        for(int i = 0; i < estrelles; i++){
            System.out.print("*");
        }
        System.out.println();
    }   
}