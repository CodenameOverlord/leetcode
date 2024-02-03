package designPatter;

public class IciciBank implements Bank {
    @Override
    public String getStatement(String account) {
        return null;
    }

    @Override
    public String getCurrentBalance(String account) {
        return null;
    }

    @Override
    public Boolean isActive(String account) {
                 return isBankAccountICICIActive(account).equalsIgnoreCase("ACTIVE")?true:false
                ;
    }

    private String isBankAccountICICIActive(String account) {
        return "INACTIVE";
    }
}
