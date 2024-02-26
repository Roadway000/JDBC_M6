package org.example.resultset;

import java.util.Date;

public class Worker {
    private int id;
    private String name;
    private Date birthday;
    private int salary;
    public Worker(int id, String name, Date birthday, int salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
