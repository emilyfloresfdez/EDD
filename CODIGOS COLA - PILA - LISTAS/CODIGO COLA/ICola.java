package CODIGOCOLA;


/*@author emily */
public interface ICola 
{
    public boolean estaVacia();
    public boolean estaLlena();
    public boolean agregar(Nodo n);
    public Nodo eliminar(Object n);
    
    //TODO
    
    //public boolean Nodo buscar(Nodo,o);
    //public boolean Nodo buscar(Object,o);
    //public Nodo buscar(int indice);

    
    // SOLO PARA IMPRIMIR LOS ELEMENTOS EXISTENTES
    
    public void mostrar();
}
