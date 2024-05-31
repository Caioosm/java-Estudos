public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Caio",19 , "M");
        p[1] = new Pessoa("Letícia",17 , "F");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);

        l[1].abrir();
        l[1].folear(300);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }

}
