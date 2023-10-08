package listaEstatica;

public class Exercicios {
    public static int contaNegativos(StaticList<Integer> lista) throws IllegalArgumentException {
        if(lista.isEmpty()) throw new IllegalArgumentException();
        return contaNegativosR(lista, 0, 0);
    }

    public static int contaNegativosR(StaticList<Integer> lista, int posicao, int quantidade) {
        if(posicao == lista.numElements()) return quantidade;
        else if(lista.get(posicao) < 0) return contaNegativosR(lista, posicao + 1, quantidade + 1);
        else return contaNegativosR(lista, posicao + 1, quantidade);
    }

    public static boolean isPrimo(int numero) {
        if(numero<=1) {
            return false;
        }
        for(int i=2; i <= Math.sqrt(numero); i++) {
            if(numero%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void removePrimos(StaticList<Integer> lista) {
        for(int i =0; i < lista.numElements(); i++) {
            if(isPrimo(lista.get(i))) {
                lista.remove(i);
            }
        }
    }

    public static int exercicio4(List<Integer> lista1, List<Integer> lista2) throws UnderflowException {
        if(lista1.isEmpty() || lista1 == null || lista2 == null || lista2.isEmpty()) throw new UnderflowException();
        return exercicio4(lista1, lista2, 0,0,0);
    }

    private static int exercicio4(List<Integer> lista1, List<Integer> lista2, int soma, int i, int j) {
        if(i < lista1.numElements()) {
            soma += lista1.get(i);
            i++;
            return exercicio4(lista1, lista2, soma, i, j);

        } else if (j < lista2.numElements()){
            soma += lista2.get(j);
            j++;
            return exercicio4(lista1, lista2, soma, i, j);
        }
        return soma;
    }

    public static int contaEletrodomesticosCaros(StaticList<Eletrodomesticos> lista, double valorLimite) {
        int count = 0;
        for(int i = 0; i < lista.numElements(); i ++) {
            if(lista.get(i).preco > valorLimite) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        //exemplo de lista
        StaticList<Integer> lista1 = new StaticList<>(20);
        StaticList<Integer> lista2 = new StaticList<>(20);

        for(int i=0; i<6; i++)
            lista1.insert(((i)*-3), i);

        for(int i=0; i<8; i++)
            lista2.insert(((i)), i);

        System.out.println("Lista 1 original:");
        System.out.println(lista1.toString());

        System.out.println("Lista 2 original:");
        System.out.println(lista2.toString());

        System.out.println("1 - Quantidade de valores específicos: " + lista1.contaElementos(-3));
        System.out.println("2 - Quantidade de valores negativos: " + contaNegativos(lista1));

        removePrimos(lista2);
        System.out.println("3 - Lista 2 depois de remover primos: " + lista2.toString());

        System.out.println("4 - Soma dos valores das duas listas: " + exercicio4(lista1, lista2));

        StaticList<Eletrodomesticos> listaEletros = new StaticList<Eletrodomesticos>(6);
        Eletrodomesticos eletro1 = new Eletrodomesticos("Arno", 110, 300);
        Eletrodomesticos eletro2 = new Eletrodomesticos("Consul", 110, 400);
        Eletrodomesticos eletro3 = new Eletrodomesticos("Eletrolux", 110, 200);
        Eletrodomesticos eletro4 = new Eletrodomesticos("Britania", 110, 600);
        Eletrodomesticos eletro5 = new Eletrodomesticos("Mondial", 110, 100);
        Eletrodomesticos eletro6 = new Eletrodomesticos("Oster", 110, 100);
        listaEletros.insert(eletro1, 0);
        listaEletros.insert(eletro2, 1);
        listaEletros.insert(eletro3, 2);
        listaEletros.insert(eletro4, 3);
        listaEletros.insert(eletro5, 4);
        listaEletros.insert(eletro6, 5);


        System.out.println("5 - Conta eletrodomesticos caros: " + contaEletrodomesticosCaros(listaEletros, 300));

    }
}
