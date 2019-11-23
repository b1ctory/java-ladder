package model.ladder;

import util.LadderRule;

import java.util.ArrayList;
import java.util.List;

public class LadderLine {
    private static final String HORIZONTAL_LINE = "|";
    private List<Point> points = new ArrayList<>();

    public LadderLine(int countPerson, LadderRule ladderRule) {
        generatePoints(countPerson, ladderRule);
    }

    private void generatePoints(int countPerson, LadderRule ladderRule) {
        points.add(Point.generateFirstPoint(ladderRule.isPoint()));
        for (int i = 0; i < countPerson - 1; i++) {
            points.add(Point.generateNextPoint(points.get(i), countPerson - 1, ladderRule.isPoint()));
        }
    }

    public int move(int pointIndex) {
        return points.get(pointIndex).move();
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return HORIZONTAL_LINE;
    }
}
