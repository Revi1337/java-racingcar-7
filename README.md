# java-racingcar-precourse

## 개인적 목표

- [ ] 처음부터 좋은 설계를 가져가는 것도 좋지만, 최소 기능을 만족하는 프로그램을 만들고 이를 한단계씩 리팩토링해가며 그 이유를 설명할 수 있게 코드를 구현한다.

    - [ ] 최소 기능을 만족하는 프로그램을 완성한다.
    - [ ] 메서드가 한 가지 일만 하도록 최대한 만들고, 네이밍을 통해 메서드의 의도를 드러내고, 추상화 레벨을 맞춘다.
    - [ ] 여러 객체로 나누어 책임을 분산시키고 SRP 를 준수한다.

- [ ] 누군가 내 코드를 읽을때, 중간에 멈추지 않을 수 있을 정도로 추상화 레벨을 맞춘다.
- [ ] 필연적으로 도메인 객체들이 생길텐데, 객체의 값을 강제로 Getter 로 꺼내어 값을 비교하지 않고, `객체에게 질문` 을 던져 객체지향적인 사고를 넓힌다.
- [ ] 단위 테스트를 작성할때, HappyCase 와 EdgeCase 의 구분을 명확히 하기 위해 `Inner Class` 와 `@Nested` 를 활용한다.
- [ ] Commit 을 찍을 때, Header 뿐만아니라 Body 를 이용해, 하나의 Commit 에서 이루어진 모든 행동들을 표현한다.

## 기능 명세

- [x] [출력] 경주할 자동차들을 입력하라는 메시지를 출력하는 기능

- [x] [입력] 경주할 자동차들을 입력받는 기능

    - [x] [예외] 쉼표로 구분한 각 자동차 이름의 길이가 5 를 넘으면 예외

- [x] [출력] 몇번을 이동할지 횟수를 입력하는 메시지를 출력하는 기능

- [ ] [입력] 몇번을 이동할지 횟수를 입력받는 기능

    - [ ] [예외] 입력받은 횟수가 숫자가 아니면 예외

- [ ] [계산, 출력] 이동할 횟수마다 모든 자동차를 전진 및 누적하고, 이를 출력하는 기능

    - [ ] [조건] 단, 이동할 횟수마다 각 자동차는 무작위한 숫자를 뽑는데, 이 숫자가 4 이상이면 해당 자동차는 전진한다.

- [ ] [계산] 자동차들 중에서 우승자를 추출하는 기능

    - [ ] [고려] 전진횟수가 동일하여 우승자가 2명 이상이면, 이를 `,` 로 구분한다.

- [ ] [출력] 우승자 및 우승자들을 출력하는 기능

## 프로그래밍 요구사항

- [ ] indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- [ ] 3항 연산자를 쓰지 않는다.
- [ ] 함수 또는 메서드가 한 가지 일만 하도록 최대한 작게 만들어라.
- [ ] JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.

## 1주차 피드백 수용

- [ ] 커밋 메시지를 의미 있게 작성한다.
- [ ] 배열을 사용하지 않고, Collection 을 사용한다.
- [ ] 기능을 구현하기 전, Java API 에서 기본으로 제공하는 API 가 있는지 확인하고, 있다면 이를 사용한다.
- [ ] 코드 포매팅을 사용한다.
- [ ] 공백도 코딩 컨벤션이다. (if, for, while문 사이의 공백도 코딩 컨벤션이다.)
- [ ] 공백 라인을 의미 있게 사용한다.
