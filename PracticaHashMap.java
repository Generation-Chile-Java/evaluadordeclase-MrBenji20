package C1427082024;

import java.util.HashMap;
import java.util.Map;

public class PracticaHashMap {
    /** HashMap es una estructura que implementa la interfaz Map y almacena en pares clave: valor **/
    public static void main(String[] args) {
        Map<String, String> mugiwarasFavoritos = new HashMap<>();
        System.out.println(mugiwarasFavoritos);

        //agregar
        //tripulacion - nombre
        mugiwarasFavoritos.put("Luffy", "Sombreros de paja");
        mugiwarasFavoritos.put("Law", "Piratas corazon");
        mugiwarasFavoritos.put("Ace", "Piratas de barba blanca");
        mugiwarasFavoritos.put("Marco", "Piratas de barba blanca");

        //System.out.println(mugiwarasFavoritos);


        //Obtener un elemento en particular, con su llave
        System.out.println(mugiwarasFavoritos.get("Ace"));

        //eliminar
        mugiwarasFavoritos.remove("Ace");

        //Verificar si existe la clave dentro hel HashMap
        Boolean existe = mugiwarasFavoritos.containsKey("Marco");
        System.out.println(existe);

        //imprimir longitud
        System.out.println("la cantidad es de: " + mugiwarasFavoritos.size());

        //recorrer un hashmap
        mugiwarasFavoritos.keySet().forEach(System.out::println);
        for (Map.Entry<String, String> entry : mugiwarasFavoritos.entrySet()) {
            String nombre = entry.getKey();
            String tripulacion = entry.getValue();
            System.out.println(nombre + " pertenece a la tripulacion de los " + tripulacion.toLowerCase());
        }

        for (String nombre : mugiwarasFavoritos.keySet()) {
            System.out.println(nombre + ": " + mugiwarasFavoritos.get(nombre));
        }

    }
}
