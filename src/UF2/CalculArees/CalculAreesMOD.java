package UF2.CalculArees;

import UF2.RegistreNotes.CalculArrayReals;

import java.util.Scanner;

public class CalculAreesMOD {

    private String figura = "";
    private Scanner lector = new Scanner(System.in);

        public static void main(String args[]) {
            CalculAreesMOD programa = new CalculAreesMOD();
            programa.inici();
        }

        public void inici() {
            circle circle = new circle();
            paralelogram paralelogram = new paralelogram();
            quadrat quadrat = new quadrat();
            rectangle rectangle = new rectangle();
            rombe rombe = new rombe();
            trapezi trapezi = new trapezi();
            triangle triangle = new triangle();
            double area = 0;



            boolean valido = true;
            Benvingudes();
            while(!figura.equalsIgnoreCase("FI")){
                if (figura.equalsIgnoreCase("triangle")) {
                    area = triangle.triangleFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("quadrat")) {
                    area = quadrat.quadratFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("rectangle")) {
                    area = rectangle.rectangleFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("trapezi")) {
                    area = trapezi.trapeziFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("rombe")) {
                    area = rombe.rombeFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("paralelogram")) {
                    area = paralelogram.paralelogramFormula();
                    valido = true;
                }
                else if (figura.equalsIgnoreCase("cercle")) {
                    area = circle.circleFormula();
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
}
