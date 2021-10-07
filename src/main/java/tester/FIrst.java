package tester;

//import tester2.Fifth;
import tester2.Four;
import tester2.Fourth;

public class FIrst {
    private int age;
    private String user;
    private String mobileNumber;
    private String day;

    public FIrst(int age, String user, String mobileNumber, String day) {
        this.age = age;
        this.user = user;
        this.mobileNumber = mobileNumber;
        this.day = day;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    Second second3 = new Second(32, "George", "234-67770");

    Third third3 = new Third(29, "Tally", "4589890");

    Three three3 = new Three(48, "Fati", "8906456");

    Four four = new Four(35, "Round", "890234");

    Fourth fourth1 = new Fourth(62, "Finer", "2358978");

    //Fifth fifth1 = new Fifth(67 ,"Grand", "789045");

}
