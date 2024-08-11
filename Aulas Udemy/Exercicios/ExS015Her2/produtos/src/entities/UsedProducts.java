package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProducts extends Product{
    private LocalDate manufactureDate;

    public UsedProducts(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufacturDate(){
        return manufactureDate;
    }
    public void setManufactureDate(LocalDate manuFacturDate){
        this.manufactureDate = manuFacturDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $" + String.format("%.2f", getPrice()) + "(manufacture Date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")) + ")";
    }
}
