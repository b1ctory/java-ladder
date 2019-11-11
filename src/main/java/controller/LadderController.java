package controller;

import model.LadderGame;
import model.user.UserGroup;
import view.InputView;
import view.OutputView;

public class LadderController {
    private static UserGroup registerUsers() {
        return new UserGroup(InputView.inputNames());
    }

    private static LadderGame makeLadderGame(UserGroup users) {
        return new LadderGame(users, InputView.inputLadderHeight());
    }

    public void gameResult() {
        UserGroup users = LadderController.registerUsers();
        LadderGame ladderGame = LadderController.makeLadderGame(users);
        OutputView.printResult(ladderGame.getLadder(), users);
    }
}