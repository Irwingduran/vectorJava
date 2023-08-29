public class MiVector {
    private int[] elementos;
    private int tamaño;
    private int capacidadInicial;

    public MiVector(int capacidadInicial) {
        this.capacidadInicial = capacidadInicial;
        this.elementos = new int[capacidadInicial];
        this.tamaño = 0;
    }

    public void insertar(int elemento) {
        if (tamaño == elementos.length) {
            expandirCapacidad();
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public void borrar(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        for (int i = indice; i < tamaño - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamaño--;
    }

    public void mostrarElementos() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    private void expandirCapacidad() {
        int nuevaCapacidad = capacidadInicial * 2;
        int[] nuevoArreglo = new int[nuevaCapacidad];
        System.arraycopy(elementos, 0, nuevoArreglo, 0, tamaño);
        elementos = nuevoArreglo;
    }

    public static void main(String[] args) {
        MiVector miVector = new MiVector(5);

        miVector.insertar(10);
        miVector.insertar(20);
        miVector.insertar(30);
        miVector.insertar(40);
        miVector.insertar(50);

        System.out.println("Elementos insertados:");
        miVector.mostrarElementos();

        miVector.borrar(2);

        System.out.println("Elemento en la posición 2 borrado:");
        miVector.mostrarElementos();
    }
}
