public class Contador {
    private int total=0;

    public synchronized void suma(){
        total++;
    }

    public int getTotal() {
        return total;
    }

}
