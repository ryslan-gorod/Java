package calcconsole.hw02;

public class EurDepositCreater extends DepositCreater {
    @Override
    public void setDepositCurrency() {
        deposit.setCurrency("EUR");
    }

    @Override
    public void setDepositCountMonth() {
        deposit.setCountMonth(1);
    }

    @Override
    public void setDepositRate() {
        deposit.setRate(1.5);
    }

    @Override
    public void setDepositSum() {
        deposit.setSum(500);
    }
}
