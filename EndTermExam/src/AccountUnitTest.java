import org.junit.jupiter.api.Test;

public class AccountUnitTest
{
    public static void main(String[] args)
    {
        @Test
        Account[] accountUnitTest = new Account[10];

        accountUnitTest[0] = new Checking(11);
        accountUnitTest[1] = new Checking(12);
        accountUnitTest[2] = new Checking(13);
        accountUnitTest[3] = new Checking(14);
        accountUnitTest[4] = new Checking(15);
        accountUnitTest[5] = new Savings(21, 1.0);
        accountUnitTest[6] = new Savings(22, 1.1);
        accountUnitTest[7] = new Savings(23, 1.2);
        accountUnitTest[8] = new Savings(24, 1.3);
        accountUnitTest[9] = new Savings(25, 1.4);

        for(int i = 0; i < accountUnitTest.length; ++i)
            System.out.println(accountUnitTest[i].getAccountInfo() + "\n");
    }
}