public class Aula02 {
    public static void main(String[] args) {
        CanetaAula03 c1 = new CanetaAula03();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic";
        c1.carga = 100;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        CanetaAula03 c2 = new CanetaAula03();
        c2.cor = "preta";
        c2.modelo = "Parker";
        c2.ponta = 1.0f;
        c2.carga = 25;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
