public class ExemploMeu {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        m1.modelo = "Cobra";
        m1.dpi = 10000;
        m1.rgb = true;
        m1.hz = 1000;
        m1.fio = false;
        m1.marca = "Redragon";
        m1.botaoQnt = 8;
        m1.conectado = true;

        m1.status();
        m1.conectado();
    }
}
