public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String name, String na, int i, float A, float P, String C, int V, int D, int E){
        this.setNome(name);
        this.setNacionalidade(na);
        this.setIdade(i);
        this.setAltura(A);
        this.setPeso(P);
        this.setCategoria(C);
        this.setVitorias(V);
        this.setDerrotas(D);
        this.setEmpates(E);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String name){
        this.nome = name;
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
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String C){
        this.categoria = C;
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
    //
    
    
    public void Apresentar(){

    }

    public void status(){

    }

    public void ganharLuta(){

    }
    
    public void perderLuta(){

    }

    public void empatarLuta(){
        
    }
}
