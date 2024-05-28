package  NewLab6.CSE305_LAB6;


import java.util.Calendar;

// Concrete Class: LowPriorityConcrete
public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

   

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public void setExpire(String expireDay) {
        // Set expire to current day
        Calendar calendar = Calendar.getInstance();
        this.expireDay = String.format("%1$td/%1$tm/%1$tY", calendar);
    }

    @Override
    public void setStatus(String status) {
        this.status = "Done";
    }

   @Override
public void processRequest() {
    System.out.println("Request denied. " );
}
}
class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    RequestProduct createRequest() {

        LowPriorityConcrete lowPriorityConcrete = new LowPriorityConcrete();
        // lowPriorityConcrete.setExpire(""); // Call setExpire() to set the expireDay field
        return lowPriorityConcrete;
    }
}
