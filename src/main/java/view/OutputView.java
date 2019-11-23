package view;

import model.LadderGameResult;
import model.ladder.Ladder;
import model.ladder.LadderLine;
import model.ladder.Point;
import model.reward.RewardGroup;
import model.user.UserGroup;

import java.util.List;

public class OutputView {
    private static final int NAME_CONTAINER = 6;

    public static void printLadderResult(Ladder ladder, UserGroup userGroup, RewardGroup rewardGroup) {
        System.out.println("\n사다리 결과\n");
        printName(userGroup);
        drawLadder(ladder);
        printRewards(rewardGroup);
        System.out.println();
    }

    private static void printName(UserGroup userGroup) {
        userGroup.getUserList().stream()
                .forEach(x -> System.out.print(x.toString() + nameInterval(x.toString().length())));
        System.out.println();
    }

    public static String nameInterval(int nameLength) {
        StringBuilder interval = new StringBuilder();
        for (int i = 0; i < NAME_CONTAINER - nameLength; i++) {
            interval.append(" ");
        }
        return interval.toString();
    }

    private static void drawLadder(Ladder ladder) {
        for (LadderLine line : ladder.getLines()) {
            drawHorizontalLine(line);
            System.out.println();
        }
    }

    private static void drawHorizontalLine(LadderLine line) {
        for (Point p : line.getPoints()) {
            System.out.print(line.toString() + p.toString());
        }
    }

    private static void printRewards(RewardGroup rewardGroup) {
        rewardGroup.getRewardList()
                .forEach(reward -> System.out.print(reward.toString() + nameInterval((reward.toString().length()))));
        System.out.println();
    }

    public static void printGameResult(LadderGameResult ladderGameResult) {
        List<String> names = InputView.inputResultName();
        System.out.println("\n실행 결과");
        ladderGameResult.getResult(names).entrySet()
                    .forEach(entry -> printResult(entry.getKey(), entry.getValue()));
        System.out.println();
    }

    private static void printResult(String name, String reward) {
        System.out.println(name + " : " + reward);
    }
}