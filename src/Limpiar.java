public class Limpiar extends Thread {

    @Override
    public void run() {
        // Sincronizamos los dos hilos
        Generar generar = new Generar();
        generar.start();

        Consumir consumir = new Consumir();
        consumir.start();

    }
}
