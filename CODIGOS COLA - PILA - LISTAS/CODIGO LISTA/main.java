package CODIGOPILA;

/* @author emily */

public class main 
{
    public static void main(String []args)
    {
        Nodo n1 = new Nodo("Primer Nodo!!");
        Nodo n2 = new Nodo("Segundo Nodo!!");
        Nodo n3 = new Nodo(false);
        Nodo n4 = new Nodo(55);
        
        Pila pila = new Pila(5);
        
        pila.Agregar(n1);
        pila.Agregar(n2);
        pila.Agregar(n3);
        pila.Agregar(n4);
        
        pila.Eliminar();
        
        pila.Mostrar();
    }
}
