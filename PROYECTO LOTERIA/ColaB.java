package Loteria;

public class ColaB
{
    private Jugador inicio;
	private int tamanoActual;

    ColaB()
    {
        
    }

    public boolean vacia(){
        return tamanoActual == 0;
    }

    public void agregar(Jugador j)
    {
        if(vacia())
        {
            inicio = j;
        }
        else
        {
            Jugador temp = inicio;
            while(temp.getSiguiente()!=null)
            {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(j);
        }
        tamanoActual++;
    }
    
    public void mostrar()
    {
        Jugador jug = inicio;
        while(jug!=null)
        {
            System.out.println(jug.getId());
            jug = jug.getSiguiente();
        }
    }

    public Jugador getJugador(int x)
    {
        Jugador temp = inicio;
        while(temp.getId()!=x)
        {
            temp = temp.getSiguiente();
        }
        return temp;
    }

    

    public int getTamanoActual() {
        return this.tamanoActual;
    }

}
