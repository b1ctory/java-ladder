package model;

import model.ladder.Ladder;
import model.reward.Reward;
import model.reward.RewardGroup;
import model.user.User;
import model.user.UserGroup;

import java.util.LinkedHashMap;

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

    public LadderGameResult playingGame(UserGroup userGroup, RewardGroup rewardGroup) {
        LinkedHashMap<User, Reward> ladderGameResult = new LinkedHashMap<>();
        for (int i = 0; i < userGroup.getSize(); i++) {
            ladderGameResult.put(userGroup.getNthUser(i), rewardGroup.getNthReward(ladder.getEndPoint(i)));
        }
        return new LadderGameResult(ladderGameResult);
    }
}
