public class Treadmill implements Obstacle {

    // Поле, характеризующее длину беговой дорожки
    int length;

    // Конструктор класса, инициализирует поле длины при создании объекта
    public Treadmill(int length) {
        this.length = length;
    }

    // Реализация метода passObstacle интерфейса Obstacle
    @Override
    public boolean passObstacle(Participant participant) {
        // Проверяем, может ли участник успешно пробежать дорожку заданной длины
        if (participant.maxRunSpeed >= length) {
            System.out.println(participant.name + " успешно пробежал дорожку длиной " + length + " метров.");
            return true;
        } else {
            System.out.println(participant.name + " не смог пробежать дорожку длиной " + length + " метров.");
            return false;
        }
    }
}
