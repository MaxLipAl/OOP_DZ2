public class Main {
    public static void main(String[] args) {
        // Создаем массив участников различных типов: Human, Cat, Robot
        Participant[] participants = {
                new Human("Макс", 100, 1.4),
                new Cat("Сид", 250, 2),
                new Robot("R2D2", 3, 0.5)
        };

        // Создаем массив препятствий: Treadmill, Wall
        Obstacle[] obstacles = {
                new Treadmill(100),
                new Wall(1.5),
                new Treadmill(1000),
                new Wall(2.3)
        };

        // Проходим по каждому участнику
        for (Participant participant : participants) {
            // Флаг для отслеживания успешного прохождения всех препятствий
            boolean participantPassedAllObstacles = true;

            // Проходим по каждому препятствию
            for (Obstacle obstacle : obstacles) {
                // Если участник не прошел препятствие, устанавливаем флаг в false и выходим из цикла
                if (!obstacle.passObstacle(participant)) {
                    participantPassedAllObstacles = false;
                    break;
                }
            }

            // Выводим результат прохождения препятствий для каждого участника
            if (participantPassedAllObstacles) {
                System.out.println(participant.name + " успешно прошел все препятствия!");
            } else {
                System.out.println(participant.name + " не смог пройти все препятствия.");
            }
        }
    }
}