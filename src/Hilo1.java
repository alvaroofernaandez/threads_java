public class Hilo1 extends Thread{

    public Hilo1 () {
    }

    @Override
    public void run() {
        System.out.println("Empieza el hilo 1:\n");
        for (int num = 0; num <= 0; num ++ ) {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(num + " <--- Esto forma parte del hilo 1 y es la vez nº " + i + " que se ejecuta.");
            }
        }
    }
}
