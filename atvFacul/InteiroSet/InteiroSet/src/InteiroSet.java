public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet(){
        conjunto = new boolean[101];
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            uniao.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return uniao;
    }
    public InteiroSet interseccao(InteiroSet outroConjunto) {
        InteiroSet interseccao = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            interseccao.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return interseccao;
    }

    public void insereElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = true;
        } else {
            System.out.println("Número fora do intervalo permitido (0-100)");
        }
    }

    public void deleteElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = false;
        } else {
            System.out.println("Número fora do intervalo permitido (0-100)");
        }
    }

    public String toSetString() {
        String conjuntoString = "";
        boolean primeiro = true;
        for (int i = 0; i < 101; i++) {
            if (conjunto[i]) {
                if (!primeiro) {
                    conjuntoString += " ";
                }
                conjuntoString += i;
                primeiro = false;
            }
        }
        if (conjuntoString.isEmpty()) {
            return "-";
        } else {
            return conjuntoString;
        }
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        conjunto1.insereElemento(5);
        conjunto1.insereElemento(10);
        conjunto1.insereElemento(20);

        conjunto2.insereElemento(10);
        conjunto2.insereElemento(15);
        conjunto2.insereElemento(20);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());

        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet interseccao = conjunto1.interseccao(conjunto2);
        System.out.println("Interseção: " + interseccao.toSetString());

        System.out.println("Conjunto 1 é igual ao Conjunto 2? " + conjunto1.ehIgualTo(conjunto2));
    }
}
