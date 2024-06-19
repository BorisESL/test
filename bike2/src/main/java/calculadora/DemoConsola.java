package calculadora;

import calculadora.stock.CalculadoraSimple;

import java.util.ArrayList;
import java.util.List;

public class DemoConsola {
    public static void main(String[] args) {

    List<Integer> inputs = new ArrayList<Integer>();
    inputs.add(7);
    inputs.add(26);
    inputs.add(39);
    inputs.add(12);
    inputs.add(44);

        CalculadoraSimple simmple = new CalculadoraSimple();
        System.out.println("El Stock es : "+ simmple.calcula(inputs));

    }
}
