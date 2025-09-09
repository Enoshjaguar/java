public class Hello{
    int count = 10;
    public static void main(String args[]){
        System.out.println("This is main method");
        Hello shanthi = new Hello();
    shanthi.greet();
    shanthi.out();
    }
    



    void greet(){
        int count = 10;
        System.out.println("this is inside greet "+count);
        

    }

    void out(){
        System.out.println("this is out");

        
    }
}