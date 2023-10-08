package recursao;

public class Recursao {

    public static int exercicio2(int x){
        if(x <= 1) return 1;
        return x*2 + exercicio2(x-1);
    }

    public static int exercicio3(int a, int b){
        if(b <= 1) return a;
        return exercicio3(a, a/b);
    }

    public static int exercicio7(int x){
        int res;
        if(x < 4) res = 3 * x;
        else res = 2 * exercicio7(x - 4) + 5;
        return res;
    }

    private static boolean exercicio8R(char[] word, int i) {
        if(i >= word.length/2) return true;
        return word[i] == word[word.length-1-i] ? exercicio8R(word, i+1) : false;
    }

    public static boolean exercicio8(char[] word) throws IllegalArgumentException {
        if(word == null) throw new IllegalArgumentException();
        return exercicio8R(word, 0);
    }

    public static void main(String[] args) {
        System.out.println(exercicio2(6));

        System.out.println(exercicio3(28, -45));

        System.out.println(exercicio7(9));

        String word = "ana";
        char[] array = word.toCharArray();

        System.out.println(exercicio8(array));
    }
}
