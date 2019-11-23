package model.ladder;

public class Direction {
    private final int BACKWARD_VALUE = -1;
    private final int STAY_VALUE = 0;
    private final int FORWARD_VALUE = 1;
    private final boolean left;
    private final boolean current;

    public Direction(boolean left, boolean current) {
        this.left = left;
        this.current = current;
    }

    public static Direction of(boolean left, boolean right) {
        return new Direction(left, right);
    }

    public static Direction first(boolean current) {
        return new Direction(false, current);
    }

    public int move() {
        if (this.left) {
            return BACKWARD_VALUE;
        }
        if (this.current) {
            return FORWARD_VALUE;
        }
        return STAY_VALUE;
    }

    public Direction last() {
        return new Direction(this.current, false);
    }

    public Direction next(boolean nextCurrent) {
        if (this.current) {
            return of(this.current, false);
        }
        return of(this.current, nextCurrent);
    }

    public boolean isRightDirection(Object o) {
        Direction direction = (Direction) o;
        return left == direction.left && current == direction.current;
    }
}
