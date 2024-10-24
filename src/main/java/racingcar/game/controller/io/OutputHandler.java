package racingcar.game.controller.io;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import racingcar.game.controller.model.Car;

public class OutputHandler {
    private static final String CAR_NAMES_NAVIGATE_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ATTEMPT_COUNT_NAVIGATE_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final String WINNER_TEMPLATE = "최종 우승자 : %s";
    private static final String CAR_PROGRESS_BAR_TEMPLATE = "%s : %s";
    private static final String WINNER_DELIMITER = ", ";

    public void showCarNamesNavigateMessage() {
        System.out.println(CAR_NAMES_NAVIGATE_MESSAGE);
    }

    public void showAttemptCountNavigateMessage() {
        System.out.println(ATTEMPT_COUNT_NAVIGATE_MESSAGE);
    }

    public void showCurrentAccumulation(List<Car> cars, Map<Car, Integer> moveAccumulator) {
        for (Car car : cars) {
            int progressiveSum = moveAccumulator.get(car);
            String carName = car.getName();
            String movedProgressBar = "-".repeat(progressiveSum);
            String formattedEachResult = String.format(CAR_PROGRESS_BAR_TEMPLATE, carName, movedProgressBar);
            System.out.println(formattedEachResult);
        }
        System.out.println();
    }

    public void showWinners(List<Car> winners) {
        String formattedWinners = formatWinners(winners);
        System.out.printf(WINNER_TEMPLATE + "\n", formattedWinners);
    }

    private String formatWinners(List<Car> winners) {
        return winners.stream()
                .map(Car::getName)
                .collect(Collectors.joining(WINNER_DELIMITER));
    }
}