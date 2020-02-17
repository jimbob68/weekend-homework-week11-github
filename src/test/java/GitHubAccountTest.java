import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GitHubAccountTest<UserName, Name, Repositories> {

    private GitHubAccount account;
    private UserName userName;
    private Name name;
    private Repositories repositories;
    private AccountType accountType;



    @Before
    public void before(){
        account = new GitHubAccount("Bobby" ,"Robert Smith", 5, AccountType.FREE);
    }

    @Test
    public void checkCanGetUserName(){
        assertEquals("Bobby", account.canGetUserName());
    }

    @Test
    public void checkCanGetName(){
        assertEquals("Robert Smith", account.canGetName());
   }
    @Test
    public void checkCanGetRepositoryNumber(){
        assertEquals(5, account.canGetRepositoryNumber());
    }
    @Test
    public void checkCanGetAccountType(){
        assertEquals(AccountType.FREE, account.canGetAccountType());
    }



}
