package Java2TM.demo;

public class Numero {
    private int valor;
    public static double PI = 3.14;

    /*Tipos de constructores*/
    public Numero(int v){
        this.valor = v;
    }
    //Conocido como constructor nulo
    public Numero(){
    }

    public Numero(Numero numero){
        
    }

    //Esta es una forma de clonar el objeto
    //Es
    public Numero copiar (){
        Numero x = new Numero();
        x.setValor(this.valor);
        return x;
    }

    public boolean esPar (){
        return this.valor%2 == 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //Sobre escribir toString
    @Override
    public String toString() {
        return Integer.toString(this.valor);
    }

    @Override
    public boolean equals(Object n) {
        try {
           Numero x = (Numero) n;
           return (x.getValor() == this.valor);
        } catch (ClassCastException e){
            throw new ClassCastException("No puedes convertir ese objeto a tipo Numero");
        }

    }

}
