package evaluation;

public class Q07Banking
{
	String  name;
	String accountNumber;
	int balance;
	
	
    public Q07Banking(String name, String accountNumber, int balance)
	{
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(int deposit) {
    	balance += deposit;
    	System.out.println(deposit+"원이 입금됨");
    }
    
    public void withdraw(int withdraw) {
    	balance -= withdraw;
    	System.out.println("계좌에서 "+withdraw+"원이 출금됨");
    }
    
    public void showAccount() {
    	System.out.println("계좌주:"+name);
    	System.out.println("계좌번호:"+accountNumber);
    	System.out.println("잔고:"+balance);
    }
	
	public static void main(String[] args)
	{
		Q07Banking banking = new Q07Banking("장동건", "123-45-67890", 10000);
        banking.deposit(5000);
        banking.withdraw(9000);
        banking.showAccount();
	}
}
