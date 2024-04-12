public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    @Override
    public void Ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void Desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        if (this.getLigado()) {
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i += 10){
                System.out.print("|");
            }
        } else {
            System.out.println("Não é possível abrir o menu!");
        }
    }

    @Override
    public void fecharMenu(){
        if (this.getLigado()) {
            System.out.println("Fechando menu.....");
        }
    }

    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else if(this.getVolume() == 100){
            System.out.println("Volume já está no máximo!");
        }else{
            System.out.println("Não é possível aumentar o volume");
        }
    }

    @Override
    public void menosVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else if(this.getVolume() == 0){
            System.out.println("Volume 0, não é possível baixar mais");
        }else{
            System.out.println("Impossível abaixar o volume!");
        }
    }
    
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Não é possível deixar mudo!");
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Não é possível desligar o mudo!");
        }
    }
    
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir!");
        }
    }
    
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar!");
        }
    }
    
    public ControleRemoto(){
        this.setVolume(100);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }
}