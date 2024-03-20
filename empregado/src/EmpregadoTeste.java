public class EmpregadoTeste {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("caio", "Sousa",  12550);
        Empregado empregado2 = new Empregado("Wendson", "Kauã",  22340);

        empregado1.AumentoSalario();
        empregado2.AumentoSalario();

        System.out.println("Empregado 1:");
        System.out.println("\n");
        
        System.out.println("nome: " + empregado1.getNome());
        System.out.println("Sobrenome: " + empregado1.getSobrenome());
        System.out.printf("Salário antigo: %.2f", (empregado1.getSalario()) / 1.1);
        System.out.printf("\nSalário novo: %.2f", empregado1.getSalario());
        
        System.out.println("\n");
        System.out.println("Empregado 2:");
        System.out.println("\n");

        System.out.println("nome: " + empregado2.getNome());
        System.out.println("Sobrenome: " + empregado2.getSobrenome());
        System.out.printf("Salário antigo: %.2f", (empregado2.getSalario()) / 1.1);
        System.out.printf("\nSalário novo: %.2f", empregado2.getSalario());

    }
}
