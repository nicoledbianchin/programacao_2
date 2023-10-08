package recursao;

public class RecursaoII {
    public static int exercicio1(int x){
        if(x == 0) return 0;
        if(x == 1) return 1;
        if(x == 2) return 2;
        return exercicio1(x-1) + exercicio1(x - 2) + exercicio1(x - 3);
    }

    public static void exercicio2(int x) {
        if (x == 0)
            System.out.println("Fim do programa");
        else
            exercicio2(x-3);
        System.out.println(x);
    }

    public static int exercicio3(int n) throws IllegalArgumentException{
        if(n <= 0) throw new IllegalArgumentException();
        return exercicio3R(n);
    }
    private static int exercicio3R(int n) {
        if(n == 1) return 2;
        return 3 * exercicio3R(n-1) + 1;
    }

    public static void exercicio4(int[] array, int i) {
        if(i >= 0) {
            System.out.println(array[i]+" ");
            exercicio4(array, i--);
        }
    }

    public static int exercicio5(Aluno[] alunos, int i, int posicaoMelhorNota) {
        if(i >= alunos.length) return 0;
        if(alunos[i].getMediaFinal() > alunos[posicaoMelhorNota].getMediaFinal())
            posicaoMelhorNota = i;
        return exercicio5(alunos, i+1, posicaoMelhorNota);
    }

    public static int exercicio6(int m, int n) {
        if(m == 0)  return n + 1;
        if(m > 0 && n == 0) return exercicio6(m-1, 1);
        else return exercicio6(m-1, exercicio6(m, n-1));
    }

    public static void main(String[] args) {
//        System.out.println(exercicio1(4));
//        System.out.println(exercicio1(6));

//        exercicio2(6);

//        System.out.println(exercicio3(2));
//        System.out.println(exercicio3(3));

//        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        exercicio4(valores, 5);

//        Aluno[] alunos = {new Aluno("Aluno 0", 5.5), new Aluno("Aluno 1", 3.3), new Aluno("Aluno 2", 4.9), new Aluno("Aluno 3", 9.8), new Aluno("Aluno 4", 7.4)};
//        System.out.println(exercicio5(alunos, 0, 0));

        System.out.println(exercicio6(2, 1));
        System.out.println(exercicio6(3, 4));
    }
}

