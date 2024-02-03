public class Human extends Participant {

    // Конструктор класса, вызывает конструктор родительского класса (Participant)
    public Human(String name, int maxRunSpeed, double maxJumpHeight) {
        // Вызов конструктора родительского класса с передачей аргументов
        super(name, maxRunSpeed, maxJumpHeight);
    }
}
