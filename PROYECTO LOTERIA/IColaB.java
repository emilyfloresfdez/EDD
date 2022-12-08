package Loteria;

public interface IColaB 
{
	public int longitud();
	public boolean vacia();
	public void agregar(Carta c);
	public Carta sacarPrimera();
	public Carta sacarUltima();
}
