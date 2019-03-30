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
        juntar(3395, 4499);
        juntar(7755, 8241);
        juntar(3097, 723);
        juntar(6399, 8881);
        juntar(4675, 1763);
        juntar(982, 546);
        juntar(6499, 6713);
        juntar(5925, 2409);
        juntar(2323, 5288);
        juntar(1966, 4847);
        juntar(2026, 4623);
        juntar(2333, 7949);
        juntar(3358, 6965);
        juntar(3257, 132);
        juntar(7768, 1891);
        juntar(4332, 5778);
        juntar(521, 5099);
        juntar(2091, 1195);
        System.out.println(testar(1, 9));
        System.out.println(testar(385, 2143));
        System.out.println(testar(707, 85));
        System.out.println(testar(2091, 1195));
    }

    public static void contruir() {
        for (int i = 0; i < TAM; i++) {
            conjuntos[i] = new No();
            conjuntos[i].valor = i;
            conjuntos[i].pai = conjuntos[i];
        }
    }

    public static No buscaPai(No atual) {
        //este método é o que busca o pai de forma recursiva e o retorna
        if (atual.pai.valor == atual.valor) {
            return atual;
        }
        return buscaPai(atual.pai);

    }

    public static No buscaPaiI(int i) {
        //este método é o que busca o pai de forma iterativa e o retorna
        No aux = conjuntos[i];
        while (aux.valor != aux.pai.valor) {
            aux = aux.pai;
        }
        return aux;
    }

    public static void juntar(int a, int b) {
        /*No raizA = buscaPai(conjuntos[a]);
        No raizB = buscaPai(conjuntos[b]); */
        No raizA = buscaPaiI(a);
        No raizB = buscaPaiI(b);

        raizA.pai = raizB;
        conjuntos[a].pai = raizB;
        conjuntos[b].pai = raizB;
    }

    public static boolean testar(int a, int b) {
        /*No raizA = buscaPai(conjuntos[a]);
        No raizB = buscaPai(conjuntos[b]);*/
        No raizA = buscaPaiI(a);
        No raizB = buscaPaiI(b);
        return raizB.valor == raizA.valor;
    }
}
