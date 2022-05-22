import java.util.ArrayList;
import java.util.List;

public class Beneficiary extends User{

    private int noPersons = 1;
    private RequestDonationList receivedList;
    private Requests requestsList;

    public Beneficiary(){}

    public Beneficiary(String name, String phone, int noPersons) {
        super(name, phone);
        this.noPersons = noPersons;
    }

    public int getNoPersons() {
        return noPersons;
    }

    public void setNoPersons(int noPersons) {
        this.noPersons = noPersons;
    }

    public RequestDonationList getReceivedList() {
        return receivedList;
    }

    public void setReceivedList(RequestDonationList receivedList) {
        this.receivedList = receivedList;
    }

    public Requests getRequestsList() {
        return requestsList;
    }

    public void setRequestsList(Requests requestsList) {
        this.requestsList = requestsList;
    }
}

