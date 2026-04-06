public class throwException{
    public static void main(String[] args) {
        int age = 18;
        if(age<18){
            throw new ArithmeticException("not eligible for voting");
        }else{
            System.out.println("you are eligible to vote");
        }
    }}
    // throw works independently
