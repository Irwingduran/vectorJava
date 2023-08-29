import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Crear un vector de enteros
        Vector<Integer> vector = new Vector<>();

        // Insertar elementos en el vector
        vector.add(5);
        vector.add(10);
        vector.add(15);

        // Mostrar todos los elementos del vector
        System.out.println("Elementos en el vector:");
        for (Integer element : vector) {
            System.out.println(element);
        }

        // Borrar un elemento del vector
        int elementToRemove = 10;
        if (vector.contains(elementToRemove)) {
            vector.removeElement(elementToRemove);
            System.out.println("Elemento " + elementToRemove + " borrado.");
        } else {
            System.out.println("El elemento " + elementToRemove + " no existe en el vector.");
        }

        // Mostrar los elementos restantes después de borrar
        System.out.println("Elementos en el vector después de borrar:");
        for (Integer element : vector) {
            System.out.println(element);
        }
    }
}
