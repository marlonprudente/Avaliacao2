/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Marlon Mateus P. de Oliveira  // marlonmateuspr@gmail.com
 */
public class PoliLinear extends Polinomio {

    public PoliLinear(Number a, Number b) {
        this.coef = new Number[2];
        this.coef[0] = a;
        this.coef[1] = b;
    }

    @Override
    public double[] getRaizes() throws RaizException {
        double[] x = new double[1];
        if (this.coef[0].doubleValue() == 0) {
            throw new RaizException(coef.toString());
        }
        x[0] = -this.coef[1].doubleValue() / this.coef[0].doubleValue();

        return x;
    }

}
