import com.bank.repository.AccountRepository;
import com.bank.service.AccountService;
import com.bank.service.UserService;

public class Main {

    public static void main(String[] args){

        AccountService accountService = new AccountService();

//        accountService.createAccount("parth","solanki","1234567890","SAVING");
//
//        accountService.createAccount("vishal","solanki","1234567890","CURRENT");

//        System.out.println(accountService.getAllAccounts().toString());

//        UserService userService = new UserService();
//
//        userService.addAadharCardNo(1,"aadhar1");

        System.out.println(accountService.getAllAccounts().toString());
    }


}
