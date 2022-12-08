package CODIGOPILA;

/* @author emily */

public class Pila implements IPila
{
    private Nodo inicio; 
    private Nodo fin;   
    private int tamañoActual;
    private int tamañoMaximo;
   
    public Pila(int tamañoMaximo)
    {
        this.tamañoMaximo = tamañoMaximo;
        tamañoActual=0;
        inicio=null;
        fin=null;
    }
    
    public boolean estaVacia()
    {
        return tamañoActual == 0;
    }
    
    public boolean estaLlena() 
    {
        return tamañoActual == tamañoMaximo;    
    }
    
    public boolean Agregar(Nodo n)
    {
       if(!estaLlena())
            {
                if(fin != null)
                {
                    fin.setSiguiente(n);
                    fin = fin.getSiguiente();
                }
                else
                {
                        inicio = n;
                        fin = n;
                }
                tamañoActual++;
                return true;
            }
       return false;
    }
    
    public void Mostrar()
    {
        Nodo nodo = inicio;
        int contador = 0;
        while (nodo != null)
        {
            System.out.println("Nodo: "+ ++contador);
            System.out.println(nodo.getDato());
            nodo = nodo.getSiguiente();
        }
    }
    public boolean Eliminar() 
    {
        if(!estaVacia())
        {
           Nodo eliminarObjeto = fin;
           if (inicio == fin)
           {
               inicio = fin = null;
           }
           else 
           {
               Nodo actual = inicio;
               while (actual.getSiguiente() != fin)
               {
                   actual = actual.getSiguiente();
               }
               fin = actual;
               actual.setSiguiente(null);
           }
        }
        return true;
    }
}
