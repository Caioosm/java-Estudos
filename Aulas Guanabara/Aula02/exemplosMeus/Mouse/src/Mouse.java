public class Mouse {
    String modelo;
    int dpi;
    boolean rgb;
    int hz;
    boolean fio;
    String marca;
    int botaoQnt;
    boolean conectado;

    void status() {
        System.out.println("\nO modelo do mouse é: " + this.modelo);
        System.out.println("\nO dpi máximo é: " + this.dpi);
        if (this.rgb == true) {
            System.out.println("\nTem RGB!! mais FPS");
        } else {
            System.out.println("Não em RGB :(");
        }
        System.out.println("\nQuantidade de HZ: " + this.hz);
        System.out.println("\nTem fio? " + this.fio);

        

        System.out.println("Marca: " + this.marca);
        System.out.println("Quantidade de botões: " + this.botaoQnt);
    }

    void conectado(){
        if (this.conectado == true) {
            System.out.println("Mouse conectado, pode jogar!!");
        }else{
            if (this.fio == false) {
                System.out.println("Conecte o buttuti do mouse no pc!");
            } else {
                System.out.println("Conecte o USB no pc!");
            }
        }
    }
}
