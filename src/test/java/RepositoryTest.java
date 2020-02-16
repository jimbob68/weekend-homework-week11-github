import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest<Description, CommitRecord> {
    private Repository name;
    private Description description;
    private RepoType type;
    private CommitRecord commitRecord;



    @Before
    public void before(){
        name = new Repository("Project", "Initial Commit", RepoType.PUB, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Project", name.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Initial Commit", name.getDescription());
    }

    @Test
    public void canGetRepoType(){
        assertEquals(RepoType.PUB, name.GetRepoType());
    }

    @Test
    public void canGetCommitRecord() {
        assertEquals(5, name.getCommitRecord());}

    }







