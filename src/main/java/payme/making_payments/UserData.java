package payme.making_payments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserData {

    private String userFullName;
    private String userPassword;
    private String userAddress;
    private int userId;
    private String userEmail;

    public String getUserName() {
        return userName;
    }

    public UserData setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    private String userName;
    private String getUserAddress;


    public String getUserEmail() {
        return userEmail;
    }

    public UserData setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public UserData setUserFullName(String userFullName) {
        this.userFullName = userFullName;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public UserData setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public UserData setUserId(int userId) {
        this.userId = userId;
        return this;
    }
    int[] larray = new int[20];
    int[] s1array = new int[10];
    int[] s2array = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i<20;i++){
        larray[i]=Integer.parseInt(reader.readLine());
    }
        for(int i =0;i<10;i++){
        s1array[i] = larray[i];
    }
        for(int i =10;i<20;i++){
        int j =0;
        s2array[j] = larray[i];
        j++;
    }
        for(int i =0;i<10;i++){
        System.out.println(s2array[i]);
        System.out.println(i);
            System.out.println("nima");
                        System.out.println("nima");
                        System.out.println("nima");
        System.out.println("boldi");
    }

}

