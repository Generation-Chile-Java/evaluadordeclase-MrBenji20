package C1427082024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> materias = new ArrayList<>();
        materias.add("Matematica");
        materias.add("Lenguaje");
        materias.add("Historia");
        Float nota = 0f;
        Float suma = 0f;
        Float promedio = 0f;

        for (int i = 0; i < materias.size(); i++) {
            System.out.println("Ingresar el valor de la nota de " + materias.get(i) + ":");
            nota = sc.nextFloat();
            while (nota > 10 || nota < 1) {
                System.out.println("Error!!! Nota no aceptada");
                System.out.println("Ingresar el valor de la nota " + materias.get(i) + ":");
                nota = sc.nextFloat();
            }
            suma += nota;
        }

        System.out.println();
        promedio = suma / materias.size();

        System.out.println("Su promedio de notas es de " + promedio);

        if (promedio.equals(10)) {
            System.out.println("Exelente!!!");
        } else if (promedio > 5 && promedio <= 8) {
            System.out.println("Aceptable");
        } else if (promedio > 3 && promedio <= 5) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("No aprobado");
        }
    }
}
