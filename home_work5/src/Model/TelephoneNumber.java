package Model;

import java.io.Serializable;

public class TelephoneNumber implements Serializable {
    private String countryCode;
    private String operatorCode;
    private String phoneNumber;

    public TelephoneNumber(String countryCode, String operatorCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.operatorCode = operatorCode;
        this.phoneNumber = phoneNumber;
    }
    public TelephoneNumber(String phoneNumber) {
        phoneParser(phoneNumber);
    }
    private void phoneParser(String phone){
        String phoneNum = phone.replaceAll("\\D", "");
        this.countryCode = phoneNum.substring(0,1);
        this.operatorCode = phoneNum.substring(1,4);
        this.phoneNumber = phoneNum.substring(4);
    }

    @Override
    public String toString() {
        return "+" + countryCode + " (" + operatorCode + ")" + phoneNumber;
    }
}
