import java.util.ArrayList;

public class Repository<CommitRecord> {


    private RepoType type;
    private String name;
    private String description;
    private ArrayList <CommitMessage>commitRecord;

    public  Repository(String name, String description, RepoType type, int i) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.commitRecord = new ArrayList<CommitMessage>();
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

    public int checkCommitRecordStartsEmpty() {
        return this.commitRecord.size();
    }

//    public int getCommitRecord() {
//    }

//    public ArrayList getCommitRecord(CommitRecord commitRecord){
//          return this.commitRecord; }




}
