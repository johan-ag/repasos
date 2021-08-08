package Java2TM.numerosPositivos;

public class NumeroNoEsPositivoException extends RuntimeException{
    public NumeroNoEsPositivoException(){
        super("No es positivo este numero");
    }
}
