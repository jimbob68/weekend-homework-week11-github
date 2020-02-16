import java.util.ArrayList;

public class Repository<CommitRecord> {


    private RepoType type;
    private String name;
    private String description;
    private ArrayList commitRecord;

    public  Repository(String name, String description, RepoType type, int i) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.commitRecord = new ArrayList<CommitRecord>();
    }

    
    public String getName() {
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public RepoType GetRepoType() {
        return this.type;
    }

    public ArrayList getCommitRecord(CommitRecord commitRecord){
          return this.commitRecord;
    }


}
