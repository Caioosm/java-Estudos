package entities;

//nesse caso não é possível herdar pois a classe "savingsAccount" é do tipo final
// public class savingsAccountPlus extends SavingsAccount{

// }
public class SavingsAccountPlus extends SavingsAccount{

    //nesse caso não é possível fazer a sobrescrita de método pois o método principal é do tipo final
    // @Override
    // public void saqque(double amount){
    //     balance -= amount + 2;
    // }


}

//praq?
//Segurança: as vezes é desejável, dentro de algum tipo de regra de negócios, que uma classe não seja herdada ou um método não seja sobreposto.
