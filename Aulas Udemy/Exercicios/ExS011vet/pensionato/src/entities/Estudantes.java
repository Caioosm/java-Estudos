package entities;

public class Estudantes {
    private String name;
    private String email;
    // private int quarto;

    public Estudantes(String name, String email/*, int quarto*/) {
        this.name = name;
        this.email = email;
        // this.quarto = quarto;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // public int getQuarto() {
    //     return quarto;
    // }
    // public void setQuarto(int quarto) {
    //     this.quarto = quarto;
    // }

    public String toString(){
        return name + ", " + email;
    }
    
}
