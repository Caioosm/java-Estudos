package entities;

public class Account {
    private int numeroConta;
    private String name;
    private double saldo;

    //getters e setter metods
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }

    public double geSaldo(){
        return saldo;
    }

    //constructor I  3 argument
    public Account(String name, int numeroConta, double depositoInicial){
        this.name = name;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }
    //constructor II 2 arguments
    public Account(String name, int numeroConta){
        this.setName(name);
        this.numeroConta = numeroConta;
    }


    //Métodos para saldo e saque de conta
    public void deposito(double quantity){
        this.saldo += quantity;
    }

    public void saque(double quantity){
        this.saldo -= quantity + 5.0;
    }

    public String toString(){
        return "Conta " 
        + numeroConta 
        + ", Titular: " 
        + name 
        + ", Saldo: R$" 
        + String.format("%.2f", saldo);
    }

    
}
