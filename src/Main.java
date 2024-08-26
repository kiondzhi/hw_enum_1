import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char letterChar = 'Z';
        Alphabet letter = Alphabet.valueOf(String.valueOf(letterChar));
        System.out.println("Позиция буквы " + letter + " в алфавите: " + letter.getPosition());
    }

    public enum Alphabet {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

        public int getPosition() {
            return this.ordinal() + 1;
        }
    }
}