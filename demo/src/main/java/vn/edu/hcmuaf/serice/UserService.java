package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private static Map<String,String> tmpUser = new HashMap<>();
    static {
        tmpUser.put("admin@gmail.com","admin");
        tmpUser.put("abc@gmail.com","123");
    }

    private static UserService instance;

    public static UserService getInstance(){
        if(instance==null) instance= new UserService();
        return instance;
    }

    public User checkLogin(String username, String password){
        if(!tmpUser.containsKey(username)) return  null;
        if(tmpUser.get(username).equals(password)){
            User u= new User();
            u.setFullname(username);
            u.setUsername(username);
            return u;
        }
        return null;
    }
}
