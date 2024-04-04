public class CanetaAula03 {
    public String cor;
    public String modelo;
    public float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("-------------------------------------------------------");
        System.out.print("Essa caneta é " + this.cor);
        System.out.print("\nEstá tampada? " + this.tampada);
        System.out.print("\nEssa caneta tem a ponta " + this.ponta);
        System.out.print("\nO modelo da caneta é " + this.modelo);
        System.out.print("\nE a carga é de " + this.carga);

    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\nA caneta está tampada! Não é possível rabiscar.");
        } else {
            System.out.println("\nA caneta está destampada! Vou rabiscar.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
