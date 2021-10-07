package tester;

import tester2.Four;
import tester2.Fourth;

 class Second {
    private int age;
    private String name;
    private String phoneNumber;

    public Second(int age, String name, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Four four1 = new Four(37, "Rounder", "898234");

    Fourth fourth = new Fourth(60, "Fine", "235678");
}
