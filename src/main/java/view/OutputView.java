package view;

import model.ladder.Ladder;
import model.ladder.LadderLine;
import model.user.UserGroup;

public class OutputView {
    private static final String HORIZONTAL_LINE = "|";
    private static final String VERTICAL_LINE = "-----";
    private static final String EMPTY_LINE = "     ";
    private static final int NAME_CONTAINER = 6;

    public static void printResult(Ladder ladder, UserGroup userGroup) {
        System.out.println("\n실행 결과\n");
        printName(userGroup);
        drawLadder(ladder);
    }

    private static void printName(UserGroup userGroup) {
        userGroup.getUserList().stream()
                .forEach(x -> System.out.print(x.toString() + nameInterval(x.toString().length())));
        System.out.println();
    }

    private static void drawLadder(Ladder ladder) {
        for (LadderLine line : ladder.getLines()) {
            drawHorizontalLine(line);
            System.out.println();
        }
    }

    private static void drawHorizontalLine(LadderLine line) {
        for (Boolean b : line.getPoints()) {
            System.out.print(HORIZONTAL_LINE);
            lineOrEmpty(b);
        }
    }

    private static void lineOrEmpty(boolean isPoint) {
        if (isPoint) {
            drawLine();
            return;
        }
        drawEmpty();
    }

    private static void drawLine() {
        System.out.print(VERTICAL_LINE);
    }

    private static void drawEmpty() {
        System.out.print(EMPTY_LINE);
    }

    public static String nameInterval(int nameLength) {
        StringBuilder interval = new StringBuilder();
        for (int i = 0; i < NAME_CONTAINER - nameLength; i++) {
            interval.append(" ");
        }
        return interval.toString();
    }
}