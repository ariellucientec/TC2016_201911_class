package Evaluaciones.solucion1;

public class Test {
    public static void main(String[] args) 
    {
        Person p = new Person("Pedro");
        Person s = new Person("Susana");
        Person g = new Person("Gaby");
        p.ask4Permission2Kiss(s);
        p.kiss(s);
        p.kiss(g);
    }
}