public class Consonante extends Thread{
    private char consonante; //Puse String al principio pero el if lo rechaza ya que lo que busca es un char, por lo que cambia a un char el String.
    private String texto;
    private Contador contador; //Contador global
    private int individual = 0; //Contador individual

    public Consonante(char consonante,String texto,Contador contador){
        this.consonante=consonante;
        this.texto=texto.toLowerCase();
        this.contador=contador;
    }

    public void run(){
        for(int i = 0;i<texto.length();i++){ //Sigue una a una las letras del texto
            if (texto.charAt(i)==consonante){ //Si encuentra una una consonante igual a las introducidas sumara 1 al contador global y al individual.
                individual++;
                contador.suma();
            }
        }
    }

    public int getIndividual(){
        return individual;
    }

    public char getConsonante() {
        return consonante;
    }
}
