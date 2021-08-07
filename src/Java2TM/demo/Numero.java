package Java2TM.demo;

public class Numero {
    private int valor;

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
}
