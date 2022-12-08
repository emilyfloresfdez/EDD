package RECURSIVIDAD;

/* @author emily */
public class EJERCICIO3 
{
    public static void main(String[] args) 
    {
        int boxes=14,maxNum=3;
        System.out.println("ENTRADA:     SALIDA: ");
        System.out.println(+boxes+" - "+maxNum+"         "+CAJASALMACEN(boxes,maxNum));
    }
    
    public static int CAJASALMACEN(int Cajas, int NumMax)
    {
        if(Cajas<= NumMax){
            return 1;
        }
        if(Cajas%2 !=0){
            int LIzquierdo = Cajas/2;
            int LDerecho= (Cajas/2)+1;
            return CAJASALMACEN(LIzquierdo, NumMax) + CAJASALMACEN(LDerecho, NumMax);
        }
        return CAJASALMACEN(Cajas/2, NumMax) + CAJASALMACEN(Cajas/2, NumMax);
    }
}
