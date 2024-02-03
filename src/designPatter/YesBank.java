package designPatter;

public class YesBank implements  Bank{
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
        return isBankAccountActive(account)==3?true:false;
    }


    public int isBankAccountActive(String account){
        return 3;
        //3 = active 2 = inactive
    }
}
