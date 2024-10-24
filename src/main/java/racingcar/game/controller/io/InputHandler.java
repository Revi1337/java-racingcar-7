package racingcar.game.controller.io;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import racingcar.game.controller.model.Car;

public class InputHandler {
    private static final String NAME_SPLIT_DELIMITER = ",";
    private static final String UNSUPPORTED_ATTEMPT_COUNT_TYPE = "시도할 횟수는 문자일 수 없습니다.";

    public List<Car> getCarNamesFromUser() {
        String carNames = Console.readLine();

        return Arrays.stream(carNames.split(NAME_SPLIT_DELIMITER))
                .map(Car::create)
                .toList();
    }

    public int getAttemptCountFromUser() {
        String attemptCount = Console.readLine();

        return parseAsInteger(attemptCount);
    }

    private int parseAsInteger(String attemptCount) {
        try {
            return Integer.parseInt(attemptCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(UNSUPPORTED_ATTEMPT_COUNT_TYPE);
        }
    }
}