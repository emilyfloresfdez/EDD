package CODIGOCOLA;

/* @author emily */

public class Cola implements ICola
{
    private Nodo inicio;
    private Nodo fin;
    private int tamañoActual;
    private int tamañoMaximo;
   
    public Cola(int tamañoMaximo)
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
    
    public boolean agregar(Nodo n)
    {
        if(!estaLlena())
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
        }
        return false;
    } 
    // ||||||||||||||||||||||||
    // |   Fin        Inicio  |
    // |    0 <-  0  <- 0     |
    // ||||||||||||||||||||||||
    
    public Nodo eliminar(Object o)
    {
        return null;
    }
    
    public void mostrar()
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
}
