public class Caneta04 {
    private String modelo;
    private float ponta;
    private Boolean tampada;
    private String cor;

    public Caneta04(String m, float p, String c){ //método construtor
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(Float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void Status(){
        System.out.println("STATUS DA CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Está tamapada? " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
}
