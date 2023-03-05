public class Main {
    public static void main(String[] args) {
        auto miAuto = new auto();
        miAuto.agregarpuertas();
        System.out.println(miAuto.puertas);

    }
    static class  auto  {
        public int puertas = 3;
        public void agregarpuertas() {
            this.puertas++;
        }}


}