package model.ladder;

import util.RandomLadderPoint;

import java.util.ArrayList;
import java.util.List;

public class LadderLine {
    private List<Boolean> points = new ArrayList<>();

    public LadderLine(int countPerson) {
        this(countPerson, new RandomLadderPoint());
    }

    private LadderLine(int countPerson, RandomLadderPoint point) {
        generatePoints(countPerson, point);
    }

    private List<Boolean> generatePoints(int countPerson, RandomLadderPoint point) {
        boolean before = false;
        for (int i = 0; i < countPerson - 1; i++) {
            points.add(!before && point.isPoint());
            before = points.get(i);
        }
        points.add(false);
        return points;
    }

    public List<Boolean> getPoints() {
        return points;
    }
}
