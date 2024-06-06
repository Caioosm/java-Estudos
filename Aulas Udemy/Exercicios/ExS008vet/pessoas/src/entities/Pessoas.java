package entities;

public class Pessoas {
    private String name;
    private double altura;
    private int idade;

    public Pessoas(String name, double altura, int idade){
        this.name = name;
        this.altura = altura;
        this.idade = idade;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
