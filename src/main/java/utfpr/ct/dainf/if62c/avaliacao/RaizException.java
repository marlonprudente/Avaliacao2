/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author Marlon M. P. Oliveira // marlonmateuspr@gmail.com
 */
public class RaizException extends Exception {

    public RaizException(String coef) {
        String.format("Polinômio ‘%s’ não tem raízes", coef.toString());
        //System.out.println("Raiz invalida");
    }
}
