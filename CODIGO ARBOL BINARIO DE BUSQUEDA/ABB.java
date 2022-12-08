package ARBOLBINARIOBUSQUEDA;

public class ABB 
{
    private Nodo raiz;
    
    public ABB(Nodo raiz)
    {
        this.raiz = raiz;
    }

    public Nodo getRaiz() { return raiz; }

    public void setRaiz(Nodo raiz) { this.raiz = raiz; }
    
    public void agregar(Nodo n)
    {
        if(raiz == null)
        {
            raiz = n;
        }
        else
        {
            agregar(n,raiz);
        }
    }
    
    private void agregar(Nodo n,Nodo raiz)
    {
        if(raiz.getDato() > n.getDato())
        {
            if(raiz.getIzquierdo() != null)
            {
                agregar(n,raiz.getIzquierdo());
            }
            else
            {
                raiz.setIzquierdo(n);
            }
        }
        else
        {
            if(raiz.getDerecho != null)
            {
                agregar(n,raiz.getDerecho());
            }
            else
            {
                raiz.setDerecho(n);
            }
        }
    }
    
    private void imprimeArbol(Nodo n)
    {
        if(n != null)
        {
            System.out.println(n.getDato());
            imprimeArbol(n.getIzquierdo());
            imprimeArbol(n.getDerecho());
        }
    }
    public void imprimir()
    {
        imprimeArbol(raiz);
    } 
}
