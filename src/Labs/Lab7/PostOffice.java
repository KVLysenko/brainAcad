package Labs.Lab7;

import java.util.Arrays;

public class PostOffice {
    private int EmployeesNum;
    private String adress;
    static final String deliveryServiceName = "Nova Poshta";

    public int getEmployeesNum() {
        return EmployeesNum;
    }

    public void setEmployeesNum(int employeesNum) {
        EmployeesNum = employeesNum;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public static String getDeliveryServiceName() {
        return deliveryServiceName;
    }

    @Override
    public String toString() {
        return "PostOffice{" +
                "EmployeesNum=" + EmployeesNum +
                ", adress='" + adress + '\'' +
                '}';
    }

    public void send(int[] parcel){
        System.out.println("Посылка " + Arrays.toString(parcel) + " отправлена");
    }


    static double calculateVolumeWeight(double dl, double width, double height){
        return dl * width * height / 3000;
    }
}
