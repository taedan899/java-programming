class GoodBankAccount {
    private int balance;

    public GoodBankAccount(){
        this.balance = 10000;

    }
    public int getBalnce(){
        return this.balance;
    }
    public void withdraw(int amount) {
        if ( amount > 0 && this.balance >= amount) {
            this.balance = this.balance - amount;
            System.out.println(amount + "원이 출금되었습니다.");
        }
        else{
            System.out.println("잔액이 부족하거나 출금액이 잘못되었습니다");
        }

    }
}


public class Main {
    public static void main(String[] args)
    {
        GoodBankAccount account = new GoodBankAccount();

        account.withdraw(5000);

        System.out.println("최종 잔액: "+ account.getBalnce() + "원");
    }
    
}
