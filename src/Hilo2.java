public class Hilo2 extends Thread {
    int num;


    public Hilo2() {
    }

    @Override
    public void run() {
        System.out.println("\nEmpieza el hilo 2:\n");
        for (int num = 1; num <= 1; num++) {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(num + " <--- Esto forma parte del hilo 2 y es la vez nº " + i + " que se ejecuta.");
            }
        }
    }
}