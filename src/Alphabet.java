public class Alphabet {
    Type type;

    public Alphabet(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Alphabet{" +
                "type=" + type;
    }

    enum Type {
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        N,
        O,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z
    }
}
