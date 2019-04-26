package unionfindcompression;

/**
 *
 * @author Vitor
 */
public class UnionFindCompression {
    public static int TAM = 100000;
    public static No[] conjuntos = new No[TAM];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contruir();
        for(int i = 0;i < TAM - 3;i++)
            juntar(i, i + 1);
        System.out.println(testar(1, 9));
        System.out.println(testar(385, 2143));
        System.out.println(testar(707, 85));
        System.out.println(testar(1, TAM - 1));
    }

    public static void contruir() {
        for (int i = 0; i < TAM; i++) {
            conjuntos[i] = new No();
            conjuntos[i].valor = i;
            conjuntos[i].pai = conjuntos[i];
        }
    }

    public static No buscaRaiz(No atual) {
        //este método é o que busca o pai de forma recursiva e o retorna
        if (atual.pai.valor == atual.valor) {
            return atual;
        }
        return buscaRaiz(atual.pai);

    }

    public static No buscaRaizI(int i) {
        //este método é o que busca o pai de forma iterativa e o retorna
        No aux = conjuntos[i];
        while (aux.valor != aux.pai.valor) {
            aux = aux.pai;
        }
        return aux;
    }

    public static void juntar(int a, int b) {
        /*No raizA = buscaRaiz(conjuntos[a]);
        No raizB = buscaRaiz(conjuntos[b]); */
        No raizA = buscaRaizI(a);
        No raizB = buscaRaizI(b);

        raizA.pai = raizB;
        conjuntos[a].pai = raizB;
        conjuntos[b].pai = raizB;
    }

    public static boolean testar(int a, int b) {
        /*No raizA = buscaRaiz(conjuntos[a]);
        No raizB = buscaRaiz(conjuntos[b]);*/
        No raizA = buscaRaizI(a);
        No raizB = buscaRaizI(b);
        return raizB.valor == raizA.valor;
    }
}
