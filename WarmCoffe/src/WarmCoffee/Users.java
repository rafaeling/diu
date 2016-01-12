package WarmCoffee;

import java.util.ArrayList;
import java.util.HashMap;

public class Users {

    HashMap<String, User> userList = new HashMap<>();

    public Users() {
    }

    //returns true if user succsesfully added

    public boolean addUser(String name, String password, String email) {
        if (userList.containsKey(name)) {
            return false;
        } else {
            userList.put(name, new User(password, email));
            return true;
        }
    }

    public boolean addUser(String username, User user) {
        if (userList.containsKey(username)) {
            return false;
        } else {
            userList.put(username, user);
            return true;
        }
    }

    //removes user with given name

    public void removeUser(String name) {
        userList.remove(name);
    }

    //checks user with given name exists with given password

    public boolean checkUser(String name, String password) {
        String pass = userList.get(name).pass;
        if (pass != null && pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    //checks if user exists

    public boolean isUser(String name) {
        return userList.containsKey(name);
    }

    public User getUser(String name) {
        return userList.get(name);
    }

    public boolean modifyUser(String currentName, String newName, User user) {
        if (isUser(newName)) {
            return false;
        } else {
            ArrayList<Integer> events=getUser(currentName).events;
            removeUser(currentName);
            user.events=events;
            return addUser(newName, user);
        }
    }

}
