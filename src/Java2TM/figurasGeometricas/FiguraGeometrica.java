package Java2TM.figurasGeometricas;

public abstract class FiguraGeometrica {
    public abstract double area();

    public void mostrarArea(){
        System.out.println("El area es "+ this.area());
    }
}
