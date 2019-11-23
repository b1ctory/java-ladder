package model.user;

public class User {
    static final int MAX_NAME_LENGTH = 5;
    private String name;

    public User(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("이름은 한글자 이상 입력하세요.");
        }
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 다섯글자 이하로 입력해주세요.");
        }
        if (name.equals("all")) {
            throw new IllegalArgumentException("all 이라는 이름은 사용할 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}