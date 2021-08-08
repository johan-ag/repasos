package Java2TM.numerosPositivos;

public class Main {
    public static void main(String[] args) {
        try {

            Numero n = new NumeroPositivo(-5);
            System.out.println(n);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
