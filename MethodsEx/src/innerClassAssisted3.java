//anonymous inner class
abstract class AnonymousInnerClass {
       public abstract void display();
    }
    public class innerClassAssisted3 {
    public static void main(String[] args) {
    AnonymousInnerClass i = new AnonymousInnerClass() {
        
        @Override
        public void display() {
            // TODO Auto-generated method stub
            System.out.println("Inside anonymous inner class method");
        }
    };
          i.display();
       }
    }