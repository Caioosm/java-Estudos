public class Cliente {
    private String nome;
    private String endereco;
    private float renda;
    

    public Cliente(String n, String e, float r){ //método construtor
        this.setNome(n);
        this.setEndereco(e);
        this.setRenda(r);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String e){
        this.endereco = e;
    }

    public float getRenda(){
        return this.renda;
    }

    public void setRenda(float r){
        this.renda = r;
    }

    public void infoCliente(){
        System.out.println("Nome do cliente: " + this.getNome());
        System.out.println("Endereço do cliente: " + this.getEndereco());
        System.out.println("Renda do cliente: " + this.getRenda());
    }
    
}
