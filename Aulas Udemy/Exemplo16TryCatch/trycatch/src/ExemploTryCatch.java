import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) throws Exception {

        method1();
        System.out.println("Fim!");
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");

        method2();

        System.out.println("***METHOD1 END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);
        
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        }
        catch(InputMismatchException e){
            System.out.println("input error");
        }
        
        sc.close();
        System.out.println("***METHOD2 END***");
    }
}
