package NewLab6;

public class Main {
    public static void main(String[] args) {
        System.out.println();
       

        RequestCreator creator3 = new LowPriorityConcreteCreator();
        RequestProduct request3 = creator3.createRequest();
        request3.setPriority("Ignore"); 
        request3.processRequest();
       
        
        RequestCreator creator2 = new MidPriorityConcreteCreator();
        RequestProduct request2 = creator2.createRequest();
        request2.setPriority("Medium"); 
        request2.setExpire(""); // Call setExpire("") to set the expireDay field
        request2.processRequest();


        RequestCreator creator = new HiPriorityConcreteCreator();
        RequestProduct request = creator.createRequest();
        request.setPriority("Emergency"); 
        request.processRequest();



    }
}