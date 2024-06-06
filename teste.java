public class teste {
    public static void main(String[] args){
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        //for tradicional
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("-------------------");
        //for do tipo "for each"
        for (String nomes : vect) {
            System.out.println(nomes);
        }
    }
}
