import java.util.Scanner;

public class main {
    public static void main(String args[]) throws InterruptedException{ //InterrumpedExceptions permite hacer el join para que varios hilos funcionen a la vez.
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera consonante: ");
        char c1 = sc.nextLine().charAt(0);

        System.out.print("Introduce la segunda consonante: ");
        char c2 = sc.nextLine().charAt(0);

        System.out.print("Introduce la tercera consonante: ");
        char c3 = sc.nextLine().charAt(0);

        System.out.print("Introduce la cuarta consonante: ");
        char c4 = sc.nextLine().charAt(0);

        System.out.print("Introduce la quinta consonante: ");
        char c5 = sc.nextLine().charAt(0);

        System.out.println("Texto: ");
        String texto = sc.nextLine().repeat(2000);

        Contador contador = new Contador();

        Consonante h1 = new Consonante(c1,texto,contador);
        h1.start();

        Consonante h2 = new Consonante(c2,texto,contador);
        h2.start();

        Consonante h3 = new Consonante(c3,texto,contador);
        h3.start();

        Consonante h4 = new Consonante(c4,texto,contador);
        h4.start();

        Consonante h5 = new Consonante(c5,texto,contador);
        h5.start();

        h1.join();
        h2.join();
        h3.join();
        h4.join();
        h5.join();

        System.out.println("Contadores individuales: ");
        System.out.println("Consonante 1: "+h1.getConsonante()+" - Contador: "+h1.getIndividual());
        System.out.println("Consonante 2: "+h2.getConsonante()+" - Contador: "+h2.getIndividual());
        System.out.println("Consonante 3: "+h3.getConsonante()+" - Contador: "+h3.getIndividual());
        System.out.println("Consonante 4: "+h4.getConsonante()+" - Contador: "+h4.getIndividual());
        System.out.println("Consonante 5: "+h5.getConsonante()+" - Contador: "+h5.getIndividual());

        System.out.println("Contador total: ");
        System.out.println("Contador: "+contador.getTotal());


    }
}
