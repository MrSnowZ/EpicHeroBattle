public class Main {
    
    public static void main(String[] args) throws Exception
    {
        //In your Main class, use your constructor to create a villain that has your previous hero as a Nemesis.
        Hero higgins = new Hero("Flight",1,100,50);
        Villain trevor = new Villain("Trevor",higgins,100,50);

        for(int i = 0; i < 10; i++)
        {
            System.out.println("---");
            trevor.attackVillain(higgins,5);
            System.out.println("---");
            higgins.attackHero(trevor, higgins.getDamage());
            higgins.attackHero(trevor,10);
            System.out.println("---");
        }

    }
}