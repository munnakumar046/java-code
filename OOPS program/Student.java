class Account{
    private double balance=50000d;
    // public void display()
    // {
    //     System.out.println(balance);
    // }
}
class Student {
    public static void main(String[] args)
    {
        Account account=new Account();
        System.out.println(account.balance);
        // account.display();
    }
    
} 
// when the access private value first of all the create method then call