package model.reward;

public class Reward {
    private static final int MAX_NAME_LENGTH = 5;
    private String rewardName;

    public Reward(String rewardName) {
        checkRewardName(rewardName);
        this.rewardName = rewardName;
    }

    private void checkRewardName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("결과 내용은 한글자 이상 입력하세요.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("결과 내용은 다섯글자 이하로 입력해주세요.");
        }
    }

    @Override
    public String toString() {
        return this.rewardName;
    }
}
