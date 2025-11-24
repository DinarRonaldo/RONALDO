public class Warrior extends GameCharacter {
	private double strength;
	private double armor;
	private String weaponType;
	
	public Warrior(String name, int level, double health, double mana, double strength, double armor, String weaponType) {
        super(name, level, health, mana);
        this.strength = strength;
        this.armor = armor;
        this.weaponType = weaponType;
	}
	
	@Override
	public void displayInfo() {
        System.out.println("Воин");
        System.out.println("Имя: " + getName());
        System.out.println("Уровень: " + getLevel());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Мана: " + getMana());
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
        System.out.println("Оружие: " + weaponType);
        if (isAlive == true) {
			System.out.println("Состояние: " + "Жив");
		} else {
			System.out.println("Состояние: " + "Мертв");
		}
	}
	
	@Override
    public void useSpecialAbility() {
        System.out.println(getName() + " использует: Берсерк");
    }
	
	@Override
	public void attack(String weapon) {
        System.out.println(getName() + " атакует с помощью: " + weapon);
    }
}