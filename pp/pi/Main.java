public class Main {
    public static void main(String[] args) {
        
        // 6. Добавляем птиц в массив зоопарка (восходящее преобразование)
        Animal[] zoo = {
            new Dog("Шарик"),        // Восходящее преобразование: Dog > Animal
            new Cat("Мурка"),        // Восходящее преобразование: Cat > Animal
            new Bird("Кеша", true),  // Восходящее преобразование: Bird > Animal
            new Bird("Пингвин", false), // Восходящее преобразование: Bird > Animal
            new Dog("Бобик"),        // Восходящее преобразование: Dog > Animal
            new Bird("Сокол", true)  // Восходящее преобразование: Bird > Animal
        };
        
        System.out.println("=== a) ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА ===");
        System.out.println("Все животные издают звуки через общий цикл:\n");
        
        // a) Полиморфизм: все животные издают звуки через общий цикл
        for (Animal animal : zoo) {
            animal.makeSound(); // Каждое животное вызывает СВОЮ версию метода!
        }
        
        System.out.println("\n=== b) ДЕМОНСТРАЦИЯ ПРИВЕДЕНИЯ ТИПОВ ===");
        System.out.println("Только птицы могут летать (используем instanceof):\n");
        
        // b) Приведение типов: только птицы могут летать (используем instanceof)
        for (Animal animal : zoo) {
            if (animal instanceof Bird) { // Проверяем, является ли животное птицей
                Bird bird = (Bird) animal; // Приведение типов: Animal > Bird
                bird.fly(); // Теперь можем вызвать метод fly()
            }
        }
        
        System.out.println("\n=== ДОПОЛНИТЕЛЬНАЯ ИНФОРМАЦИЯ ===");
        // Покажем какие животные есть в зоопарке
        for (Animal animal : zoo) {
            System.out.print("- " + animal.getName() + " - ");
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                System.out.println("птица (летает: " + bird.isCanFly() + ")");
            } else if (animal instanceof Dog) {
                System.out.println("собака");
            } else if (animal instanceof Cat) {
                System.out.println("кот");
            }
        }
        
        System.out.println("\nВсего животных в зоопарке: " + zoo.length);
    }
}