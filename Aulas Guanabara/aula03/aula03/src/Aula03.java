public class Aula03 {
    public static void main(String[] args) {
        CanetaAula03 c1 = new CanetaAula03();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.carga = 100;
        // c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
