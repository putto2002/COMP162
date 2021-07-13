public class ArtApp {
    public static void main(String[] args){
        Art[] collections = {new Sculpture(200, 500, 300, 25, 25000),
            new Print(800, 900, 40, 400),
            new Sculpture(350, 835, 553, 150, 4500)};

        double totalValue = 0;
        for(Art work: collections) {
            totalValue += work.value;
        }
        
        System.out.println("Total value $$$" + totalValue);
    }
    
    
}
