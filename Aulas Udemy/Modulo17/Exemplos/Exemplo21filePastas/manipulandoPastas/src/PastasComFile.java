import java.io.File;
import java.util.Scanner;

public class PastasComFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caminho de pasta: ");
        String strPpath = sc.nextLine();

        File path = new File(strPpath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("PASTAS: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(strPpath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso! " + success);

        sc.close();
    }
}
