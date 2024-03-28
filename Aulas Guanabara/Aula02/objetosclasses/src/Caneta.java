public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("-------------------------------------------------------");
        System.out.print("Essa caneta é " + this.cor);
        System.out.print("\nEstá tampada? " + this.tampada);
        System.out.print("\nEssa caneta tem a ponta " + this.ponta);
        System.out.print("\nO modelo da caneta é " + this.modelo);
        System.out.print("\nE a carga é de " + this.carga);

    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\nA caneta está tampada! Não é possível rabiscar.");
        } else {
            System.out.println("\nA caneta está destampada! Vou rabiscar.");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
