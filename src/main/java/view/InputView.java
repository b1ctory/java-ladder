package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static Scanner SCANNER = new Scanner(System.in);

    public static List<String> inputNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String names = SCANNER.next();
        return Arrays.stream(names.split(","))
                .collect(Collectors.toList());
    }

    public static Integer inputLadderHeight() {
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        return SCANNER.nextInt();
    }

    public static List<String> inputRewards() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String rewards = SCANNER.next();
        return Arrays.stream(rewards.split(","))
                .collect(Collectors.toList());
    }

    public static List<String> inputResultName() {
        System.out.println("결과를 보고 싶은 사람은?");
        String names = SCANNER.next();
        return Arrays.stream(names.split(","))
                .collect(Collectors.toList());
    }
}
