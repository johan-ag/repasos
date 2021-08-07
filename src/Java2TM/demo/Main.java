package Java2TM.demo;

public class Main {
    public static void main(String[] args) {
        Numero n = new Numero(4);
        Numero m = n.copiar();

        if (n.esPar()){
            System.out.println(m.getValor());
        }
    }
}
