package calcconsole.hw02;

public abstract class DepositCreater {
    protected Deposit deposit;

    public void createNewDeposit() {
        deposit = new Deposit();
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public abstract void setDepositCurrency();

    public abstract void setDepositCountMonth();

    public abstract void setDepositRate();

    public abstract void setDepositSum();
}
