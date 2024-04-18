public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int vitorias, derrotas, empates, idade;
    
    //Métodos especiais
    public Lutador(String no, String na, int i, float A, float P, int V, int D, int E){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(A);
        this.setPeso(P);
        this.setVitorias(V);
        this.setDerrotas(D);
        this.setEmpates(E);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String no){
        this.nome = no;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }

    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float A){
        this.altura = A;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float P){
        this.peso = P;
        this.setCategoria();
    }

    public String getCategoria(){
        return this.categoria;
    }

    private void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido!";
        }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int V){
        this.vitorias = V;
    }
    //
    public int getDerrotas(){
        return this.derrotas;
    }

    public void setDerrotas(int D){
        this.derrotas = D;
    }
    //
    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int E){
        this.empates = E;
    }
    //fim métodos especiais

    //Métodos publicos
    public void Apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //fim métodos Públicos
}
