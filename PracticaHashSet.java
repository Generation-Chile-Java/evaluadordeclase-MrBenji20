package C1427082024;

import java.util.*;
import java.util.stream.Collectors;

public class PracticaHashSet {
    /** hash set es la implementacion de interfaz Set y no permite el ingreso de duplicados y no tienen un orden especifico **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String agregar;
        Integer op;

        Set<String> anime = new HashSet<>();

        System.out.println("------ Anime ------");

        do {
            System.out.println("1- Agregar");
            System.out.println("2- Eliminar");
            System.out.println("3- Mostrar Lista");
            System.out.println("4- Cantidad de Datos");
            System.out.println("5- Ordenar Alfabeticamente");
            System.out.println("0- Salir");
            System.out.println("Ingrese la opcion que desea hacer: ");

            op = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (op) {
                case 1: //agregar
                    System.out.println("Agregue un Alumno:");
                    agregar = sc.nextLine();
                    if (anime.add(agregar)) {
                        anime.add(agregar);
                        System.out.println(agregar + " agregado");
                    } else {
                        System.out.println(agregar + " ya está en la lista");
                    }
                    break;
                case 2: //eliminar
                    System.out.println("Ingrese el anime que desea eliminar:");
                    String eliminar = sc.nextLine();
                    if (anime.remove(eliminar)) {
                        anime.add(eliminar);
                        System.out.println(eliminar + " eliminado");
                    } else {
                        System.out.println(eliminar + " no se encuentra en la lista");
                    }
                    break;
                case 3: //mostrar
                    System.out.println("Lista de alumnos:");
                    for (String anim : anime) {
                        System.out.println("- " + anim);
                    }

                    System.out.println(anime);
                    break;
                case 4: //cantidad
                    System.out.println("Hay " + anime.size() + " alumnos en la lista");
                    break;
                case 5: // ordenar los animes
                    System.out.println("-- Animes ordenados --");
                    List<String> animeOrden = anime.stream().sorted().collect(Collectors.toList());
                    anime.clear();
                    anime.addAll(animeOrden);
                    break;
                case 0: //salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            System.out.println();

        } while (!op.equals(0));
    }
}
