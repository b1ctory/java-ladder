package model.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserGroup {
    private static final int MIN_USER_NUMBER = 2;

    private List<User> users;

    public UserGroup(List<String> names) {
        checkMinUsers(names);
        this.users = new ArrayList<>();
        names.stream()
                .map(name -> users.add(new User(name)))
                .collect(Collectors.toList());
    }

    private void checkMinUsers(List<String> users) {
        if (users.size() < MIN_USER_NUMBER) {
            throw new IllegalArgumentException("참가자가 두 명 이상이어야 합니다.");
        }
    }

    public List<User> getUserList() {
        return this.users;
    }

    public int getSize() {
        return users.size();
    }
}
