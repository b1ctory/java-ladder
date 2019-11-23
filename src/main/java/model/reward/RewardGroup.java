package model.reward;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RewardGroup {
    private List<Reward> rewards;

    public RewardGroup(List<String> rewardNames, int size) {
        validateRewardGroupSize(rewardNames, size);
        this.rewards = new ArrayList<>();
        rewardNames.stream()
                .map(reward -> rewards.add(new Reward(reward)))
                .collect(Collectors.toList());
    }

    private void validateRewardGroupSize(List<String> rewards, int size) {
        if (rewards.size() != size) {
            throw new IllegalArgumentException("게임 결과의 수는 게임 참가자 수와 일치해야 합니다.");
        }
    }

    public Reward getNthReward(int index) {
        return rewards.get(index);
    }

    public List<Reward> getRewardList() {
        return rewards;
    }
}
