package entities;

public class Individual extends TaxPayer{

    private Double healthExpeditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures){
        super(name, anualIncome);
        this.healthExpeditures = healthExpenditures;
    }

    public Double getHealthExpeditures(){
        return healthExpeditures;
    }
    public void setHealthExpeditures(Double healthExpeditures){
        this.healthExpeditures = healthExpeditures;
    }

    @Override
    public Double tax() {
        if(getAnualIncome() < 20000.0){
            return getAnualIncome() * 0.15 - healthExpeditures * 0.5;
        }else{
            return getAnualIncome() * 0.25 - healthExpeditures * 0.5;
        }
    }

}
