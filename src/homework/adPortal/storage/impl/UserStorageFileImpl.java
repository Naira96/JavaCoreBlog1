package homework.adPortal.storage.impl;

import homework.adPortal.UserStorage;
import homework.adPortal.models.User;
import homework.adPortal.util.FileUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class UserStorageFileImpl implements UserStorage {
    private Map<String, User> userMap;

    public UserStorageFileImpl() {
        userMap = FileUtil.deserializeUserMap();
    }

    @Override
    public void add(User user) {
        userMap.put(user.getPhoneNumber(), user);
        FileUtil.serializeUserMap(userMap);
    }

    @Override
    public User getByPhone(String phone) {
        return userMap.get(phone);
    }
}
