public class DSCOrdenDeVariables
{
    void DetectaOrden(int a,int b,int c)
    {
        if (a<b && b<c)
            System.out.println("Las variables estan en orden CRECIENTE");
        else if (a>b && b>c)
            System.out.println("Las variables estan en orden DECRECIENTE");
        else
            System.out.println("Las variables estan en DESORDEN");
    }