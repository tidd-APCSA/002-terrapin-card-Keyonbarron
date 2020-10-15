public class CardRunner {
    public static void main(String args[]){
        // ☕
        
        TerrapinCard niceBilly = new TerrapinCard(20);
        TerrapinCard niceBrian = new TerrapinCard(30);
        
        niceBilly.payGourmet();
        niceBrian.payEconomical();
        
        System.out.println("Billy: "+niceBilly);
        System.out.println("Brian: "+niceBrian);
        
        niceBilly.loadMoney(20);
        niceBrian.payGourmet();
        
        System.out.println("Billy: "+niceBilly);
        System.out.println("Brian: "+niceBrian);
        
        niceBilly.payEconomical();
        niceBilly.payEconomical();
        niceBrian.loadMoney(50);
        
        System.out.println("Billy: "+niceBilly);
        System.out.println("Brian: "+niceBrian);
        
    }
}
