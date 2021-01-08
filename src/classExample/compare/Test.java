package classExample.compare;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        User user1 = new User("apoxos", "poxosyan", Gender.MALE, 24, "22", "poxos22");
        User user2 = new User("petros", "petrosyan", Gender.MALE, 22, "24", "poxos22");
//        users.add(user1);
//        users.add(user2);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(userList);
    }
}
