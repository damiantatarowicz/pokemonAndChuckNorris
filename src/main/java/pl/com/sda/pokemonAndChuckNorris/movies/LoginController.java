package pl.com.sda.pokemonAndChuckNorris.movies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    @RequestMapping("/loginPage")
    public String login(){
        return "loginPage";
    }
}
