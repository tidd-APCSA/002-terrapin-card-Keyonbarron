public class TerrapinCard {

private double balance;

public TerrapinCard(double tbalance){
  balance= tbalance;
}


public void payEconomical(){
 if(balance <=2.4){
     double balance;
  }else{
  balance-=2.5;
}
}
public void payGourmet(){
 if(balance <=3.99){
     double balance;
  }else{
  balance-=4.00;
}
}
public void loadMoney(double amount){
 if(amount <0){
     double balance;
  
}else{
  balance+=amount;
}
  if(balance >150.0){
     balance = 150.0;
  
}
}
public double getBalance(){
  return balance;
}
public String toString(){
  return "The card has "+balance+" dollars";
}



}
  






