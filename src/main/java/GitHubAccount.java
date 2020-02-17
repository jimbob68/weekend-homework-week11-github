public class GitHubAccount {
    private String userName;
    private String name;
    private int repositories;
//    private AccountType accountType;

    public GitHubAccount(String userName, String name, int repositories){
        this.userName = userName;
        this.name = name;
        this.repositories = repositories;
//        this.accountType = accountType;
    }

    public String canGetUserName(){
        return this.userName;
    }

    public String canGetName() {
        return this.name;
    }

    public int canGetRepositoryNumber() {
        return this.repositories;
    }
}
