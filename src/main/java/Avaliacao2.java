
import utfpr.ct.dainf.if62c.avaliacao.*;
//import utfpr.ct.dainf.if62c.pratica.RaizException;
/*
*
*
* @author Marlon Mateus P. de Oliveira  // marlonmateuspr@gmail.com
*/
public class Avaliacao2 {

    public static void main(String[] args) throws RaizException {
        try {
            PoliLinear vpoli = new PoliLinear(3.0, 2.0);
            double[] raiz = vpoli.getRaizes();
            System.out.println("Raiz Polinomio Linear:" + raiz[0]);
            System.out.println("Valor do polinomio linear na raiz: R1 = " + vpoli.poli(raiz[0]));
        } catch (RaizException e) {
            System.out.println(e.getLocalizedMessage());
        }
        try {
            PoliQuad vpoliq = new PoliQuad(3, -2, -1);
            double[] raiz2 = vpoliq.getRaizes();
            System.out.println("Raizes Polinomio Quqdrado: 01:-> " + raiz2[0] + " 02:->" + raiz2[1]);
            System.out.println("Valor do polinomio linear nas raizes: R1 =  " + vpoliq.poli(raiz2[0]) + " e R2 = " + vpoliq.poli(raiz2[1]));

        } catch (RaizException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
