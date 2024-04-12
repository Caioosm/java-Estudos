public class Aula05 {
    public static void main(String[] args) throws Exception {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("juninho da boca");
        pessoa1.AbrirConta("CC");
        pessoa1.depositar(100);
        pessoa1.sacar(150);
        pessoa1.fecharConta();
        
        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.AbrirConta("CP");
        pessoa2.depositar(500);
        pessoa2.sacar(100);

        pessoa1.EstadoAtual();
        pessoa2.EstadoAtual();
        
    }
}
