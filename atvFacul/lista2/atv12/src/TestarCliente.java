public class TestarCliente {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente("Caio", "rua 2 da silva", 1200f);
        Cliente cliente2 = new Cliente("Joao", "rua 3 do norte", 4200f);
        Cliente cliente3 = new Cliente("Lula", "rua faz o L", 1250f);

        System.out.println("-------------------------");
        cliente1.infoCliente();
        System.out.println("-------------------------");
        cliente2.infoCliente();
        System.out.println("-------------------------");
        cliente3.infoCliente();
        System.out.println("-------------------------");
    }
}
