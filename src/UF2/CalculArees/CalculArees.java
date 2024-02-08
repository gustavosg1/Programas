package UF2.CalculArees;
import java.util.Scanner; //importem la biblioteca Scanner per a poder recolir dades de la temrinal

public class CalculArees {
  private Scanner lector = new Scanner(System.in);
  private double area = 0;
  private String figura = "";

  public static void main(String args[]) {
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
    boolean valido = true;
    Benvingudes();
    while(!figura.equalsIgnoreCase("FI")){
      if (figura.equalsIgnoreCase("triangle")) {
        triangle();
        valido = true;
      } else if (figura.equalsIgnoreCase("quadrat")) {
        quadrat();
        valido = true;
      } else if (figura.equalsIgnoreCase("rectangle")) {
        rectangle();
        valido = true;
      } else if (figura.equalsIgnoreCase("trapezi")) {
        trapezi();
        valido = true;
      } else if (figura.equalsIgnoreCase("rombe")) {
        rombe();
        valido = true;
      } else if (figura.equalsIgnoreCase("paralelogram")) {
        paralelogram();
        valido = true;
      } else if (figura.equalsIgnoreCase("cercle")) {
        circle();
        valido = true;
      }
      else if(figura.equalsIgnoreCase("FI")){
        return;
      }
      else{
        valido = false;
      }

      if(valido){
        System.out.println("L'area del " + figura + " es " + area + "\n");  //fem el system out per imprimir a terminal
        Benvingudes();
      }
      else{
        System.out.println("Aquesta no és una figura vàlida.\n");
        Benvingudes();
      }

    }
  }

  public void Benvingudes(){
    System.out.println("De quina figura vols calcular l'area?");
    System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle."); //demanen a l'usuari la figura que vol calcular l'àera
    System.out.println("Per a terminar el programa = FI");
    figura = lector.nextLine(); //recollim la dada entrada per terminal
  }

  public double triangle() { //cas e que la figura sigui 'triangle'
    double b = 23.0;
    double h = 8.0;
    area = (b * h) / 2;
    return area;
  }

  public double quadrat() { //cas en que la figura = "quadrat"
    double r = 37.0;
    area = Math.pow(r, 2); //funció matemàtica que eleva a 2 el radi
    return area;
  }

  public double rectangle() {//cas en que la figura = "rectangle"
    double a = 68.0;
    double b = 39.0;
    area = a * b;
    return area;
  }

  public double trapezi() { //cas en que la figura = "trapezi"
    double a = 35.0;
    double b = 16.0;
    double h = 5.0;
    area = ((a * b) * h) / 2;
    return area;
  }

  public double rombe() {//cas en que la figura = "rombe"
    double dM = 75.0;
    double dm = 30.0;
    area = (dM * dm) / 2;
    return area;
  }

  public double paralelogram() {    //cas en que la figura = "paralelogram"
    double b = 45.0;
    double h = 13.0;
    area = b * h;
    return area;
  }

  public double circle() { //cas en que la figura = "cercle"
    System.out.println("Quin es el radi del cercle?");
    double r = lector.nextDouble();
    area = Math.pow(r, 2) * Math.PI; //funció matemàtica que eleva a 2 el radi e Math.PI = PI.
    return area;
  }
}