class Archer extends GameCharacter {
    private double agility;
    private double accuracy;
    private String arrowType;
    
    public Archer(String name, int level, double health, double mana,
                  double agility, double accuracy, String arrowType) {
        super(name, level, health, mana);
        this.agility = agility;
        this.accuracy = accuracy;
        this.arrowType = arrowType;
    }
    
    public Archer(String name, String arrowType) {
        super(name);
        this.agility = 8.0;
        this.accuracy = 7.0;
        this.arrowType = arrowType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Лучник");
        System.out.println("Имя: " + getName());
        System.out.println("Уровень: " + getLevel());
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Мана: " + getMana());
        System.out.println("Ловкость: " + agility);
        System.out.println("Меткость: " + accuracy);
        System.out.println("Тип стрел: " + arrowType);
        if (isAlive == true) {
			System.out.println("Состояние: " + "Жив");
		} else {
			System.out.println("Состояние: " + "Мертв");
		}
    }
    
    @Override
    public void useSpecialAbility() {
        System.out.println(getName() + " использует Прицельный выстрел");
    }
    
    public void attack(String target, double distance) {
        System.out.println(getName() + " атакует " + target + " с расстояния " + distance);
    }
}