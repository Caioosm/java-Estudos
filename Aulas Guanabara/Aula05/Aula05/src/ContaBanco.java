public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private boolean abrida;
    

    public ContaBanco(){ //método constructor
        this.saldo = 0;
        this.status = false;
    }

    //Métodos especiais conta
    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }
    //Métodos especiais tipo conta
    public String getTipoConta(){
        return this.tipo;
    }

    public void setTipoConta(String t){
        this.tipo = t;
    }
    //Métodos especiais dono
    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }
    //Métodos especiais saldo
    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float sald){
        this.saldo = sald;
    }
    //Métodos especiais Status
    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean stts){
        this.status = stts;
    }
    //Métodos especiais Abrido
    public boolean getAbrida(){
        return this.abrida;
    }

    public void setAbrida(boolean aberto){
        this.abrida = aberto;
    }

    // public void Conta(){
    //     System.out.println("Número da conta: " + this.getNumConta());
    //     System.out.println("Tipo da conta: " + this.getTipoConta());
    //     System.out.println("Dono da conta: " + this.getDono());
    //     System.out.println("Saldo da conta: " + this.getSaldo());
    //     System.out.println("Status da conta: " + this.getStatus());
    // }

    public void AbrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);

        if(t == "CC".toUpperCase()){
            this.setSaldo(50);
        }else if(t == "CP".toUpperCase()){
            this.setSaldo(150);
        }else{
            this.setStatus(false);
        }
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Não podes fechar a conta, tens dinheiro!");
        }else if(this.saldo < 0){
            System.out.println("Não podes fechar a conta, tens débito!");
        }
    }

    public void depositar(float valorDepositado){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valorDepositado);
        }else{
            System.out.println("Impossível depositar, conta fechada!");
        }
    }

    public void sacar(float valoDepositado){
        if (this.getStatus()) {
            if (this.getSaldo() > valoDepositado) {
                this.setSaldo(this.getSaldo() - valoDepositado);
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Conta não criada, impossível sacar!");
        }
    }

    public void pagarMensal(){

        float v = 0;

        if(this.getTipoConta() == "CC"){
            v = 12;
        }else if(this.getTipoConta() == "CP"){
            v = 20;
        }
        
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível pagar!");
        }
    }

}
