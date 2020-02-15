import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest<UniqueId> {
       private CommitMessage description;
       private UniqueId uniqueId;


    @Before
    public void before(){
        description  = new CommitMessage("Initial File Setup", "ABC123");

    }

    @Test
    public void can_get_commit(){
        assertEquals("Initial File Setup", description.getCommit());
    }
    
    @Test
    public void can_get_unique_id(){
        assertEquals("ABC123", description.getUniqueId());
    }




}
