package CODIGOPILA;

/*  @author emily */
public class Nodo 
{
    private Nodo siguiente;
    private Object dato;
    
    public Nodo(Object dato)
    {
        this.dato = dato;
        siguiente = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }  
}
