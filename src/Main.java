//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hola soy el programa principal y voy a comenzar a llamar a los distintos hilos.");
        System.out.println("\n------------------------------------------------------------------------\n");
        Hilo1 h1 = new Hilo1();
        h1.start();

        h1.join();
        System.out.println("\nEl hilo 1 ha finalizado, espera y ahora comenzará el hilo 2\n");
        Thread.sleep(2000);

        Hilo2 h2 = new Hilo2();
        h2.start();
    }
}