package UF2.CalculArees;

import java.util.Scanner;

public class circle {
    public double area = 0;
    public Scanner lector = new Scanner(System.in);
    public double circleFormula() { //cas en que la figura = "cercle"
        System.out.println("Quin es el radi del cercle?");
        double r = lector.nextDouble();
        area = Math.pow(r, 2) * Math.PI; //funció matemàtica que eleva a 2 el radi e Math.PI = PI.
        return area;
    }
}
