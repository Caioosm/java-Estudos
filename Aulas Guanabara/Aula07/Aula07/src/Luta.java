public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() & (l1 != l2)){
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
            this.desafiado.Apresentar();
            this.desafiante.Apresentar();
            double vencedor = Math.random();
            switch (vencedor) {
                case 0.0:
                    //empate
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1.0:
                    //ganhou desafiado
                    System.out.println(desafiado.getNome() + " ganhou!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2.0:
                    //ganhou desafiante
                    System.out.println(desafiante.getNome() + " ganhou!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                
                default:
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
        
    }

    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador desafiado(){
        return this.desafiado;
    }
    
}
