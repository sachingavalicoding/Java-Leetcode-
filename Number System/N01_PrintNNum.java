class PrintNNum {

        void Print (int N) {
        for (int i = 0; i <= N; i++) {
           System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNNum s = new PrintNNum();
        s.Print(20);

    }
}