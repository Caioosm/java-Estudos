public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        // TODO Auto-generated method stub
        return "Livro {" + "titulo = " + titulo + "\n, autor = " + autor + "\n, totPaginas = " + totPaginas + "\n PagAtual = " + pagAtual + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() + "\n, idade = " + leitor.getIdade() + "\n, Sexo = " + leitor.getSexo();
    }
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.aberto = false;
        this.pagAtual = 0;
        this.setLeitor(leitor);;
    }
    

    //get e set para titulo
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //get e set para autor
    public String getAutor() {
        return this.titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //get e set para total de paginas
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    //get e set para pagina atual
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    // get e set para leitor
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // get e set para aberto
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        this.aberto = true;
    }

    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        this.aberto = false;
    }

    @Override
    public void folear(int p) {
        // TODO Auto-generated method stub
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
        this.pagAtual --;
    }

}
