import java.util.ArrayList;

public class Repository<CommitRecord> {


    private RepoType type;
    private String name;
    private String description;
    private ArrayList<CommitRecord>commitRecords;

    public  Repository(String name, String description, RepoType type, int i) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.commitRecords = new ArrayList<CommitRecord>();
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

    public int commitRecordStartsEmpty() {
        return this.commitRecords.size();
    }

    public int addCommitRecord(CommitRecord commitRecord){
        this.commitRecords.add(commitRecord);
        return this.commitRecords.size();

//    }

//    public ArrayList<CommitRecord> addCommitRecord() {
//        if (this.commitRecords.size() < 100){
//            return this.commitRecords;
//        }
//
//        return null;
    }


}

//    public int checkCanAddCommitMessage() {
//        return this.commitRecord.size();
//    }

//    public ArrayList getCommitRecord(CommitRecord commitRecord){
//          return this.commitRecord; }




//}
