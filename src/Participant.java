public class Participant {

    // Поля, характеризующие участника
    String name; // Имя участника
    int maxRunSpeed; // Максимальная скорость бега участника
    double maxJumpHeight; // Максимальная высота прыжка участника

    // Конструктор класса, инициализирует поля участника при создании объекта
    public Participant(String name, int maxRunSpeed, double maxJumpHeight) {
        this.name = name;
        this.maxRunSpeed = maxRunSpeed;
        this.maxJumpHeight = maxJumpHeight;
    }

    // Метод выводит информацию о беге участника на указанное расстояние
    public void run(int distance) {
        System.out.println(name + " бежит на расстояние " + distance + " метров.");
    }

    // Метод выводит информацию о прыжке участника на указанную высоту
    public void jump(double height) {
        System.out.println(name + " прыгает на высоту " + height + " метра.");
    }
}
