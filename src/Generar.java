public class Generar extends Thread {

    @Override
    public void run() {

        try {
            boolean vacio = true;
            Consumir consumir = new Consumir(); //Instanciamos la clase consumir
            System.out.println("Desde la clase Generar el valor es: " + vacio);
            consumir.lecturaDeVariable(!vacio); //Actualiza el de vacio a false, notificando el consumidor.
        } catch (Exception e) {
            System.out.println("Ocurrio un error  " + e.getClass().getName());
        }
    }

}

