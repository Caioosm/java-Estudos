public class Fatura {
    private String Numero;
    private String Desc;
    private int Item;
    private double Precoitem;

    public Fatura(String Numero, String Desc, int Item, double Precoitem) {
        this.Numero = Numero;
        this.Desc = Desc;
        this.Item = Item;
        this.Precoitem = Precoitem;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int Item) {
        if (Item >= 0) {
            this.Item = Item;
        } else {
            this.Item = 0;
        }
    }

    public double getPrecoitem() {
        return Precoitem;
    }

    public void setPrecoitem(double Precoitem) {
        if (Precoitem >= 0.0) {
            this.Precoitem= Precoitem;
        }else{
            this.Precoitem = 0.0;
        }
    }

    public double getTotalFatura() {
        double total = Item * Precoitem;
        return Math.max(total, 0.0);
    }
}
