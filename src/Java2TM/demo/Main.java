package Java2TM.demo;

public class Main {
    public static void main(String[] args) {
        Numero n = new Numero(4);
        Numero m = n.copiar();
        String str = "Hola soy una taza";
        //n.setValor(10);

        System.out.println(n.equals(m));

    }
}
