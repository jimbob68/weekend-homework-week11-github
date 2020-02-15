public class CommitMessage {

    private String description;
    private String uniqueId;

    public CommitMessage(String commitMessage, String uniqueId){
        this.description =  commitMessage;
        this.uniqueId = uniqueId;
    }



    public String getCommit() {
        return this.description;
    }
    public String getUniqueId(){
        return this.uniqueId;
    }
}
