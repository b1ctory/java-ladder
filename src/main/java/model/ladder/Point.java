package model.ladder;

public class Point {
    private static final String VERTICAL_LINE = "-----";
    private static final String EMPTY_LINE = "     ";
    private static final int NEXT_PATH_VALUE = 1;

    private Direction direction;
    private int position;

    public Point(Direction direction, int position) {
        this.position = position;
        this.direction = direction;
    }

    public static Point generateFirstPoint(boolean b) {
        return new Point(Direction.first(b), 0);
    }

    public static Point generateNextPoint(Point currentPoint, int max, boolean availablePoint) {
        return currentPoint.nextPoint(max, availablePoint);
    }

    public int move() {
        return this.position += this.direction.move();
    }

    private Point nextPoint(int max, boolean nextCurrent) {
        if (max > position + NEXT_PATH_VALUE) {
            return new Point(direction.next(nextCurrent), position + NEXT_PATH_VALUE);
        }
        if (max == position + NEXT_PATH_VALUE) {
            return new Point(direction.last(), position + NEXT_PATH_VALUE);
        }
        throw new IllegalArgumentException();
    }

    public boolean isDirection() {
        return direction.isRightDirection(Direction.of(false, true));
    }

    @Override
    public String toString() {
        if (isDirection()) return VERTICAL_LINE;
        return EMPTY_LINE;
    }
}
