public class ThreadingCode2 {
    public static void main(String[] args) {
        Operations op1 = new Operations();//not a thread
        Operations op2 = new Operations();//not a thread
        Operations op3 = new Operations();//not a thread
        Operations op4 = new Operations();//not a thread
        
        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op3);
        Thread t4 = new Thread(op4);
        
        t1.setName("Addition");
        t2.setName("Subtraction");
        t3.setName("Multiplication");
        t4.setName("Division");
        
        t1.start();//t1 is given to the scheduler
        t2.start();//t2 is given to the scheduler
        t3.start();//t3 is given to the scheduler
        t4.start();//t4 is given to the scheduler
        
        
    }
}
