public interface Obstacle {

    // Метод passObstacle принимает участника и возвращает true, если участник успешно преодолел препятствие
    // и false, если не смог пройти
    boolean passObstacle(Participant participant);
}
