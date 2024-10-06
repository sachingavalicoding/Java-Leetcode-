class Pow {
    public static void main(String[] args) {
        double x = 2;
        int n = -2;
        double pow = 1;
        long exp = Math.abs((long) n);
        System.out.println( exp);
        for (int i = 0; i < exp; i++) {
            pow *= x;
        }
        System.out.println(n < 0 ? 1 / pow : pow);
    }
}
