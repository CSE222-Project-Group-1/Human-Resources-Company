package src;
/**
 * @author Group1
 * Abstract user class that contains basic info of an user.
 */
public abstract class Users implements Comparable, UsersInterface{
    private String name;
    private int userID;
    private String password;
    private int type;
    protected static final int HUMAN_SOURCES = 1;
    protected static final int CANDIDATE = 2;
    protected static final int ADMIN = 3;
    protected static final int COMPANY = 4;

    /**
     * 
     * @param userID email of user
     * @param name Name of user
     * @param password password of user
     */
    public Users(int userID, String name, String password, int type){
        this.userID = userID;
        this.password = password;
        this.type = type;
    }

    /**
     * @return name of user.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets name of user
     * @param name name of user.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return id of user
     */
    @Override
    public int getUserID(){
        return userID;
    }

    /**
     * Sets user id.
     * @param userID id of user
     */
    @Override
    public void setUserID(int userID){
        this.userID = userID;
    }

    /**
     * @return password of user.
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password sets password.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * return type of user.
     */
    @Override
    public int getType(){
        return type;
    } 

    @Override
	public int compareTo(Users user) {
        if(userID > user.getUserID() )
            return 1;
        else if(userID < user.getUserID())
            return -1;
        else
            return 0;    
	}

    public boolean equals(Users user){
        return compareTo(user);
    }
    
}