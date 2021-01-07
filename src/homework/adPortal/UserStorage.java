package homework.adPortal;

import homework.adPortal.models.User;

public interface UserStorage {
    void add(User user);

    User getByPhone(String phone);
}
