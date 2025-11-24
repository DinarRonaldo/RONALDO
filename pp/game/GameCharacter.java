public class GameCharacter {
	private String name;
	private int level;
	private double health;
	private double mana;
	private boolean isAlive;
	
	private static int totalCharacters = 0;
	private static final int MAX_LEVEL = 100;
	
	public static void getTotalCharacters() {
		return totalCharacters;
	}
	
	public GameCharacter() {
		name = "Unknown";
		level = 0;
		health = 0.0;
		mana = 0.0;
		isAlive = true;
		totalCharacters++;
	}
	
	public GameCharacter(String name, int level, double health, double mana, boolean isAlive) {
		this.name = name;
		this.level = level;
		this.health = health;
		this.mana = mana;
		this.isAlive = isAlive;
		totalCharacters++;
	}
	
	public String getName() {
		return name;
	}
	
    public void setName(String name) {
		this.name = name;
	}
    
    public int getLevel() {
		return level; 
	}
	
    public void setLevel(int level) {
		this.level = level; 
	}
    
    public double getHealth() {
		return health;
	}
	
    public void setHealth(double health) { 
        this.health = health; 
        if (this.health <= 0) {
            this.health = 0;
            this.isAlive = false;
        }
    }
    
    public double getMana() {
		return mana; 
	}
	
    public void setMana(double mana) {
		this.mana = mana;
	}
    
    public boolean isAlive() {
		return isAlive; 
	}
	
    public void setAlive(boolean isAlive) {
		this.isAlive = isAlive; 
	}
    
	public abstract void displayInfo();
    public abstract void useSpecialAbility();
	
	public void attack() {
        System.out.println(name + " атакует");
    }
	
	public void takeDamage(double damage) {
        if (isAlive) {
            health -= damage;
            System.out.println(name + " получает " + damage + " урона");
            if (health <= 0) {
                health = 0;
                isAlive = false;
                System.out.println(name + " погиб");
            }
        }
    }
	
	public void heal(double amount) {
        if (isAlive) {
            health += amount;
            System.out.println(name + " восстанавливает " + amount + " здоровья");
        }
    }
}