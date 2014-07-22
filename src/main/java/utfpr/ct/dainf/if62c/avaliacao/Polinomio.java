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
abstract class Polinomio {

    protected Number[] coef;

    protected Polinomio() {

    }

    public Polinomio(Double[] vetcoef) throws IllegalArgumentException {
        if (vetcoef.length < 1) {
            throw new IllegalArgumentException("Polinômio inválido");
        }
        this.coef = vetcoef;

    }

    public int getGrau() {

        return coef.length - 1;
    }

    public double poli(double x) {
        double r = 0;
        for (int i = 0; i < coef.length; i++) {
            r = r + this.coef[i].doubleValue() * Math.pow(x, coef.length - i);
        }
        return r;       

    }

    public abstract double[] getRaizes()throws RaizException;

    /* public double poli(double x){
     //implementar
     return 10;
     }
     */
    @Override
    public String toString() {
        if(coef.length == 3){
            return coef[0] + "x^2" + coef[1] + "x^1" + coef[2] + "x^0";
        }
        if(coef.length == 2){
            return coef[0] + "x^1" + coef[1] + "x^0";
        }
        
        return coef[0] + "x^3" + coef[1] + "x^2" + coef[2] + "x^1" + coef[3] + "x^0";
    }
        
}
