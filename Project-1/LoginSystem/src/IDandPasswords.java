import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){

        loginInfo.put("Assan","123456");
        loginInfo.put("Assan","123456");
        loginInfo.put("Assan","123456");
    }

    public HashMap getLoginInfo(){
        return loginInfo;
    }
}
