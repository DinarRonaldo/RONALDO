class Mage extends GameCharacter {
    private double intelligence;
    private double spellPower;
    private String element;
    
    public Mage(String name, int level, double health, double mana, double intelligence, double spellPower, String element) {
        super(name, level, health, mana);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
        this.element = element;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Маг");
        System.out.println("Имя: " + getName());
        System.out.println("Уровень: " + getLevel());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Мана: " + getMana());
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Сила заклинаний: " + spellPower);
        System.out.println("Стихия: " + element);
        if (isAlive == true) {
			System.out.println("Состояние: " + "Жив");
		} else {
			System.out.println("Состояние: " + "Мертв");
		}
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " использует: Магический щит");
    }
    
    public void castSpell(String spellName) {
        System.out.println(getName() + " произносит заклинание: " + spellName);
    }
    
    public void meditate() {
        System.out.println(getName() + " медитирует");
    }
}