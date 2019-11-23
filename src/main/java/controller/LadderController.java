package controller;

import model.LadderGame;
import model.LadderGameResult;
import model.reward.RewardGroup;
import model.user.UserGroup;
import view.InputView;
import view.OutputView;

public class LadderController {
    UserGroup users = registerUsers();
    RewardGroup rewardGroup = createRewards(users.getSize());

    LadderGame ladderGame = makeLadderGame(users, rewardGroup);
    LadderGameResult ladderGameResult = ladderGame.playingGame(users, rewardGroup);

    private static UserGroup registerUsers() {
            return new UserGroup(InputView.inputNames());
    }

    private static LadderGame makeLadderGame(UserGroup users, RewardGroup rewardGroup) {
        return new LadderGame(users, InputView.inputLadderHeight());
    }

    private static RewardGroup createRewards(int rewardSize) {
        return new RewardGroup(InputView.inputRewards(), rewardSize);
    }

    public void gameResult() {
        OutputView.printLadderResult(ladderGame.getLadder(), users, rewardGroup);
        while(!ladderGameResult.isEnd()) {
            OutputView.printGameResult(ladderGameResult);
        }
    }
}