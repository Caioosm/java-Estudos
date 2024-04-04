public class FaturaTeste {
    public static void main(String[] args) {
        // Criando uma instância de Fatura
        Fatura fatura = new Fatura("001", "Teclado", 2, 25.5);

        // Exibindo informações da fatura
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDesc());
        System.out.println("Quantidade: " + fatura.getItem());
        System.out.println("Preço por Item: " + fatura.getPrecoitem());

        // Calculando e exibindo o total da fatura
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
    }
}
