import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GitHubAccountTest<UserName> {

    private GitHubAccount account;
    private UserName userName;
//    private Name name;
//    private Repositories repositories;
//    private AccountType accountType;



    @Before
    public void before(){
        account = new GitHubAccount("Bobby"); //, "Money App", 5, AccountType.FREE);
    }

    @Test
    public void checkCanGetUserName(){
        assertEquals("Bobby", account.canGetUserName());

    }

}
