package model;

import model.reward.Reward;
import model.user.User;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LadderGameResult {
    private final LinkedHashMap<User, Reward> gameResult;
    private final String END_COMMAND = "all";
    private final int END_COMMAND_LENGTH = 1;
    private final int END_COMMAND_NUM = 0;

    private boolean isEnd;

    public LadderGameResult(LinkedHashMap<User, Reward> gameResult) {
        this.gameResult = gameResult;
        this.isEnd = false;
    }

    private User findUser(String name) {
        Optional<User> user = gameResult.keySet().stream()
                .filter(x -> x.toString().equals(name))
                .findFirst();
        if (user.isPresent()) {
            return user.get();
        }
        throw new IllegalArgumentException("등록되지 않은 참가자 입니다.");
    }

    public LinkedHashMap<String, String> getResult(List<String> names) {
        names = checkInput(names);
        LinkedHashMap<String, String> gameResult = new LinkedHashMap<>();
        names.forEach(name -> gameResult.put(name, this.gameResult.get(findUser(name)).toString()));
        return gameResult;
    }

    private List<String> checkInput(final List<String> names) {
        if (names.size() == END_COMMAND_LENGTH && names.get(END_COMMAND_NUM).equals(END_COMMAND)) {
            isEnd = true;
            return gameResult.keySet().stream()
                    .map(User::toString)
                    .collect(Collectors.toList());
        }
        return names;
    }

    public boolean isEnd() {
        return isEnd;
    }
}
