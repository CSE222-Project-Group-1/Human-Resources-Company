package src;

public interface UsersInterface {

    /**
     * @return name of user.
     */
    public String getName();

    /**
     * Sets name of user
     * @param name name of user.
     */
    public void setName(String name);

    /**
     * @return id of user
     */
    public int getUserID();

    /**
     * Sets user id.
     * @param userID id of user
     */
    public void setUserID(int userID);

    /**
     * @return password of user.
     */
    public String getPassword();

    /**
     * @param password sets password.
     */
    public void setPassword(String password);

    /**
     * @return type of user.
     */
    public int getType();


}
