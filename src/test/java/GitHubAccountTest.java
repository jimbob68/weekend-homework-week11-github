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
    public void check_can_get_user_name(){
        assertEquals("Bobby", account.canGetUserName());
    }

    @Test
    public void check_can_get_name(){
        assertEquals("Robert Smith", account.canGetName());
   }
    @Test
    public void check_can_get_repository_number(){
        assertEquals(5, account.canGetRepositoryNumber());
    }
    @Test
    public void check_can_get_account_type(){
        assertEquals(AccountType.FREE, account.canGetAccountType());
    }



}
