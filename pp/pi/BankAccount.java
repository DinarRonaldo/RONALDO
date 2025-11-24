public class BankAccount {
	
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	
	private static final String BANK_NAME = "Национальный Банк";
	private static int totalAccounts; 
	
	public BankAccount() {
		setAccountNumber("Unknown");
		setOwnerName("Unknown");
        setBalance(0);
        setCurrency("RUB");
        setIsActive(false);
		totalAccounts++;
	}
	
	public BankAccount(String accountNumber, String ownerName) {
		setAccountNumber(accountNumber);
		setOwnerName(ownerName);
		setBalance(0);
        setCurrency("RUB");
        setIsActive(false);
		totalAccounts++;
	}
	
	 public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive) {
        setAccountNumber(accountNumber);
		setOwnerName(ownerName);
        setBalance(balance);
        setCurrency(currency);
        setIsActive(isActive);
		totalAccounts++;
    }
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setBalance(double balance) {
		if (balance <= 0) {
			System.out.println("Баланс не может быть отрицательным");
			return;
		}
		if (balance > 1000000000) {
			System.out.println("Баланс не должен превышать 1.000.000.000");
			return;
		}
		this.balance = balance;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public static double calculateInterest(double amount, double rate, int years) {
		double x = 1;
		for (int i = 0; i < years; i++) {
			x *= (1 + rate / 100.0);
		}
		return amount * x;
	}
	
	public void displayInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Владелец: " + ownerName);
        System.out.println("Баланс: " + balance);
        System.out.println("Валюта: " + currency);
        if (isActive == true) {
            System.out.println("Активен");
        } else {
            System.out.println("Заблокирован");
        }
	}
	
	public void displayInfo(boolean showStatus) {
		System.out.println("Номер счета: " + accountNumber);
        System.out.println("Владелец: " + ownerName);
        System.out.println("Баланс: " + balance);
        System.out.println("Валюта: " + currency);
		if (showStatus == true) {
			if (isActive == true) {
                System.out.println("Активен");
            } else {
                System.out.println("Заблокирован");
			}
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void deposit(double amount, String description) {
		balance += amount;
		System.out.println("Описание операции: " + description);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Новый баланс: " + balance + " " + currency);
	}
	
	public void withdraw(double amount, String purpose) {
		balance -= amount;
		System.out.println("Цель снятия: " + purpose);
	}
	
	public void activateAccount() {
		if (isActive == false) {
			isActive = true;
			System.out.println("Счет активирован");
		} else {
			System.out.println("Счет уже активирован");
		}
	}
	
	public void deactivateAccount() {
		if (isActive == true) {
			isActive = false;
			System.out.println("Счет заблокирован");
		} else {
			System.out.println("Счет уже заблокирован");
		}
	}
}