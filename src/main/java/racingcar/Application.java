package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;
import modules.racingcarName;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();
        String[] names_list = names.split(",");
        racingcarName.checked_car_name_len(names_list);

        System.out.println("시도할 회수는 몇회인가요?");
        String move_num = Console.readLine();
    }
}
