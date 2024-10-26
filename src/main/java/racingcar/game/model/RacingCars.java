package racingcar.game.model;

import java.util.List;
import racingcar.game.model.util.RandomNumberGenerator;

public class RacingCars {
    private final List<Car> cars;

    public RacingCars(List<Car> cars) {
        this.cars = cars;
    }

    public void race() {
        this.cars.forEach(car -> {
            int randomNumber = RandomNumberGenerator.generate();
            moveIfCan(car, randomNumber);
        });
    }

    public Winners retrieveWinners() {
        int maxMoveCount = findMaxMoveCount();
        List<Car> winners = cars.stream()
                .filter(car -> car.hasMoveCount(maxMoveCount))
                .toList();

        return new Winners(winners);
    }

    public List<Car> getParticipatingCars() {
        return cars.stream()
                .toList();
    }

    private int findMaxMoveCount() {
        return cars.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);
    }

    private void moveIfCan(Car car, int randomNumber) {
        if (randomNumber < 4) {
            return;
        }

        car.increaseMoveCount();
    }
}