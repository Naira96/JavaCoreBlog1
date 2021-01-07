package bookExample.chapter12;

public class UserTest {
    public static void main(String[] args) {
   String role = "ADMIN";
        User user = new User("Poxos", "Poxosyan", "bjbsknh@mail.com",
                "poxos", "1216326325", Role.valueOf(role.toUpperCase()));

//        String role = Role.ADMIN.name(); //to String
//        System.out.println(role);
//        System.out.println(user.getRole() == Role.ADMIN);
//        System.out.println("Choose from roles");
        //  Role allRoles[] = Role.values
//        for (Role role : Role.values()) {
//        System.out.println(role);
//        }
//        Role role;
//        role = Role.ADMIN;
//        switch (role) {
//            case ADMIN:
//                //...
//                break;
//            case GUEST:
//                //...
//                break;
//        }
//
        System.out.println(Role.ADMIN.getSalary());
        System.out.println(Role.MANAGER.getSalary());
        System.out.println(Role.ADMIN.ordinal());
        // ordinal() -- dasavorutyun
        //compareTo()-- hamematel
        //equals
    }
}
