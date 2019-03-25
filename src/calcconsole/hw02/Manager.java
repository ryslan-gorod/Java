package calcconsole.hw02;

public class Manager {
    private DepositCreater depositCreater;

    public void setDepositCreater(DepositCreater depositCreater) {
        this.depositCreater = depositCreater;
    }

    public Deposit getDeposit() {
        return this.depositCreater.getDeposit();
    }

    public void makeDeposit() {
        depositCreater.createNewDeposit();
        depositCreater.setDepositCountMonth();
        depositCreater.setDepositCurrency();
        depositCreater.setDepositRate();
        depositCreater.setDepositSum();

    }
}
