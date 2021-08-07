package Java2TM.numerosPositivos;

public class NumeroPositivo extends Numero{

    @Override
    public void setValor(int valor) {
        if(valor<0){
            throw new RuntimeException("Necesita ser un valor positivo");
        }
        super.setValor(valor);
    }

}
