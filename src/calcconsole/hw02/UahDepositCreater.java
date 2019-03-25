package calcconsole.hw02;

public class UahDepositCreater extends DepositCreater {

    @Override
    public void setDepositCurrency() {
        deposit.setCurrency("UAH");
    }

    @Override
    public void setDepositCountMonth() {
        deposit.setCountMonth(12);
    }

    @Override
    public void setDepositRate() {
        deposit.setRate(18.5);
    }

    @Override
    public void setDepositSum() {
        deposit.setSum(10000);
    }
}
