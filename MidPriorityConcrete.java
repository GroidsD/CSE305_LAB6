package NewLab6;

import java.util.Calendar;

public  class MidPriorityConcrete implements RequestProduct {
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
        this.priority = priority;
    }

    @Override
    public void setExpire(String expireDay) {
        // Set expire to one month from current day
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        this.expireDay = String.format("%1$td/%1$tm/%1$tY", calendar);
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accepted, estimated completion date is " + expireDay);
    }
}
class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    RequestProduct createRequest() {
        
        return new MidPriorityConcrete();
    }
}
