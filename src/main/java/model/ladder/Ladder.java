package model.ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private static final int MIN_LADDER_HEIGHT = 1;

    private List<LadderLine> lines = new ArrayList<>();

    public Ladder(int height, int countPerson) {
        checkLadderHeight(height);
        for (int i = 0; i < height; i++) {
            lines.add(new LadderLine(countPerson));
        }
    }

    private void checkLadderHeight(int height) {
        if (height < MIN_LADDER_HEIGHT) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야 합니다.");
        }
    }

    public List<LadderLine> getLines() {
        return lines;
    }
}