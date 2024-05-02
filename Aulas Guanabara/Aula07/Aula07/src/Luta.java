import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.Apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.Apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("======== RESULTADO DA LUTA ========");
            switch (vencedor) {
                //empate
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                //ganhou desafiado
                case 1:
                    System.out.println(this.desafiado.getNome() + " ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                //ganhou desafiante
                case 2:
                    System.out.println(this.desafiante.getNome() + " ganhou!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                
                default:
                    break;
            }
            System.out.println("===================================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador dfi){
        this.desafiante = dfi;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
}
