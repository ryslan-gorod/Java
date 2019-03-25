package calcconsole.hw02;

public class UsdDepositCreater extends DepositCreater {

    @Override
    public void setDepositCurrency() {
        deposit.setCurrency("USD");
    }

    @Override
    public void setDepositCountMonth() {
        deposit.setCountMonth(6);
    }

    @Override
    public void setDepositRate() {
        deposit.setRate(3.5);
    }

    @Override
    public void setDepositSum() {
        deposit.setSum(1000);
    }
}
