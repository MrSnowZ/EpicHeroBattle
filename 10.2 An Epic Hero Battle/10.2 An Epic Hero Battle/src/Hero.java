    
    //Write a class called Hero with the variables String superPower and int badGuysCaught. 
    // Write a getter and a setter for each variable.
public class Hero {
    private String superPower;
    private int badGuysCaught;
    private int health;
    private int damage;

    public Hero (String s1, int num1, int h1, int d1)
	{
		superPower = s1;
		badGuysCaught = num1;
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

    public void setSuperPower(String superPower) 
    {
        this.superPower = superPower;
    }

    public void setBadGuysCaught(int badGuysCaught) 
    {
        this.badGuysCaught = badGuysCaught;
    }
        
    public String getSuperPower() 
    {
        return superPower;
    }

        
    public int getBadGuysCaught() 
    {
        return badGuysCaught;
    }

    public void setHealth(int health) 
    {
        this.health = health;
    }

    public int getHealth() 
    {
        return health;
    }

    //Add an attack(Villain target, int damage) instance method to your Hero Class that will attack a villain, reducing its health by the damage amount. Print out a message that describes what happens (e.g. "Batman has attacked Joker. He has dealt 2 damage") If the villain's health is 0 or less, print a victory message of your choosing.
    public void attackHero(Villain target, int damage) 
    {
        target.setHealth(target.getHealth() - damage);
        System.out.println("Higgins has attacked Trevor. He has dealt " + damage + " damage");
        if (target.getHealth() <= 0) 
        {
            System.out.println("Higgins has defeated Trevor!");
        }
    }
        
}