package WarmCoffee;

import java.util.HashMap;

public class Users {

    HashMap<String,String> userList=new HashMap<>();
    public Users() {
    }
    //returns true if user succsesfully added
    public boolean addUser(String name,String password) {
        if(userList.containsKey(name)) return false;
        else {
            userList.put(name, password);
            return true;
        }
    }
    //removes user with given name
    public void removeUser(String name) {
        userList.remove(name);
    }
    //checks user with given name exists with given password
    public boolean checkUser(String name,String password) {
        String pass=userList.get(name);
        if(pass!=null && pass.equals(password)) return true;
        else return false;
    }
    //checks if user exists
    public boolean isUser(String name) {
        return userList.containsKey(name);
    }

}
