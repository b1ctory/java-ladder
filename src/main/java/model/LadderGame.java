package model;

import model.ladder.Ladder;
import model.user.UserGroup;

public class LadderGame {
    private UserGroup userGroup;
    private Ladder ladder;

    public LadderGame(UserGroup users, int height) {
        this.userGroup = users;
        this.ladder = new Ladder(height, userGroup.getSize());
    }

    public Ladder getLadder() {
        return ladder;
    }
}
