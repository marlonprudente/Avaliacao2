/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marlon M. P. Oliveira // marlonmateuspr@gmail.com
 */
public class PoliQuad extends Polinomio {

    public PoliQuad(Number a, Number b, Number c) {
        this.coef = new Number[3];
        this.coef[0] = a;
        this.coef[1] = b;
        this.coef[2] = c;
    }

    /**
     *
     * @return @throws RaizException
     */
    @Override
    public double[] getRaizes() throws RaizException {
        double[] x = new double[2];
        double delta = Math.pow(coef[1].doubleValue(), 2) - 4 * coef[0].doubleValue() * coef[2].doubleValue();
        if (delta < 0) {
            throw new RaizException(coef.toString());
        }
        x[0] = (-coef[1].doubleValue() + Math.sqrt(delta)) / (2 * coef[0].doubleValue());
        x[1] = (-coef[1].doubleValue() - Math.sqrt(delta)) / (2 * coef[0].doubleValue());
        return x;
    }

}
