package Java2TM.numerosPositivos;

public class NumeroPositivo extends Numero{

    public NumeroPositivo(int n) throws Exception{
        if (n < 0) {
                throw new Exception();
        }
        super.setValor(n);
    }

    @Override
    public void setValor(int valor) {
        if(valor<0){
            throw new NumeroNoEsPositivoException( );
        }
        super.setValor(valor);
    }

}
