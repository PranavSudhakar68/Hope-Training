public class throwsExample{
    public static void main(String[] uma){
   
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(string message){
    super(message);
    }
}
class bank{
    private double balance;
    void deposit(int amount) throws InsufficientBalanceException{
        if(amount >0){
balance += amount;
        }else if(amount<=0){
            throw new InsufficientBalanceException("amount cant be 0 or negative");
        }


    }
    void withdrawal(int amount) throws InsufficientBalance{
        if(amount <= balance){
            System.out.println("amount withdrawal is"+ amount);
            balance-=amount;
    }
    else{
       throw new insufficient("Balance insufficient");
    }
    }
    void getBalance(){
        System.out.println("Account balance is"+ balance);
    }
}