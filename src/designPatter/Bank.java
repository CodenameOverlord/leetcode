package designPatter;

public interface Bank {

    String getStatement(String account);
    String getCurrentBalance(String account);
    Boolean isActive(String account);

}
