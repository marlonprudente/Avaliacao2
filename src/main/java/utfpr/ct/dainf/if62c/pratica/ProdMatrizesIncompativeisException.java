package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * 
 * Exceção lançada quando se tenta multiplicar matrizes com dimensões incompatíveis.
 */
public class ProdMatrizesIncompativeisException
        extends MatrizesIncompativeisException {

    public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2) {
        super(m1, m2, String.format(
            "Matrizes de %dx%d e %dx%d não podem ser multiplicadas",
            m1.getMatriz().length, m1.getMatriz()[0].length,
            m2.getMatriz().length, m2.getMatriz()[0].length));
    }
    
}
