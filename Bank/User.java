package Bank;

public class User {
    private String name,pass;
    public User(String name,String pass){
        this.name=name;
        this.pass=pass;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return pass;
    }
}
