package model.ladder;

import util.LadderRule;
import util.RandomLadderPoint;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int MIN_LADDER_HEIGHT = 1;

    private List<LadderLine> lines = new ArrayList<>();

    public Ladder(int height, int countPerson) {
        this(height, countPerson, new RandomLadderPoint());
    }

    public Ladder(int height, int countPerson, LadderRule rule) {
        checkLadderHeight(height);
        for (int i = 0; i < height; i++) {
            lines.add(new LadderLine(countPerson, rule));
        }
    }

    private void checkLadderHeight(int height) {
        if (height < MIN_LADDER_HEIGHT) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야 합니다.");
        }
    }

    public int getEndPoint(int index) {
        int endPoint = index;
        for (LadderLine line : lines) {
            endPoint = line.move(endPoint);
        }
        return endPoint;
    }

    public List<LadderLine> getLines() {
        return lines;
    }
}