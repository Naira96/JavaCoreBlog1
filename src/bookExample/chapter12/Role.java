package bookExample.chapter12;

public enum Role {
    ADMIN(300000),
    USER(400000),
    MANAGER(450000),
    GUEST;

    private int salary;
    Role(int salary) {
        this.salary = salary;
    }

    Role() {
    }

    public int getSalary() {
        return salary;
    }
}
