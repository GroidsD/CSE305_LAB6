package NewLab6;

import java.util.Calendar;

public class HiPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;


    
    public String getPriority() {
        return priority;
    }

    public String getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Emergency";
    }

    @Override
    public void setExpire(String expireDay) {
        // Set expire to current day
        Calendar calendar = Calendar.getInstance();
        this.expireDay = String.format("%1$td/%1$tm/%1$tY", calendar);
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accept";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our administrator will contact you immediately!");
    }
}
class HiPriorityConcreteCreator extends RequestCreator {
    @Override
    RequestProduct createRequest() {

        return new HiPriorityConcrete();
    }
}
