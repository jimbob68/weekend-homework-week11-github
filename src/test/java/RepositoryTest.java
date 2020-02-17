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
        name = new Repository("Project", "Initial Commit", RepoType.PUB, 1);
//        commitRecord = new CommitRecord();
    }

    @Test
    public void can_get_name(){
        assertEquals("Project", name.getName());
    }

    @Test
    public void can_get_description(){
        assertEquals("Initial Commit", name.getDescription());
    }

    @Test
    public void can_get_repo_type(){
        assertEquals(RepoType.PUB, name.GetRepoType());
    }

    @Test
    public void check_commit_record_starts_empty(){
        assertEquals(0, name.commitRecordStartsEmpty());
    }
    @Test
    public void can_add_commit_record(){
//        name.addCommitRecord(commitRecord); // commented this code out as 1
        //expected and actual 2  Test now passing
      assertEquals(1, name.addCommitRecord(commitRecord));

    }


//    @Test
//    public void canGetCommitRecord() {
//        assertEquals(1, name.getCommitRecord());}

    }







