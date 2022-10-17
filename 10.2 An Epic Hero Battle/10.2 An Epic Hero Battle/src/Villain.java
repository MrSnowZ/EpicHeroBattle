public class Villain
{
    private String name;
    private Hero nemesis;
    private int health;
    private int damage;

    public Villain (String v1, Hero nemesis, int h1, int d1)
	{
		name = v1;
		this.nemesis = nemesis;
		health = h1;
        damage = d1;
	}

    public void setDamage(int damage)
    {
        health = health - damage;
    }
    
    public int getDamage()
    {
        return damage;
    }

    public Villain(String name, Hero nemesis) 
    {
        this.name = name;
        this.nemesis = nemesis;
    }

    public Villain() 
    {
        this.name = "Trevor";
        this.nemesis = new Hero("Flight",1,100,50);
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Hero getNemesis() 
    {
        return nemesis;
    }

    public void setNemesis(Hero nemesis) 
    {
        this.nemesis = nemesis;
    }

    public void setHealth(int health) 
    {
        this.health = health;
    }

    public int getHealth() 
    {
        return health;
    }

    public void attackVillain(Hero target, int damage) 
    {
        target.setHealth(target.getHealth() - damage);
        System.out.println("Trevor has attacked Higgins. He has dealt " + damage + " damage");
        if (target.getHealth() <= 0) 
        {
            System.out.println("Trevor has defeated Higgins!");
        }
    }
}