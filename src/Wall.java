public class Wall implements Obstacle {

    // Поле, характеризующее высоту стены
    double height;

    // Конструктор класса, инициализирует поле высоты при создании объекта
    public Wall(double height) {
        this.height = height;
    }

    // Реализация метода passObstacle интерфейса Obstacle
    @Override
    public boolean passObstacle(Participant participant) {
        // Проверяем, может ли участник успешно преодолеть стену заданной высоты
        if (participant.maxJumpHeight >= height) {
            System.out.println(participant.name + " успешно преодолел стену высотой " + height + " метров.");
            return true;
        } else {
            System.out.println(participant.name + " не смог преодолеть стену высотой " + height + " метров.");
            return false;
        }
    }
}