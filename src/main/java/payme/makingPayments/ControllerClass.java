package payme.makingPayments;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerClass {

    List<Object> listOfUsers = new ArrayList<>();

    @GetMapping(value = "/")
    public String indexPage(){
        return "login";
    }

    @PostMapping(value = "/doRegistration")
    public String doingRegistration(UserData userData, Model model){
        listOfUsers.add(userData);
        userData.setUserId(listOfUsers.size());
        model.addAttribute("userName", userData.getUserName());
        System.out.println(userData.getUserFullName());
        System.out.println(userData.getUserPassword());
        System.out.println(userData.getUserEmail());
        System.out.println(userData.getUserName());
        return "dashboard";
    }

    @GetMapping(value = "/dashboard.html")
    public String showDashboard(){
        return "dashboard";
    }

    @GetMapping(value = "/icons.html")
    public String showIcons(){
        return "icons";
    }

    @GetMapping(value = "/map.html")
    public String showMap(){
        return "map";
    }

    @GetMapping(value = "/notifications.html")
    public String showNotifications(){
        return "notifications";
    }

    @GetMapping(value = "/rtl.html")
    public String showRtl(){
        return "rtl";
    }

    @GetMapping(value = "/typography.html")
    public String showTypography(){
        return "typography";
    }

      @GetMapping(value = "/upgrade.html")
    public String showUpgrade(){
        return "upgrade";
    }

    @GetMapping(value = "/tables.html")
    public String showTables(Model model, UserData userData){
        model.addAttribute(userData);
        model.addAttribute("users", listOfUsers);
        return "tables";
    }

    @GetMapping(value = "/user.html")
    public String showUser(){
        return "user";
    }
}
