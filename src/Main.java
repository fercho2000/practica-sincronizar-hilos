public class Main {
    public static void main(String[] args) {
        // Ejecutamos la clase limpiar la cual se encarga de sincronizar los dos hilos
        Limpiar limpiar = new Limpiar();
        limpiar.start();
    }
}
