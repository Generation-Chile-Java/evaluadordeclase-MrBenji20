package C1427082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticaArrayList {
    /** Las arrayList son arreglos dinamicos, tienen metosdos para agregar y eliminar elementos y no tienen una longitud fija **/
    public static void main(String[] args) {
        /* la sintaxis para crear una array list es la siguiente:
          Interfas List: <Tipo objeto>: nombre variable:
          Inicializacion a nueva instancia vacia **/
        /*
        List<Integer> numero = new ArrayList<>();

        System.out.println("Esta es mi caja de numeros: " + numero);
        //agregar elemntos
        //add()
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);

        numero.add(0,8);
        numero.remove(4);

        System.out.println("This is my new number box: " + numero);

        for (int i = 0; i < numero.size(); i++) {
            System.out.println("The " + (i+1) + "° number is: " + numero.get(i)); //obtener
        }

        System.out.println("Size: " + numero.size());

        System.out.println("Existe en la caja de numeros: " + numero.contains(2));
        //remplazar
        numero.set(2, 7);
        System.out.println("number box: " + numero);
        // [8, 1, 7, 3]
        System.out.println("EL NUMERO MASTODONTE ES: " + Collections.max(numero));
        System.out.println("EL NUMERIN ES: " + Collections.min(numero));
        Collections.sort(numero); //ordena la lista de forma desecentente
        System.out.println(numero);
        */
        /******* lo mismo con strings *********/
        //variables
        List<String> anime = new ArrayList<>();
        anime.add("One Piece");
        anime.add("Naruto");
        anime.add("Bleach");
        anime.add("Dragon ball");

        System.out.println("La lista de anime es:");
        for (int i = 0; i < anime.size(); i++) {
            System.out.println((i+1) + "- " + anime.get(i));
        }
        System.out.println();

        Collections.sort(anime);
        System.out.println("Ordenados de forma ascendente:");
        for (int i = 0; i < anime.size(); i++) {
            System.out.println((i+1) + "- " + anime.get(i));
        }
        System.out.println();
        System.out.println("Ordenados de forma descendente:");
        Collections.sort(anime, Collections.reverseOrder());
        for (int i = 0; i < anime.size(); i++) {
            System.out.println((i+1) + "- " + anime.get(i));
        }

    }

}
