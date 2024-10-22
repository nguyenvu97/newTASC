package pattern.signleton;

public enum TestEnum {
    ADD {
        @Override
        public int apply(int a, int b) {
            return a-b;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }

    };


    public abstract int apply(int a, int b);
}
