package tester2;

import org.w3c.dom.ls.LSOutput;
import tester.FIrst;
import tester.Third;
//import tester.Third;

public class Fourth {
    private int age;
    private String user;
    private String mobileNumber;

    public Fourth(int age, String user, String mobileNumber) {
        this.age = age;
        this.user = user;
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    Four four = new Four(35, "Round", "890234");
    FIrst obj2 = new FIrst(20, "Grace","234-98067","Wednesday");
    Third third3 = new Third(29, "Tally", "4589890");

}
